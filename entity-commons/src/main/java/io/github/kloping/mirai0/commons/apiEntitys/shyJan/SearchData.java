package io.github.kloping.mirai0.commons.apiEntitys.shyJan;

/**
 * @author github-kloping
 */
public class SearchData {
    private Number vid;
    private String date;
    private String vod_list;
    private String update;
    private String from;
    private String vod_en;
    private String title;
    private String category;

    public Number getVid() {
        return this.vid;
    }

    public SearchData setVid(Number vid) {
        this.vid = vid;
        return this;
    }

    public String getDate() {
        return this.date;
    }

    public SearchData setDate(String date) {
        this.date = date;
        return this;
    }

    public String getVod_list() {
        return this.vod_list;
    }

    public SearchData setVod_list(String vod_list) {
        this.vod_list = vod_list;
        return this;
    }

    public String getUpdate() {
        return this.update;
    }

    public SearchData setUpdate(String update) {
        this.update = update;
        return this;
    }

    public String getFrom() {
        return this.from;
    }

    public SearchData setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getVod_en() {
        return this.vod_en;
    }

    public SearchData setVod_en(String vod_en) {
        this.vod_en = vod_en;
        return this;
    }

    public String getTitle() {
        return this.title;
    }

    public SearchData setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getCategory() {
        return this.category;
    }

    public SearchData setCategory(String category) {
        this.category = category;
        return this;
    }
}