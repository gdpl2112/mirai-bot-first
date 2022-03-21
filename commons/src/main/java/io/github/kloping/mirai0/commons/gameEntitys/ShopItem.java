package io.github.kloping.mirai0.commons.gameEntitys;

import com.baomidou.mybatisplus.annotation.TableField;
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
public class ShopItem {
    @TableField("`id`")
    private Integer id;

    @TableField("`who`")
    private Long who;

    @TableField("`item_id`")
    private Integer itemId;

    @TableField("`num`")
    private Integer num;

    @TableField("`time`")
    private Long time;

    @TableField("`price`")
    private Long price;

    @TableField("`state`")
    private Integer state = 0;
}
