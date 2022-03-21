package io.github.kloping.mirai0.commons;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author github-kloping
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class GroupConf {
    @TableId(type = IdType.ASSIGN_UUID)
    private Long id;
    private Boolean open = true;
    private Boolean speak = true;
    @TableField(value = "`show`")
    private Boolean show = true;
    private Boolean cap = true;
    private Boolean voiceK = true;
}