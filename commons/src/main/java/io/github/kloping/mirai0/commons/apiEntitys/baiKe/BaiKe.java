package io.github.kloping.mirai0.commons.apiEntitys.baiKe;

public class BaiKe {
	private String msg;
	private Number code;
	private Data data;

	public String getMsg(){
		return this.msg;
	}

	public BaiKe setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	public Number getCode(){
		return this.code;
	}

	public BaiKe setCode(Number code) {
		this.code = code;
		return this;
	}

	public Data getData(){
		return this.data;
	}

	public BaiKe setData(Data data) {
		this.data = data;
		return this;
	}
}