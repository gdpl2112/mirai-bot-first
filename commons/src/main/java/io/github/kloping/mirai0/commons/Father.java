package io.github.kloping.mirai0.commons;

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
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Father {
    public static final String ALL = "all";

    @TableId(type = IdType.ASSIGN_UUID)
    private Long id;
    private String permission;
}
