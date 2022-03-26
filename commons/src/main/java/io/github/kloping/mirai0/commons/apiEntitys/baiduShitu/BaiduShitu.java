package io.github.kloping.mirai0.commons.apiEntitys.baiduShitu;

public class BaiduShitu {
    private String msg;
    private Number flow_limit;
    private Data data;
    private Number cost_nirs;
    private Boolean is_intervene;
    private Number status;
    private Number cost_pfc;

    public String getMsg() {
        return this.msg;
    }

    public BaiduShitu setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Number getFlow_limit() {
        return this.flow_limit;
    }

    public BaiduShitu setFlow_limit(Number flow_limit) {
        this.flow_limit = flow_limit;
        return this;
    }

    public Data getData() {
        return this.data;
    }

    public BaiduShitu setData(Data data) {
        this.data = data;
        return this;
    }

    public Number getCost_nirs() {
        return this.cost_nirs;
    }

    public BaiduShitu setCost_nirs(Number cost_nirs) {
        this.cost_nirs = cost_nirs;
        return this;
    }

    public Boolean getIs_intervene() {
        return this.is_intervene;
    }

    public BaiduShitu setIs_intervene(Boolean is_intervene) {
        this.is_intervene = is_intervene;
        return this;
    }

    public Number getStatus() {
        return this.status;
    }

    public BaiduShitu setStatus(Number status) {
        this.status = status;
        return this;
    }

    public Number getCost_pfc() {
        return this.cost_pfc;
    }

    public BaiduShitu setCost_pfc(Number cost_pfc) {
        this.cost_pfc = cost_pfc;
        return this;
    }
}