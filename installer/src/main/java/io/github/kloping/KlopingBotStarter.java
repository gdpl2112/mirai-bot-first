package io.github.kloping;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import static io.github.kloping.Starter.getMainJar;

/**
 * @author github-kloping
 */
public class KlopingBotStarter {
    public static void main(String[] args) throws Throwable {
        URL url = getMainJar(args[0]);
        URLClassLoader classLoader = new URLClassLoader(new URL[]{url}, ClassLoader.getSystemClassLoader());
        try {
            Class c0 = classLoader.loadClass("io.github.kloping.MySpringTool.StarterApplication");
            Field field = c0.getDeclaredField("SCAN_LOADER");
            field.setAccessible(true);
            field.set(null, classLoader);
            Class cla = classLoader.loadClass("io.github.kloping.mirai0.Main.BotStarter");
            Method method = cla.getDeclaredMethod("main", String[].class);
            method.setAccessible(true);
            method.invoke(null, (Object) new String[]{});
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}