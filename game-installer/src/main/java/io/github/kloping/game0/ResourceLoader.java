package io.github.kloping.game0;

import io.github.kloping.game0.entity.gitee.Folder;
import io.github.kloping.game0.entity.gitee.GiteeFile;
import io.github.kloping.game0.entity.gitee.Item;
import org.apache.log4j.Logger;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author github.kloping
 */
public class ResourceLoader {
    public static final String BASE0 =
//            "https://gitee.com/kloping/mirai-bot-first/tree/master/images";
            "https://gitee.com/kloping/mirai-bot-first";
    public static final String BASE1 = "https://gitee.com/kloping/mirai-bot-first/raw/master/.ignoreItems";
    public static final List<String> IGNORE_ITEMS = new ArrayList<>();
    public static final String IGNORE_ITEMS_NAME = ".ignoreItems";

    public static void loadResource(String path) {
        Logger.getLogger(ResourceLoader.class).info("start check resource ");
        try {
            GiteeFile gf = new GiteeFile();
            gf.setDownloadUrl(BASE1);
            for (String line : gf.getLines()) {
                IGNORE_ITEMS.add(line.trim());
            }
            Folder folder = GiteeLoader.get(BASE0, IGNORE_ITEMS);
            loadResource(path, BASE0,folder);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Logger.getLogger(ResourceLoader.class).info("check resource complete");
    }

    private static void loadResource(String path, String base0) {
        try {
            Folder folder = GiteeLoader.get(base0);
            loadResource(path, base0, folder);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void loadResource(String path, String base0, Folder folder) {
        try {
            File pFile = new File(path);
            for (Item item : folder.items) {
                if (IGNORE_ITEMS.contains(item.getName())) continue;
                if (item instanceof GiteeFile) {
                    GiteeFile file = (GiteeFile) item;
                    File f1 = new File(pFile, file.getName());
                    if (f1.exists()) continue;
                    GiteeLoader.downloadFile(file.getDownloadUrl(), f1, null);
                } else {
                    Folder f0 = (Folder) item;
                    File f1 = new File(pFile, f0.getName());
                    f1.mkdirs();
                    loadResource(f1.getAbsolutePath(), f0.path);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
