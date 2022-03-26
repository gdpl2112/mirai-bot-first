package io.github.kloping.mirai0.commons.apiEntitys.sjtx;

public class Sjtx {
    private String msg;
    private String code;
    private Data data;

    public String getMsg() {
        return this.msg;
    }

    public Sjtx setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public Sjtx setCode(String code) {
        this.code = code;
        return this;
    }

    public Data getData() {
        return this.data;
    }

    public Sjtx setData(Data data) {
        this.data = data;
        return this;
    }
}