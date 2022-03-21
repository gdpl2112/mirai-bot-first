package io.github.kloping.mirai0.commons.apiEntitys.colb;

public class Data {
	private String msg;
	private String Time;
	private Number id;
	private String uin;
	private String content;
	private String group;

	public String getMsg(){
		return this.msg;
	}

	public Data setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	public String getTime(){
		return this.Time;
	}

	public Data setTime(String Time) {
		this.Time = Time;
		return this;
	}

	public Number getId(){
		return this.id;
	}

	public Data setId(Number id) {
		this.id = id;
		return this;
	}

	public String getUin(){
		return this.uin;
	}

	public Data setUin(String uin) {
		this.uin = uin;
		return this;
	}

	public String getContent(){
		return this.content;
	}

	public Data setContent(String content) {
		this.content = content;
		return this;
	}

	public String getGroup(){
		return this.group;
	}

	public Data setGroup(String group) {
		this.group = group;
		return this;
	}
}