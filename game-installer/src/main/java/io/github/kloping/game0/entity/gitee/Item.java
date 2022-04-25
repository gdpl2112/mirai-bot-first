package io.github.kloping.game0.entity.gitee;

import java.util.Objects;

/**
 * @author github.kloping
 */
public class Item {
    public String name;
    public String path;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name) && Objects.equals(path, item.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, path);
    }
}
