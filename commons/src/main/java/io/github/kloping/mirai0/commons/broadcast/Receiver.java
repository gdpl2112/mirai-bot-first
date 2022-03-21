package io.github.kloping.mirai0.commons.broadcast;

/**
 * @author github-kloping
 */
public interface Receiver {
    /**
     * on received call method
     *
     * @param o
     */
    default void onReceive(Object o) {
    }
}
