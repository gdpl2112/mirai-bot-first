package io.github.kloping.mirai0.commons.gameEntitys;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 一个玩家的基本属性
 * 随武魂种类变化而变化
 *
 * @author github.kloping
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class SoulAttribute {
    public static final Map<String, Field> MAP = new HashMap<>();
    public static final Map<String, String> MAP0 = new HashMap<>();

    static {
        for (Field declaredField : SoulAttribute.class.getDeclaredFields()) {
            declaredField.setAccessible(true);
            MAP.put(declaredField.getName(), declaredField);
        }
        MAP0.put("hide", "hideChance");
        MAP0.put("hpp", "hpChance");
        MAP0.put("hlp", "hlChance");
        MAP0.put("hpe", "hpEffect");
        MAP0.put("hle", "hlEffect");
    }

    @TableId
    private Integer wh;
    private Integer hideChance = 0;
    private Integer hpChance = 0;
    private Integer hlChance = 0;
    private Integer hjChance = 0;
    private Integer hpEffect = 10;
    private Integer hlEffect = 10;
    private Integer hjEffect = 10;

    public Integer appendSoulBone(SoulBone soulBone) {
        Integer v0 = 0;
        try {
            Field field = MAP.get(soulBone.getType());
            v0 = (Integer) field.get(this);
            v0 += soulBone.getValue();
            field.set(this, v0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return v0;
    }
}
