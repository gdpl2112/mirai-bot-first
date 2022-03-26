package io.github.kloping.mirai0.commons.apiEntitys.pvpQqCom.v1;

public class Response1 {
    private Msg msg;
    private String data;
    private String from;
    private Number status;

    public Msg getMsg() {
        return this.msg;
    }

    public Response1 setMsg(Msg msg) {
        this.msg = msg;
        return this;
    }

    public String getData() {
        return this.data;
    }

    public Response1 setData(String data) {
        this.data = data;
        return this;
    }

    public String getFrom() {
        return this.from;
    }

    public Response1 setFrom(String from) {
        this.from = from;
        return this;
    }

    public Number getStatus() {
        return this.status;
    }

    public Response1 setStatus(Number status) {
        this.status = status;
        return this;
    }
}