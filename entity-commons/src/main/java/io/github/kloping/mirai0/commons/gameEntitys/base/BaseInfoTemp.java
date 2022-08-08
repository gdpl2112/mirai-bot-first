package io.github.kloping.mirai0.commons.gameEntitys.base;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

/**
 * @author github-kloping
 * @version 1.0
 */
public class BaseInfoTemp {
    /**
     * k 被 眩晕到 v 时间戳
     */
    public static final Map<Long, Long> VERTIGO_T0 = new HashMap<>();
    /**
     * k 的
     */
    public static final Map<Long, Future> VERTIGO_T1 = new HashMap<>();
    /**
     * k 直到 v 可使用 魂技
     */
    private static final Map<Long, Long> CANT_VERTIGO = new HashMap<>();
    /**
     * k 被 v 攻击
     */
    public static final Map<Long, Long> VERTIGO_T2 = new HashMap<>();

    public synchronized static boolean letVertigo(long q, long t) {
        if (!CANT_VERTIGO.containsKey(q) || System.currentTimeMillis() > CANT_VERTIGO.get(q))
            VERTIGO_T0.put(q, System.currentTimeMillis() + t);
        refresh();
        return true;
    }

    public synchronized static void append(long q, Future future) {
        append(q, future, true);
    }

    public synchronized static void append(long q, Future future, boolean breakOld) {
        append(q, future, breakOld, 0);
    }

    public synchronized static void append(long q, Future future, boolean breakOld, long q2) {
        if (breakOld) {
            if (VERTIGO_T1.containsKey(q)) {
                VERTIGO_T1.get(q).cancel(true);
            }
        }
        VERTIGO_T1.put(q, future);
        if (q2 != 0) {
            VERTIGO_T2.put(q2, q);
        }
    }

    private static void refresh() {
        VERTIGO_T0.forEach((k, v) -> {
            if (VERTIGO_T1.containsKey(k)) {
                VERTIGO_T1.get(k.longValue()).cancel(true);
            }
        });
    }

    public static boolean addVertigo(long q, long t) {
        if (VERTIGO_T0.containsKey(q)) {
            if (!CANT_VERTIGO.containsKey(q) || System.currentTimeMillis() > CANT_VERTIGO.get(q))
                VERTIGO_T0.put(q, VERTIGO_T0.get(q) + System.currentTimeMillis());
            refresh();
        }
        return true;
    }

    public synchronized static boolean removeVertigo(long q) {
        return VERTIGO_T0.remove(q) != null;
    }

    public synchronized static boolean removeVertigo(long q, long t) {
        CANT_VERTIGO.put(q, System.currentTimeMillis() + t);
        return VERTIGO_T0.remove(q) != null;
    }

    public synchronized static boolean isVertigo(long q) {
        return VERTIGO_T0.containsKey(q) && VERTIGO_T0.get(q) > System.currentTimeMillis();
    }
}
