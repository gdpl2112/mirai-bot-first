package io.github.kloping.mirai0.commons.gameEntitys.base;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author github-kloping
 * @version 1.0
 */
public class BaseInfoTemp {
    public static final Map<Long, Long> VERTIGO_T0 = new ConcurrentHashMap<>();

    public static boolean letVertigo(long q, long t) {
        VERTIGO_T0.put(q, System.currentTimeMillis() + t);
        return true;
    }

    public static boolean addVertigo(long q, long t) {
        if (VERTIGO_T0.containsKey(q)) {
            VERTIGO_T0.put(q, VERTIGO_T0.get(q) + System.currentTimeMillis());
        }
        return true;
    }

    public static boolean removeVertigo(long q) {
        return VERTIGO_T0.remove(q) != null;
    }

    public static boolean isVertigo(long q) {
        return VERTIGO_T0.containsKey(q) && VERTIGO_T0.get(q) > System.currentTimeMillis();
    }
}
