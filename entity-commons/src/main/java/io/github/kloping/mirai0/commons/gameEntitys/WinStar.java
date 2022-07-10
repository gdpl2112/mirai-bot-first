package io.github.kloping.mirai0.commons.gameEntitys;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author github.kloping
 */
public class WinStar {
    public static final Color LEVEL0 = new Color(238, 234, 212);
    public static final Color LEVEL1 = new Color(220, 217, 66);
    public static final Color LEVEL2 = new Color(144, 67, 231);
    public static final Color LEVEL3 = new Color(231, 67, 72);
    public static final Color LEVEL4 = new Color(255, 145, 0);
    private static final Color[] COLORS = new Color[]{LEVEL0, LEVEL1, LEVEL2, LEVEL3, LEVEL4};
    private int num;
    public Map<Color, Integer> starMap = new HashMap<>();

    public WinStar(int num) {
        this.num = num;
    }

    public void flushMap() {
        int i0 = num;
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i0 >= 3) {
            i1++;
            i0 -= 3;
        }
        while (i1 >= 4) {
            i2++;
            i1 -= 4;
        }
        while (i2 >= 4) {
            i3++;
            i2 -= 4;
        }
        while (i3 >= 5) {
            i4++;
            i3 -= 5;
        }
        starMap.clear();
        if (i0 > 0) {
            starMap.put(LEVEL0, i0);
        }
        if (i1 > 0) {
            starMap.put(LEVEL1, i1);
        }
        if (i2 > 0) {
            starMap.put(LEVEL2, i2);
        }
        if (i3 > 0) {
            starMap.put(LEVEL3, i3);
        }
        if (i4 > 0) {
            starMap.put(LEVEL4, i4);
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Map<Color, Integer> getStarMap() {
        return starMap;
    }

    public void setStarMap(Map<Color, Integer> starMap) {
        this.starMap = starMap;
    }
}
