package io.github.kloping.mirai0.commons.uitls;

import java.io.*;

/**
 * @author github.kloping
 */
public class FileDirUtils {

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
     * 复制文件夹里
     *
     * @param src
     * @param target
     * @param override 覆盖
     */
    public static void copyEves(String src, String target, boolean override) {
        File file = new File(src);
        if (!file.exists()) return;
        File endfile = new File(target);
        endfile.mkdirs();
        for (File f : file.listFiles()) {
            if (f.isFile()) {
                copy(f.getAbsolutePath(), new File(endfile, f.getName()).getAbsolutePath(), override);
            } else {
                copyEves(f.getAbsolutePath(), new File(endfile, f.getName()).getAbsolutePath(), override);
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
}
