package io.github.kloping.mirai0.commons.broadcast.enums;

/**
 * @author github-kloping
 */

public enum ObjType {
    /**
     * 获得
     */
    got(2),
    /**
     * 购买
     */
    buy(3),
    /**
     * 使用
     */
    use(4),
    /**
     * 转让获得
     */
    transGot(5),
    /**
     * 转让 失去
     */
    transLost(6),
    /**
     * 卖掉
     */
    sell(7),
    /**
     * 回退
     */
    un(8);

    public int v = -1;

    ObjType(int v) {
        this.v = v;
    }

    public static ObjType valueOf(int m) {
        for (ObjType value : ObjType.values()) {
            if (value.v == m) {
                return value;
            }
        }
        return null;
    }
}