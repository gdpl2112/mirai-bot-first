package io.github.kloping.mirai0.commons.apiEntitys.qqGroupInfo;

public class Groupleader {
    private Number qq;
    private String img;
    private String name;

    public Number getQq() {
        return this.qq;
    }

    public Groupleader setQq(Number qq) {
        this.qq = qq;
        return this;
    }

    public String getImg() {
        return this.img;
    }

    public Groupleader setImg(String img) {
        this.img = img;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Groupleader setName(String name) {
        this.name = name;
        return this;
    }
}