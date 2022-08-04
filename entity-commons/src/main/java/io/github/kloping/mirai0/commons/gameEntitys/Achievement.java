package io.github.kloping.mirai0.commons.gameEntitys;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author github.kloping
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Achievement {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer aid;
    private Long qid;
    private Long time;
}
