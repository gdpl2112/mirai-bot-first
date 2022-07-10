package io.github.kloping.mirai0.commons.apiEntitys;


public class WeatherDetail {
    /**
     * 地名
     */
    private String address;
    /**
     * 描述
     */
    private String described;
    /**
     * 湿度
     */
    private String humidity;
    /**
     * 风向
     */
    private String wind;
    /**
     * 紫外线强度
     */
    private String uva;
    /**
     * 温度
     */
    private String temperature;
    /**
     * 现在温度
     */
    private String temperatureNow;
    /**
     * PM
     */
    private String pm;
    /**
     * 日出
     */
    private String sunOn;
    /**
     * 日落
     */
    private String sunDown;
    /**
     * 时间
     */
    private String time;
    private String air;

    public String getAir() {
        return air;
    }

    public void setAir(String air) {
        this.air = air;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescribed() {
        return described;
    }

    public void setDescribed(String described) {
        this.described = described;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getUva() {
        return uva;
    }

    public void setUva(String uva) {
        this.uva = uva;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTemperatureNow() {
        return temperatureNow;
    }

    public void setTemperatureNow(String temperatureNow) {
        this.temperatureNow = temperatureNow;
    }

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

    public String getSunOn() {
        return sunOn;
    }

    public void setSunOn(String sunOn) {
        this.sunOn = sunOn;
    }

    public String getSunDown() {
        return sunDown;
    }

    public void setSunDown(String sunDown) {
        this.sunDown = sunDown;
    }
}
