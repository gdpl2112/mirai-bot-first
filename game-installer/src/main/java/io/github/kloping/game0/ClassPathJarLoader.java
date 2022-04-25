package io.github.kloping.game0;

import io.github.kloping.game0.entity.gitee.Folder;
import io.github.kloping.game0.entity.gitee.GiteeFile;
import io.github.kloping.game0.entity.gitee.Item;
import org.apache.log4j.Logger;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import static io.github.kloping.common.Public.EXECUTOR_SERVICE;
import static io.github.kloping.game0.GiteeLoader.downloadFile;
import static io.github.kloping.judge.Judge.isEmpty;

/**
 * @author github.kloping
 */
public class ClassPathJarLoader {
    public static final String BASE0 = "https://gitee.com/kloping/game0-classpath";

    public static void loadLibs(String s) {
        Logger.getLogger(ClassPathJarLoader.class).info("start check classpath jar libs");
        List<Item> libs = getMissLibs(s);
        if (!libs.isEmpty()) {
            Logger.getLogger(ClassPathJarLoader.class).info("start download miss jars");
            CountDownLatch cdl = new CountDownLatch(libs.size());
            for (Item lib : libs) {
                if (lib instanceof GiteeFile) {
                    GiteeFile f0 = (GiteeFile) lib;
                    File file = new File(s, lib.getName());
                    downloadFile(f0.getDownloadUrl(), file, cdl);
                }
            }
            try {
                cdl.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Logger.getLogger(ClassPathJarLoader.class).debug("check classpath jar libs complete");
    }

    private static List<Item> getMissLibs(String s) {
        List<GiteeFile> local = getLocalLibs(s);
        Folder folder = null;
        try {
            folder = GiteeLoader.get(BASE0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<Item> libs = folder.items;
        for (GiteeFile s1 : local) {
            if (libs.contains(s1)) {
                libs.remove(s1);
            }
        }
        return libs;
    }

    private static List<GiteeFile> getLocalLibs(String s) {
        List<GiteeFile> libs = new ArrayList<>();
        String name = "";
        java.io.File file = new java.io.File(s);
        if (!file.exists()) return libs;
        for (java.io.File listFile : file.listFiles()) {
            name = listFile.getName();
            GiteeFile f0 = new GiteeFile();
            f0.setName(name);
            libs.add(f0);
        }
        return libs;
    }

}
