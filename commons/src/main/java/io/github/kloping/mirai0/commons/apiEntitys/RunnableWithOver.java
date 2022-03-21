package io.github.kloping.mirai0.commons.apiEntitys;

/**
 * @author github-kloping
 * @version 1.0
 */
public abstract interface RunnableWithOver extends Runnable {

    /**
     * 是否结束
     *
     * @return
     */
    abstract boolean over();
}
