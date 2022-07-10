package io.github.kloping.mirai0.commons.apiEntitys.pvpQqCom;

public class Data {
    private Number total;
    private Number cache;
    private Items[] items;

    public Number getTotal() {
        return this.total;
    }

    public Data setTotal(Number total) {
        this.total = total;
        return this;
    }

    public Number getCache() {
        return this.cache;
    }

    public Data setCache(Number cache) {
        this.cache = cache;
        return this;
    }

    public Items[] getItems() {
        return this.items;
    }

    public Data setItems(Items[] items) {
        this.items = items;
        return this;
    }
}