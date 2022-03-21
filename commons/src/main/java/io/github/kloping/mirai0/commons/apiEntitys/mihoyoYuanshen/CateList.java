package io.github.kloping.mirai0.commons.apiEntitys.mihoyoYuanshen;

public class CateList {
	private String name;
	private String id;

	public String getName(){
		return this.name;
	}

	public CateList setName(String name) {
		this.name = name;
		return this;
	}

	public String getId(){
		return this.id;
	}

	public CateList setId(String id) {
		this.id = id;
		return this;
	}
}