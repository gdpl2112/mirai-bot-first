package io.github.kloping.mirai0.commons.gameEntitys;

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
public class SoulBone {
    /**
     * 拥有者
     */
    private Long qid;
    /**
     * 魂骨加成类型
     * see {@link SoulAttribute#MAP}
     */
    private String type;
    /**
     * 值
     */
    private Integer value;
    /**
     * 魂骨id
     */
    private Integer oid;
    /**
     * time
     */
    private Long time = System.currentTimeMillis();

    public int partId() {
        return Integer.parseInt(oid.toString().substring(0, 3));
    }

    public boolean hasSkill() {
        return SoulAttribute.SKILLS.contains(getOid().intValue());
    }
}
