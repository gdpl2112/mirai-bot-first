package io.github.kloping.mirai0.commons.apiEntitys.qqGroupInfo;

public class Groupadministrator {
    private Number qq;
    private String img;
    private String name;

    public Number getQq() {
        return this.qq;
    }

    public Groupadministrator setQq(Number qq) {
        this.qq = qq;
        return this;
    }

    public String getImg() {
        return this.img;
    }

    public Groupadministrator setImg(String img) {
        this.img = img;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Groupadministrator setName(String name) {
        this.name = name;
        return this;
    }
}