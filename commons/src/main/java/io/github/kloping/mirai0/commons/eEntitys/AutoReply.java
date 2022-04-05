package io.github.kloping.mirai0.commons.eEntitys;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author github-kloping
 * @version 1.0
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class AutoReply {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String who;
    private String k;
    private String v;
    private String time;
    private Integer deleteStat = 0;
}
