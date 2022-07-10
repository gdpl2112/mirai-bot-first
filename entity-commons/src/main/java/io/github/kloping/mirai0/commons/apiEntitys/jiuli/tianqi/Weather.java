package io.github.kloping.mirai0.commons.apiEntitys.jiuli.tianqi;

public class Weather {
	private String msg;
	private Number code;
	private Data[] data;
	private String tips;

	public String getMsg(){
		return this.msg;
	}

	public Weather setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	public Number getCode(){
		return this.code;
	}

	public Weather setCode(Number code) {
		this.code = code;
		return this;
	}

	public Data[] getData(){
		return this.data;
	}

	public Weather setData(Data[] data) {
		this.data = data;
		return this;
	}

	public String getTips(){
		return this.tips;
	}

	public Weather setTips(String tips) {
		this.tips = tips;
		return this;
	}
}