package io.github.kloping.mirai0.commons.gameEntitys;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;


/**
 * @author github.kloping
 */
@Accessors(chain = true)
@Getter
@Setter
@EqualsAndHashCode
@ToString
public abstract class TagPack {
    private final String TAG;
    protected Long q;
    private Long value;

    public TagPack(String tag) {
        this.TAG = tag;
    }

    /**
     * overed
     *
     * @return
     */
    public abstract boolean over();

    /**
     * @param v
     */
    public void eddValue(long v) {
        this.value -= v;
    }
}
