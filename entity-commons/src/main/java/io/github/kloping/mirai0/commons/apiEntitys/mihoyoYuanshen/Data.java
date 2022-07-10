package io.github.kloping.mirai0.commons.apiEntitys.mihoyoYuanshen;

public class Data {
    private String cateId;
    private Boolean hasMore;
    private RecList[] recList;
    private CateList[] cateList;
    private MainList[] mainList;
    private String pageNum;

    public String getCateId() {
        return this.cateId;
    }

    public Data setCateId(String cateId) {
        this.cateId = cateId;
        return this;
    }

    public Boolean getHasMore() {
        return this.hasMore;
    }

    public Data setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    public RecList[] getRecList() {
        return this.recList;
    }

    public Data setRecList(RecList[] recList) {
        this.recList = recList;
        return this;
    }

    public CateList[] getCateList() {
        return this.cateList;
    }

    public Data setCateList(CateList[] cateList) {
        this.cateList = cateList;
        return this;
    }

    public MainList[] getMainList() {
        return this.mainList;
    }

    public Data setMainList(MainList[] mainList) {
        this.mainList = mainList;
        return this;
    }

    public String getPageNum() {
        return this.pageNum;
    }

    public Data setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
}