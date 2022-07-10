package io.github.kloping.mirai0.commons.apiEntitys.jiuli.tianqi;

public class Data {
	private String date;
	private String high;
	private String fx;
	private String low;
	private String fl;
	private String weather;

	public String getDate(){
		return this.date;
	}

	public Data setDate(String date) {
		this.date = date;
		return this;
	}

	public String getHigh(){
		return this.high;
	}

	public Data setHigh(String high) {
		this.high = high;
		return this;
	}

	public String getFx(){
		return this.fx;
	}

	public Data setFx(String fx) {
		this.fx = fx;
		return this;
	}

	public String getLow(){
		return this.low;
	}

	public Data setLow(String low) {
		this.low = low;
		return this;
	}

	public String getFl(){
		return this.fl;
	}

	public Data setFl(String fl) {
		this.fl = fl;
		return this;
	}

	public String getWeather(){
		return this.weather;
	}

	public Data setWeather(String weather) {
		this.weather = weather;
		return this;
	}
}