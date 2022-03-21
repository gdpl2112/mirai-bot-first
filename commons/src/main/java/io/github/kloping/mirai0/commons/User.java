package io.github.kloping.mirai0.commons;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author github-kloping
 */
public class User {
    private Long id = -1L;
    private Long group = -1L;
    private String nickName = "=";
    private String name = "=";

    public User(Long id, Long group, String nickName, String name) {
        this.id = id;
        this.group = group;
        this.nickName = nickName;
        this.name = name;
    }

    public static final Map<Long, User> HIST = new HashMap<>();

    public static User create(long id, Long group, String nickName, String name) {
        if (!HIST.containsKey(id)) HIST.put(id, new User(id, group, nickName, name));
        return HIST.get(id);
    }

    public static User get(Long id) {
        return HIST.get(id.longValue());
    }

    public long getId() {
        return id.longValue();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getGroup() {
        return group.longValue();
    }

    public void setGroup(Long group) {
        this.group = group;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(group, user.group) && Objects.equals(nickName, user.nickName) && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, group, nickName, name);
    }
}
