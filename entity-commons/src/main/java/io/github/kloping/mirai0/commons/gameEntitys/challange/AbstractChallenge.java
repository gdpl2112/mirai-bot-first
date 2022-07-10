package io.github.kloping.mirai0.commons.gameEntitys.challange;

/**
 * @author github.kloping
 */
public abstract class AbstractChallenge {
    public long p1 = -1;
    public long p2 = -1;

    public static final int STATE_CREATED = 0, ACCEPTING = 1, PROCESSING = 2, FINISHED = 3;

    public int state = STATE_CREATED;

    /**
     * if ready
     *
     * @return
     */
    public abstract boolean ready();

    /**
     * start
     * @return
     */
    public abstract AbstractChallenge start();

    /**
     * challenge in group 's id
     *
     * @return
     */
    public abstract long getGid();
}
