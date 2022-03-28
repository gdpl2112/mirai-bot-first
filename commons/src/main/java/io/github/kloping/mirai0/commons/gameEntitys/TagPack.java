package io.github.kloping.mirai0.commons.gameEntitys;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;


/**
 * @author github.kloping
 */
@Accessors(chain = true)
@Getter
@Setter
public abstract class TagPack {
    private final String TAG;
    private Long q;
    private Long value;
    private Boolean effected = false;

    public TagPack(String tag) {
        this.TAG = tag;
    }

    /**
     * 生效
     */
    public abstract void effect();

    /**
     * overed
     *
     * @return
     */
    public abstract boolean over();

    /**
     * 失效
     */
    public void loseEffect() {
    }
}
