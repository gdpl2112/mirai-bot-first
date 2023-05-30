package io.github.kloping;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

/**
 * @author github.kloping
 */
public class Utils {
    /**
     * 读取文件
     *
     * @param path
     * @return
     * @throws IOException
     */
    public static String[] reads(String path) throws IOException {
        List<String> ls = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path)), "UTF-8"));
        String line = null;
        while ((line = br.readLine()) != null) {
            ls.add(line);
        }
        br.close();
        return ls.toArray(new String[0]);
    }

    /**
     * 开启流
     *
     * @param url
     * @return
     */
    public static InputStream openUrl(String url) throws IOException {
        URL u0 = new URL(url);
        return u0.openStream();
    }

    public static String readAllAsString(InputStream is) throws IOException {
        return new String(readAll(is), "utf-8");
    }

    public static byte[] readAll(InputStream is) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int len = -1;
        byte[] bytes = new byte[1024 * 1024];
        while (true) {
            try {
                if (((len = is.read(bytes)) < 0)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            baos.write(bytes, 0, len);
        }
        is.close();
        return baos.toByteArray();
    }

    /**
     * 复制文件夹
     *
     * @param src
     * @param target
     * @param override 覆盖
     */
    public static void copyPlus(String src, String target, boolean override) {
        File file = new File(src);
        if (!file.exists()) return;
        File endfile = new File(target + "\\\\" + file.getName());
        endfile.mkdirs();
        for (File f : file.listFiles()) {
            if (f.isFile()) {
                copy(f.getAbsolutePath(), endfile.getAbsolutePath() + "\\\\" + f.getName(), override);
            } else {
                copyPlus(f.getAbsolutePath(), endfile.getAbsolutePath(), override);
            }
        }
    }

    /**
     * 复制文件
     *
     * @param src
     * @param target
     * @param override 覆盖
     */
    public static void copy(String src, String target, boolean override) {
        if (!override && new File(target).exists()) return;
        if (!new File(src).exists()) return;
        BufferedInputStream dis = null;
        BufferedOutputStream dos = null;
        try {
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(target);
            dis = new BufferedInputStream(fis);
            dos = new BufferedOutputStream(fos);
            byte[] b = new byte[1024];
            int len = 0;
            while ((len = dis.read(b)) != -1) {
                dos.write(b, 0, len);
                dos.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dos != null) {
                    dos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (dis != null) {
                    dis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 添加一行
     *
     * @param fillname
     * @param line
     * @throws IOException
     */
    public static void appendLine(String fillname, String line) throws IOException {
        File file = new File(fillname);
        file.getParentFile().mkdirs();
        PrintWriter pw = new PrintWriter(new FileWriter(fillname, true));
        pw.println(line);
        pw.close();
    }

    public static void write(String fillname, String line) throws IOException {
        File file = new File(fillname);
        file.getParentFile().mkdirs();
        FileWriter fw = new FileWriter(fillname, false);
        fw.write(line);
        fw.close();
    }

    public static boolean isLinux() {
        return System.getProperty("os.name").toLowerCase().contains("linux");
    }

    public static boolean isWindows() {
        return System.getProperty("os.name").toLowerCase().contains("windows");
    }

    public static String getAbsPath(File f0) {
        String path = f0.getAbsolutePath();
        File of = f0;
        while (true) {
            File pf = of.getParentFile();
            if (pf == null) break;
            String fn = pf.getName();
            if (fn.contains("~")) {
                String p0 = fn.substring(0, 6);
                for (File file : pf.getParentFile().listFiles()) {
                    String fn0 = file.getName();
                    if (fn.length() < 6) continue;
                    if (fn0.substring(0, 6).toUpperCase().equals(p0)) {
                        path = path.replace(fn, fn0);
                        break;
                    }
                }
            }
            of = pf;
        }
        return path;
    }

    public static final DocumentBuilderFactory FACTORY = DocumentBuilderFactory.newInstance();

    public static String getMavenRepo() throws Exception {
        String mvns = null;
        if (isWindows()) {
            Process process = Runtime.getRuntime().exec("where mvn");
            String mvnp = readAllAsString(process.getInputStream());
            mvnp = mvnp.split("\n")[0].trim();
            mvns = mvnp.replace("\\bin\\mvn", "\\conf\\settings.xml");
        } else if (isLinux()) {
            Process process = Runtime.getRuntime().exec("which mvn");
            String mvnp = readAllAsString(process.getInputStream());
            mvnp = mvnp.split("\n")[0].trim();
            mvns = mvnp.replace("/bin/mvn", "/conf/settings.xml");
        }
        DocumentBuilder db = FACTORY.newDocumentBuilder();
        Document doc = doc = db.parse(Files.newInputStream(Path.of(mvns)));
        Element element = doc.getDocumentElement();
        NodeList list = element.getElementsByTagName("localRepository");
        Node node = list.item(0);
        if (node == null) {
            File dir = new File(System.getProperty("user.home"), ".m2");
            return dir.getAbsolutePath();
        }
        String value = node.getTextContent();
        return value;
    }
}
