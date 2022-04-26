package io.github.kloping.game0;

import java.io.File;

import static io.github.kloping.game0.ClassPathJarLoader.loadLibs;
import static io.github.kloping.game0.ResourceLoader.loadResource;

/**
 * @author github.kloping
 */
public class Installer {
    public static void main(String[] args) {
        File file = new File("D:\\Projects\\OwnProjects\\MyMirai_01\\game-installer\\space");
        loadLibs(new File(file, "classpath").getAbsolutePath());
        loadResource(file.getAbsolutePath());
        loadSrc(file);
    }

    private static void loadSrc(File file) {
    }
}
