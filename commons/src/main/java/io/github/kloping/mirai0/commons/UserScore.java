package io.github.kloping.mirai0.commons;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.lang.reflect.Field;


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

    public void check() {
        for (Field declaredField : this.getClass().getDeclaredFields()) {
            try {
                declaredField.setAccessible(true);
                Object o = declaredField.get(this);
                if (o == null) {
                    declaredField.set(this, declaredField.get(new UserScore()));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}