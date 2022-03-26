package io.github.kloping.mirai0.commons.eEntitys;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import static io.github.kloping.mirai0.commons.resouce_and_tool.CommonSource.RANDOM;

/**
 * @author github-kloping
 * @version 1.0
 */
public class CustomReplyGroup {
    private long gid;
    private long qid;
    private int id;
    private boolean visible = true;
    private Set<CustomElement> keys = new CopyOnWriteArraySet<>();
    private Set<CustomElement> values = new CopyOnWriteArraySet<>();

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getGid() {
        return gid;
    }

    public void setGid(long gid) {
        this.gid = gid;
    }

    public long getQid() {
        return qid;
    }

    public void setQid(long qid) {
        this.qid = qid;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public Set<CustomElement> getKeys() {
        return keys;
    }

    public void setKeys(Set<CustomElement> keys) {
        this.keys = keys;
    }

    public Set<CustomElement> getValues() {
        return values;
    }

    public void setValues(Set<CustomElement> values) {
        this.values = values;
    }

    public CustomElement get() {
        int weight = 0;
        List<CustomElement> indexs = new ArrayList<>();
        for (CustomElement value : values) {
            weight += value.getWeight();
            for (int i = 0; i < value.getWeight(); i++) {
                indexs.add(value);
            }
        }
        int r = RANDOM.nextInt(weight);
        return indexs.get(r);
    }
}
