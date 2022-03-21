package io.github.kloping.mirai0.commons.apiEntitys;

public class PicData {
	private String[] data;
	private Number num;
	private Number time;
	private Number state;
	private String keyword;

	public String[] getData(){
		return this.data;
	}

	public PicData setData(String[] data) {
		this.data = data;
		return this;
	}

	public Number getNum(){
		return this.num;
	}

	public PicData setNum(Number num) {
		this.num = num;
		return this;
	}

	public Number getTime(){
		return this.time;
	}

	public PicData setTime(Number time) {
		this.time = time;
		return this;
	}

	public Number getState(){
		return this.state;
	}

	public PicData setState(Number state) {
		this.state = state;
		return this;
	}

	public String getKeyword(){
		return this.keyword;
	}

	public PicData setKeyword(String keyword) {
		this.keyword = keyword;
		return this;
	}
}