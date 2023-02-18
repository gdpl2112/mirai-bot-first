package io.github.kloping.mirai0.commons;

import java.util.HashMap;
import java.util.Map;

/**
 * @author github-kloping
 */
public class SpGroup {
    public static Map<Long, SpGroup> upHistGroupMap = new HashMap<>();
    private Long id;
    private String nickName;

    public SpGroup() {
    }

    private SpGroup(Long id, String nickName) {
        this.id = id;
        this.nickName = nickName;
    }

    public static SpGroup create(long id, String name, Map<Long, SpGroup> histGroupMap) {
        if (histGroupMap.containsKey(id)) return histGroupMap.get(id);
        SpGroup group = new SpGroup(id, name);
        histGroupMap.put(
                id, group
        );
        upHistGroupMap = histGroupMap;
        return group;
    }

    public static SpGroup get(long id) {
        if (upHistGroupMap.containsKey(id)) return upHistGroupMap.get(id);
        return null;
    }

    public long getId() {
        return id.longValue();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
