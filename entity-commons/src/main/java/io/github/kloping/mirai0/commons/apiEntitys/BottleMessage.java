package io.github.kloping.mirai0.commons.apiEntitys;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author github.kloping
 */
@Data
@Accessors(chain = true)
public class BottleMessage {
    private Integer id;
    private Long gid;
    private Long sid;
    private Long time;
    private String name;
    private String message;
    private Integer state;
}
