package io.github.kloping.mirai0.commons;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author github-kloping
 */
@Data
@Accessors(chain = true)
public class TradingRecord {
    public enum Type0 {
        gold("gold"), score("score");
        String v;

        Type0(String v) {
            this.v = v;
        }
    }

    public enum Type1 {
        lost("lost"), add("add");
        String v;

        Type1(String v) {
            this.v = v;
        }
    }

    @JSONField(name = "type0")
    public void setType0(String type0) {
        this.type0 = Type0.valueOf(type0);
    }

    @JSONField(name = "type1")
    public void setType1(String type1) {
        this.type1 = Type1.valueOf(type1);
    }

    public TradingRecord setType0(Type0 type0) {
        this.type0 = type0;
        return this;
    }

    public TradingRecord setType1(Type1 type1) {
        this.type1 = type1;
        return this;
    }

    @TableField("`type0`")
    private Type0 type0;

    @TableField("`type1`")
    private Type1 type1;

    @TableField("`from`")
    private Long from;

    @TableField("`to`")
    private Long to;

    @TableField("`main`")
    private Long main;

    @TableField("`now`")
    private Long now;

    @TableField("`many`")
    private Long many;

    @TableField("`desc`")
    private String desc;

    @TableField("`time`")
    private Long time = System.currentTimeMillis();


    public TradingRecord setTo(Integer to) {
        this.to = to.longValue();
        return this;
    }

    public TradingRecord setTo(Long to) {
        this.to = to.longValue();
        return this;
    }

    public TradingRecord setFrom(Integer v) {
        this.from = v.longValue();
        return this;
    }

    public TradingRecord setFrom(Long v) {
        this.from = v.longValue();
        return this;
    }

    public TradingRecord setMany(Integer v) {
        this.many = v.longValue();
        return this;
    }

    public TradingRecord setMany(Long v) {
        this.many = v.longValue();
        return this;
    }
}
