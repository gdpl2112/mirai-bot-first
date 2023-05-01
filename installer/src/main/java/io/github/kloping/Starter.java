package io.github.kloping;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import static io.github.kloping.Utils.*;

/**
 * @author github.kloping
 */
public class Starter {
    public static final String HOST = "http://kloping.top";
    public static final String DIR = "./mirai-bot-first";
    public static final String CONFIG_FILE = "./conf/conf.txt";
    public static final Scanner SC = new Scanner(System.in);
    public static String code = "";
    public static File F0;
    public static Process process = null;
    public static final String YC0 = "./temp/s/yc0.jpg";
    public static final String YC1 = "./temp/s/yc1.jpg";
    public static final File FILE_PID = new File("./pid");
    public static String SPLIT_CHAR = "";


    public static void main(String[] args) throws Exception {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            F0.delete();
            if (process != null) {
                process.destroy();
            }
        }));
        if (isWindows()) {
            SPLIT_CHAR = "\\";
        } else if (isLinux()) {
            SPLIT_CHAR = "/";
        }
        if (new File(CONFIG_FILE).exists()) {
            for (String read : reads(CONFIG_FILE)) {
                try {
                    if (read.startsWith("auth_code")) {
                        code = read.split("=")[1];
                        break;
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }
        if (code.isEmpty()) {
            System.out.println("请输入授权码");
            code = SC.nextLine().trim();
        }
        copyDefaultConfig();
        deleteUp();
        F0 = createTempFileByUrl(getMainJar(code));
        write(YC0, F0.getAbsolutePath());
        write(YC1, getJarsLine() + F0.getAbsolutePath());
        if (F0 == null || !F0.exists()) {
            System.out.println("文件拉取失败;可能授权码过期(File pull failed; The authorization code may have expired)");
            return;
        }
        System.out.println("启动文件准备完成...(Boot file ready to complete...)\n启动中...(Booting...)");
    }

    private static String getJarsLine() throws Exception {
        File file = null;
        String mrp = null;
        if (isWindows()) {
            file = new File(DIR, "commandLine/start.libs.line");
            String userDir = System.getProperties().get("user.home").toString();
            userDir = userDir.replaceAll("\\\\", "\\\\");
            mrp = userDir + "\\.m2\\repository";
        } else if (isLinux()) {
            file = new File(DIR, "commandLine/start.libs.line0");
            String userDir = System.getProperties().get("user.home").toString();
            mrp = userDir + "/.m2/repository";
        }
        String line0 = readAllAsString(new FileInputStream(file));
        return line0.trim().replaceAll("%mrp%", mrp);
    }

    public static boolean isLinux() {
        return System.getProperty("os.name").toLowerCase().contains("linux");
    }

    public static boolean isWindows() {
        return System.getProperty("os.name").toLowerCase().contains("windows");
    }

    private static void deleteUp() throws IOException {
        File file = new File(YC0);
        if (file.exists()) {
            String fn1 = readAllAsString(new FileInputStream(file)).trim();
            File upF0 = new File(fn1);
            System.out.println("delete temp file status ");
            System.out.print(upF0.delete());
            System.out.print(" ");
            System.out.println(file.delete());
        }
    }

    private static File createTempFileByUrl(URL mainJar) {
        try {
            byte[] bytes = null;
            URLConnection connection = mainJar.openConnection();
            InputStream is = connection.getInputStream();
            bytes = readAll(is);
            File file = File.createTempFile("temp", ".zip");
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(bytes);
            fos.close();
            return file;
        } catch (Throwable e) {
            System.out.println("use old file");
            e.printStackTrace();
            return null;
        }
    }

    public static URL getMainJar(String code) {
        try {
            byte[] bytes = null;
            URL url = new URL(HOST + "/verify1?code=" + code);
            URLConnection connection = url.openConnection();
            InputStream is = connection.getInputStream();
            bytes = readAll(is);
            String fileName = new String(bytes, "utf-8").trim();
            URL u0 = new URL(HOST + "/" + fileName);
            return u0;
        } catch (Throwable e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void copyDefaultConfig() throws IOException {
        new File("./conf").mkdirs();
        copy(DIR + "/conf/conf_template.txt", "./conf/conf.txt", false);
        copy(DIR + "/application.yml", "./application.yml", false);
        copy(DIR + "/superQList.txt", "./superQList.txt", false);
        copyPlus(DIR + "/images", "./", true);
        if (!readAllAsString(new FileInputStream(CONFIG_FILE)).contains("auth_code="))
            appendLine("./conf/conf.txt", "\nauth_code=" + code);
    }

}
