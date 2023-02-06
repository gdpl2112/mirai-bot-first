package io.github.kloping.mirai0.commons;


import static io.github.kloping.mirai0.commons.resouce_and_tool.CommonSource.RANDOM;

/**
 * @author HRS-Computer
 */

public enum Mora {
    A("石头"), B("剪刀"), C("布");

    private final String value_;

    Mora(String string) {
        this.value_ = string;
    }

    public static Mora findMora(String s, int i) {
        if (s.substring(i).contains(A.value_))
            return A;
        else if (s.substring(i).contains(B.value_))
            return B;
        else if (s.substring(i).contains(C.value_))
            return C;
        else
            return null;
    }

    public static Mora getRc() {
        int i = RANDOM.nextInt(3);
        switch (i) {
            case 0:
                return A;
            case 1:
                return B;
            default:
                return C;
        }
    }

    /**
     * @param r    赢得 概率
     * @param r2   平局的 概率
     * @param mora 对方的 出拳
     * @return
     */
    public static Mora getRc(int r, int r2, Mora mora) {
        int i = RANDOM.nextInt(100) + 1;
        if (i >= 90)
            System.out.print("");
        if (i < r) {
            return getWin(mora);
        } else if (i < r + r2)
            return mora;
        else return getLost(mora);
    }

    public static void main(String[] args) {
        int i = 0;
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        while (i++ < 10000)
            switch (getRc(10, 40, A).getValue()) {
                case "石头":
                    i1++;
                    continue;
                case "剪刀":
                    i2++;
                    continue;
                case "布":
                    i3++;
                    continue;
                default:
                    continue;
            }
        System.out.println(A.getValue() + ":\t" + i1);
        System.out.println(B.getValue() + ":\t" + i2);
        System.out.println(C.getValue() + ":\t\t" + i3);
    }

    public static Mora getLost(Mora mora) {
        switch (mora) {
            case A:
                return C;
            case B:
                return A;
            case C:
                return B;
        }
        return null;
    }

    public static Mora getWin(Mora mora) {
        switch (mora) {
            case A:
                return B;
            case B:
                return C;
            case C:
                return A;
        }
        return null;
    }

    public int Reff(Mora m) {
        if (this.value_.equals(m.value_)) {
            return 0;
        }
        if (m.getValue().equals("石头") && this.value_.equals("剪刀"))
            return -1;
        else if (m.getValue().equals("剪刀") && this.value_.equals("布"))
            return -1;
        else if (m.getValue().equals("布") && this.value_.equals("石头"))
            return -1;
        else
            return 1;
    }

    public String getValue() {
        return value_;
    }
}
