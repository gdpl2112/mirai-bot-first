package io.github.kloping.mirai0.commons.apiEntitys.colb;

public class PickupABottle {
    private Number code;
    private Data data;

    public Number getCode() {
        return this.code;
    }

    public PickupABottle setCode(Number code) {
        this.code = code;
        return this;
    }

    public Data getData() {
        return this.data;
    }

    public PickupABottle setData(Data data) {
        this.data = data;
        return this;
    }
}