package io.github.kloping;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
    public static File f0;
    public static Process process = null;
    public static final String FN0 = "./temp/s/695a1bc8-cf47-4b1d-856f-1c4c01e825b1.jpg";
    public static final File FILE_PID = new File("./pid");

    public static void main(String[] args) throws Exception {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            deleteF0();
            if (process != null) {
                process.destroy();
            }
        }));
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
        StringBuilder sb = new StringBuilder();
        sb.append(getJarsLine());
        copyDefaultConfig();
        f0 = createTempFileByUrl(getMainJar(code));
        if (f0 != null) {
            deleteUp();
            appendLine(FN0, f0.getName());
        } else {
            File file = new File(FN0);
            if (file.exists()) {
                String tempDir = System.getProperty("java.io.tmpdir");
                String fn1 = readAllAsString(new FileInputStream(file)).trim();
                f0 = new File(tempDir, fn1);
            }
        }
        sb.append(f0.getAbsolutePath());
        List<String> execArgs = new ArrayList<>();
        System.out.println("正在启动....");
        String javaBin = System.getProperties().getProperty("java.home") + "/bin/java";
        execArgs.add(javaBin);
        execArgs.add("-Dfile.encoding=UTF-8");
        execArgs.add("-classpath");
        execArgs.add(sb.toString());
        execArgs.add("io.github.kloping.mirai0.Main.BotStarter");
        execArgs.add(code);
        process = Runtime.getRuntime().exec(execArgs.toArray(new String[0]));
        outE(process.getErrorStream());
        out(process.getInputStream());
        if (FILE_PID.exists())
            FILE_PID.delete();
        write(FILE_PID.getAbsolutePath(), String.valueOf(process.pid()));
    }

    private static void deleteUp() throws IOException {
        File file = new File(FN0);
        if (file.exists()) {
            String tempDir = System.getProperty("java.io.tmpdir");
            String fn1 = readAllAsString(new FileInputStream(file)).trim();
            File upF0 = new File(tempDir, fn1);
            System.out.println("delete temp file status ");
            System.out.print(upF0.delete());
            System.out.print(" ");
            System.out.print(file.delete());
        }
    }

    private static File createTempFileByUrl(URL mainJar) {
        try {
            byte[] bytes = readAll(mainJar.openStream());
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

    private static void outE(InputStream errorStream) {
        new Thread(() -> {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(errorStream));
                String line = null;
                while ((line = reader.readLine()) != null) {
                    System.err.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    private static void out(InputStream is) {
        new Thread(() -> {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                String line = null;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    private static void deleteF0() {
//        f0.delete();
    }

    private static void copyDefaultConfig() throws IOException {
        new File("./conf").mkdirs();
        copy(DIR + "/conf/bots.conf_template.json", "./conf/bots.conf.json", false);
        copy(DIR + "/conf/conf_template.txt", "./conf/conf.txt", false);
        copy(DIR + "/application.yml", "./application.yml", false);
        copy(DIR + "/superQList.txt", "./superQList.txt", false);
        copyPlus(DIR + "/spring", "./", false);
        copyPlus(DIR + "/images", "./", true);
        new File("./devices").mkdirs();
        if (!readAllAsString(new FileInputStream(CONFIG_FILE)).contains("auth_code="))
            appendLine("./conf/conf.txt", "\nauth_code=" + code);
    }

    public static URL getMainJar(String code) {
        try {
            String fileName = readAllAsString(openUrl(HOST + "/verify1?code=" + code));
            return new URL(HOST + "/" + fileName);
        } catch (Throwable e) {
            return null;
        }
    }

    private static String getJarsLine() {
        File file = new File(DIR, "commandLine/start.libs.line");
        try {
            String userDir = System.getProperties().get("user.home").toString();
            userDir = userDir.replaceAll("\\\\", "\\\\\\\\");
            String mrp = userDir + "/.m2/repository";
            String line0 = readAllAsString(new FileInputStream(file));
            return line0.trim().replaceAll("%mrp%", mrp);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
