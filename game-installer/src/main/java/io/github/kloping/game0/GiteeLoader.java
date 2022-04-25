package io.github.kloping.game0;

import io.github.kloping.game0.entity.gitee.Folder;
import io.github.kloping.game0.entity.gitee.GiteeFile;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import static io.github.kloping.common.Public.EXECUTOR_SERVICE;
import static io.github.kloping.judge.Judge.isEmpty;

/**
 * @author github.kloping
 */
public class GiteeLoader {
    public static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.127 Safari/537.36 Edg/100.0.1185.50";
    public static final String E1_CLASS = "tree-list-item";
    public static final String E0_ATTR_TAG = "data-type";
    public static final String FOLDER = "folder";
    public static final String FILE = "file";
    public static final String BASE = "https://gitee.com";
    public static final String R0 = "blob";
    public static final String R1 = "raw";

    public static Folder get(String url) throws Exception {
        return get(url, null);
    }

    public static Folder get(String url, List<String> ignoreItems) throws Exception {
        Folder folder = new Folder();
        folder.setPath(url);
        load(folder, ignoreItems);
        return folder;
    }

    private static void load(Folder folder, List<String> ignoreItems) throws IOException {
        Document doc = Jsoup.connect(folder.getPath())
                .userAgent(USER_AGENT).get();
        for (Element e1 : doc.getElementsByClass(E1_CLASS)) {
            String type = e1.parent().attr(E0_ATTR_TAG);
            Element ea = e1.getElementsByTag("a").get(0);
            String name = ea.attr("title");
            String u0 = ea.attr("href");
            String path = BASE + u0;
            if (ignoreItems != null) {
                if (ignoreItems.contains(name)) continue;
            }
            if (FOLDER.equals(type)) {
                Folder f0 = new Folder();
                f0.setPath(path);
                f0.setName(name);
                load(f0, ignoreItems);
                folder.addItem(f0);
            } else {
                GiteeFile file = new GiteeFile();
                file.setName(name);
                file.setPath(path);
                file.setDownloadUrl(path.replaceFirst(R0, R1));
                folder.addItem(file);
            }
        }
    }

    public static void downloadFile(String urlStr, java.io.File file, CountDownLatch cdl) {
        EXECUTOR_SERVICE.submit(() -> {
            try {
                if (file == null || isEmpty(urlStr)) return;
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                startDownload(urlStr, baos);
                file.getParentFile().mkdirs();
                file.createNewFile();
                FileOutputStream fos = new FileOutputStream(file);
                fos.write(baos.toByteArray());
                fos.close();
                Logger.getLogger(GiteeLoader.class).info(file + " download ok");
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (cdl != null) cdl.countDown();
        });
    }

    private static void startDownload(String urlStr, ByteArrayOutputStream baos) throws IOException {
        InputStream is = new URL(urlStr).openStream();
        byte[] bytes = new byte[1024 * 1024];
        int len = -1;
        while ((len = is.read(bytes)) != -1) {
            baos.write(bytes, 0, len);
        }
        is.close();
    }
}
