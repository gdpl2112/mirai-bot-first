package io.github.kloping.mirai0.commons.apiEntitys.qqMemberInfo;

public class Data {
    private String ibigclubgrowth;
    private String level;
    private String activedays;
    private String upgradedays;
    private String vipduedate;
    private String growthrate;
    private Number leftdays;
    private String avatar;
    private String ibasedays;
    private String itotaldays;
    private String ibigclublevel;
    private Number addstep;
    private String name;
    private String viplevel;

    public String getIbigclubgrowth() {
        return this.ibigclubgrowth;
    }

    public Data setIbigclubgrowth(String ibigclubgrowth) {
        this.ibigclubgrowth = ibigclubgrowth;
        return this;
    }

    public String getLevel() {
        return this.level;
    }

    public Data setLevel(String level) {
        this.level = level;
        return this;
    }

    public String getActivedays() {
        return this.activedays;
    }

    public Data setActivedays(String activedays) {
        this.activedays = activedays;
        return this;
    }

    public String getUpgradedays() {
        return this.upgradedays;
    }

    public Data setUpgradedays(String upgradedays) {
        this.upgradedays = upgradedays;
        return this;
    }

    public String getVipduedate() {
        return this.vipduedate;
    }

    public Data setVipduedate(String vipduedate) {
        this.vipduedate = vipduedate;
        return this;
    }

    public String getGrowthrate() {
        return this.growthrate;
    }

    public Data setGrowthrate(String growthrate) {
        this.growthrate = growthrate;
        return this;
    }

    public Number getLeftdays() {
        return this.leftdays;
    }

    public Data setLeftdays(Number leftdays) {
        this.leftdays = leftdays;
        return this;
    }

    public String getAvatar() {
        return this.avatar.substring(5);
    }

    public Data setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public String getIbasedays() {
        return this.ibasedays;
    }

    public Data setIbasedays(String ibasedays) {
        this.ibasedays = ibasedays;
        return this;
    }

    public String getItotaldays() {
        return this.itotaldays;
    }

    public Data setItotaldays(String itotaldays) {
        this.itotaldays = itotaldays;
        return this;
    }

    public String getIbigclublevel() {
        return this.ibigclublevel;
    }

    public Data setIbigclublevel(String ibigclublevel) {
        this.ibigclublevel = ibigclublevel;
        return this;
    }

    public Number getAddstep() {
        return this.addstep;
    }

    public Data setAddstep(Number addstep) {
        this.addstep = addstep;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Data setName(String name) {
        this.name = name;
        return this;
    }

    public String getViplevel() {
        return this.viplevel;
    }

    public Data setViplevel(String viplevel) {
        this.viplevel = viplevel;
        return this;
    }
}