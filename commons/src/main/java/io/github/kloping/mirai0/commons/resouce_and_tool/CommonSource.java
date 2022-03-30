package io.github.kloping.mirai0.commons.resouce_and_tool;

import java.security.SecureRandom;
import java.util.Random;

/**
 * @author github.kloping
 */
public class CommonSource {

    public static final Random RANDOM = new SecureRandom();

    /**
     * 获取格式img
     *
     * @param path
     * @return
     */
    public static String pathToImg(String path) {
        return "<Pic:" + path + ">";
    }

    /**
     * 计算百分比
     *
     * @param b b%
     * @param v
     * @return v 的 b%
     */
    public final static Long percentTo(Integer b, Number v) {
        if (v.longValue() < 100) {
            float f = b / 100f;
            return (long) (f * (v.intValue()));
        }
        double d = v.longValue();
        d /= 100;
        d *= b;
        long v1 = (long) d;
        return v1;
    }

    /**
     * @param v1
     * @param v2
     * @return v1/v2 => %
     */
    public final static Integer toPercent(Number v1, Number v2) {
        double dv1 = (double) v1.longValue();
        double dv2 = (double) v2.longValue();
        double dv3 = dv1 / dv2;
        dv3 *= 100;
        int v3 = (int) dv3;
        return v3;
    }

    /**
     * 将指定数字转为指定位数字符
     * (2,9)  => 09
     *
     * @param i
     * @param value
     * @return
     */
    public static String toStr(int i, int value) {
        String s0 = Integer.toString(value);
        while (s0.length() < i) {
            s0 = "0" + s0;
        }
        return s0;
    }
}
