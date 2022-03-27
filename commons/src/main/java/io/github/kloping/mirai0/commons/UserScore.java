package io.github.kloping.mirai0.commons;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


/**
 * @author github-kloping
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserScore implements Serializable {
    private Long score = 1000L;
    private Long times = 0L;
    private Long fz = 0L;
    @JSONField(name = "times_")
    private Long sTimes = 0L;
    private Long days = 0L;
    @JSONField(name = "score_")
    private Long sScore = 200L;
    private Long K = -1L;
    private Long day = -1L;
    private Long timesDay = -1L;
    @TableId
    private Long who;
//    private Long earnings;
//    private Long debuffs;

    public UserScore addScore(Number s0) {
        this.score += s0.longValue();
        return this;
    }
}