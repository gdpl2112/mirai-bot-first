package io.github.kloping.mirai0.commons.gameEntitys;

/**
 * @author github.kloping
 */
public abstract class AchievementEntity {
    private Integer aid;

    public AchievementEntity(Integer aid) {
        this.aid = aid;
    }

    public Integer getAid() {
        return aid;
    }

    /**
     * 完成
     *
     * @param qid
     * @return
     */
    public abstract String finish(long qid);

    /**
     * 获取介绍
     *
     * @param qid
     * @return
     */
    public abstract String intro(long qid);

    /**
     * 是否完成
     *
     * @param qid
     * @return
     */
    public abstract boolean isFinish(long qid);
}
