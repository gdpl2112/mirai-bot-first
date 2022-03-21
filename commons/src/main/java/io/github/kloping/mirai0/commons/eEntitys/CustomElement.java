package io.github.kloping.mirai0.commons.eEntitys;

import java.util.Objects;

/**
 * @author github-kloping
 * @version 1.0
 */
public class CustomElement {
    private int weight;
    private String context;
    private Long qid;
    private long time;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Long getQid() {
        return qid;
    }

    public void setQid(Long qid) {
        this.qid = qid;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomElement that = (CustomElement) o;
        return weight == that.weight && time == that.time && Objects.equals(context, that.context) && Objects.equals(qid, that.qid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, context, qid, time);
    }
}
