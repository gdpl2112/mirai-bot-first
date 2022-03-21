package io.github.kloping.mirai0.commons.gameEntitys.base;

/**
 * @author github-kloping
 * @version 1.0
 */
public interface BaseInfo {
    /**
     * get name
     *
     * @return
     */
    String getName();

    /**
     * get attack value
     *
     * @return
     */
    Long getAtt();

    /**
     * get HP value
     *
     * @return
     */
    Long getHp();

    /**
     * get max HP value
     *
     * @return
     */
    Long getHpL();

    /**
     * get Level Value
     *
     * @return
     */
    Integer getLevel();

    /**
     * get spirit value
     *
     * @return
     */
    Long getHj();

    /**
     * get max spirit value
     *
     * @return
     */
    Long getHjL();

    /**
     * get ID
     *
     * @return
     */
    Number getId();

    /**
     * save or apply
     *
     * @param <T>
     * @return
     */
    <T> T apply();

    /**
     * add Hj value
     *
     * @param v
     * @return
     */
    BaseInfo addHj(Long v);

    /**
     * add Hp value
     *
     * @param v
     * @return
     */
    BaseInfo addHp(Long v);

    /**
     * 是否被眩晕
     *
     * @return
     */
    boolean isVertigo();

    /**
     * cancel Vertigo
     *
     * @param <T>
     * @return
     */
    <T extends BaseInfo> T cancelVertigo();

    /**
     * set Vertigo and t ms after over
     *
     * @param t
     * @param <T>
     * @return
     */
    <T extends BaseInfo> T letVertigo(long t);

    /**
     * get tips
     *
     * @return
     */
    String getTips();
}
