package io.github.kloping.mirai0.commons.gameEntitys;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author github-kloping
 */
@Data
@Accessors(chain = true)
public class SkillInfo {
    @TableField("`st`")
    private Integer st;

    @TableField("`id`")
    private Integer id;

    @TableField("`jid`")
    private Integer jid;

    @TableField("`add_percent`")
    private Integer addPercent;

    @TableField("`use_percent`")
    private Integer usePercent;

    @TableField("`time`")
    private Long time;

    @TableField("`time_l`")
    private Long timeL;

    @JSONField(name = "md_time")
    @TableField("`md_time`")
    private Long mdTime = 1L;

    @TableField("`qq`")
    private Long qq;

    @TableField("`name`")
    private String name;

    @TableField("`uuid`")
    @JSONField(name = "uUID")
    @TableId
    private String uuid;

    @TableField("`state`")
    private Integer state = 1;

    public SkillInfo() {
    }
}