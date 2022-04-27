package io.github.kloping.game0;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.github.kloping.common.Public;
import io.github.kloping.file.FileUtils;
import io.github.kloping.io.ReadUtils;
import io.github.kloping.url.UrlUtils;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.*;
import java.net.URL;

/**
 * @author github.kloping
 */
public class Installer {
    public static Double local_version = 0.0;

    private static final boolean IS_WIN = System.getProperty("os.name").toLowerCase().contains("win");
    private static final boolean IS_LINUX = System.getProperty("os.name").toLowerCase().indexOf("linux") >= 0;


    public static void main(String[] args) {
        loadLocal();
        load();
    }

    private static void load() {
        JSONObject jo = JSON.parseObject(UrlUtils.getStringFromHttpUrl("https://gitee.com/kloping/mirai-bot-first/raw/master/classpath/update.json"));
        if (local_version < jo.getDouble("version")) {
            update(jo.getString("url"), jo.getInteger("size"));
        }
        start();
    }

    private static void start() {
        String sc = getStartCmd();
        File file = null;
        if (IS_WIN) {
            file = new File(PARENT, "start.bat");
        } else {
            file = new File(PARENT, "start.sh");
        }
        if (!file.exists())
            FileUtils.putStringInFile(sc, file);
        callAndOut(file);
    }

    private static String getStartCmd() {
        File f0 = new File(PARENT, "project/mirai-bot-first-master");
        File f1 = new File(PARENT, "project/mirai-bot-first-master/classpath");
        StringBuilder sb = new StringBuilder();
        if (IS_WIN) {
            sb.append("@echo off").append("\n")
                    .append("set java=%JAVA_HOME%/bin/java").append("\n")
                    .append("cd ").append(f0.getAbsolutePath()).append("\n")
                    .append("%java% -Dfile.encoding=UTF-8 -classpath ").append(f1.getAbsolutePath()).append("/*")
                    .append(" io.github.kloping.mirai0.Main.BotStarter").append("\n").append("pause");
        } else {
            sb.append("java=%JAVA_HOME%").append("\n")
                    .append("cd ").append(f0.getAbsolutePath()).append("\n")
                    .append("%java% -Dfile.encoding=UTF-8 -classpath ").append(f1.getAbsolutePath()).append("/*")
                    .append(" io.github.kloping.mirai0.Main.BotStarter");
        }
        return sb.toString();
    }

    private static void callAndOut(File file) {
        try {
            Runtime runtime = Runtime.getRuntime();
//            print(runtime.exec(new String[]{"cd", PARENT.getAbsolutePath()}));
//            print(runtime.exec(new String[]{"chdir"}));
            Process p0 = runtime.exec(file.getAbsolutePath());
            InputStream es = p0.getErrorStream();
            InputStream is = p0.getInputStream();
            out(es);
            out(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void out(InputStream is) {
        Public.EXECUTOR_SERVICE.submit(() -> {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                String line = null;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private static void update(String url, int max) {
        try {
            getLogger().info("start update");
            File file = new File(PARENT, "all.zip");
            byte[] bytes = new byte[1024 * 1024 * 3];
            InputStream is = new URL(url).openStream();
            int cur = 0;
            FileOutputStream fos = new FileOutputStream(file);
            int len = -1;
            while ((len = is.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
                cur += len;
                getLogger().info("download " + toPercent(cur, max) + "%");
            }
            unzip(file);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void unzip(File file) throws Exception {
        ZipUtils.unzip(file.getAbsolutePath(), new File(PARENT, "project").getAbsolutePath());
    }

    public static final File PARENT = new File("D:\\Projects\\OwnProjects\\MyMirai_01\\game-installer\\space");

    private static void loadLocal() {
        File file = new File(PARENT, "project/mirai-bot-first-master/pom.xml");
        try {
            if (file.exists()) {
                Document document = Jsoup.parse(FileUtils.getStringFromFile(file.getAbsolutePath()));
                Element e0 = document.getElementsByTag("project").get(0);
                Element e1 = e0.getElementsByTag("version").get(0);
                local_version = Double.parseDouble(e1.text());
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    /**
     * 计算百分比
     *
     * @param b b%
     * @param v
     * @return v 的 b%
     */
    public static Long percentTo(Integer b, Number v) {
        if (v.longValue() < 100) {
            float f = b / 100f;
            return (long) (f * (v.intValue()));
        }
        double d = v.longValue();
        d /= 100f;
        d *= b;
        long v1 = (long) d;
        return v1;
    }

    /**
     * @param v1
     * @param v2
     * @return v1/v2 => %
     */
    public static Integer toPercent(Number v1, Number v2) {
        double dv1 = (double) v1.longValue();
        double dv2 = (double) v2.longValue();
        double dv3 = dv1 / dv2;
        dv3 *= 100;
        int v3 = (int) dv3;
        return v3;
    }

    /**
     * 将l除以v 保留 d 位小数
     *
     * @param l
     * @param v
     * @param d
     * @return
     */
    public static String device(Long l, double v, int d) {
        double f = l / v;
        return String.format("%." + d + "f", f);
    }

    public static final Logger getLogger() {
        return Logger.getLogger(Installer.class);
    }

    public static String[] print(Process exec) throws IOException {
        try {
            exec.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        InputStream is = exec.getInputStream();
        String s1 = new String(ReadUtils.readAll(is));
        InputStream es = exec.getErrorStream();
        String s2 = new String(ReadUtils.readAll(es));
        return new String[]{s1, s2};
    }
}
