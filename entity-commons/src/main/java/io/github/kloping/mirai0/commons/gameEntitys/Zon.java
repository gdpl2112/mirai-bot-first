package io.github.kloping.mirai0.commons.gameEntitys;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author github-kloping
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Zon {
    private Integer id;
    @TableId
    private Long qq;
    private Integer level = 0;
    private Integer times = 0;
    private Integer xper = 0;
    private Integer active = 0;
}
