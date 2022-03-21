package io.github.kloping.mirai0.commons.apiEntitys.magiconch;

public class MagiconchNbnhhshResponse {
	private String name;
	private String[] trans;

	public String getName(){
		return this.name;
	}

	public MagiconchNbnhhshResponse setName(String name) {
		this.name = name;
		return this;
	}

	public String[] getTrans(){
		return this.trans;
	}

	public MagiconchNbnhhshResponse setTrans(String[] trans) {
		this.trans = trans;
		return this;
	}
}