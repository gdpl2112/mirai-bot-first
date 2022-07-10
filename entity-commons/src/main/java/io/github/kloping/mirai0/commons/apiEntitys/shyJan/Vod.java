package io.github.kloping.mirai0.commons.apiEntitys.shyJan;

/**
 * @author github-kloping
 */
public class Vod {
	private Data[] data;

	public Data[] getData(){
		return this.data;
	}

	public Vod setData(Data[] data) {
		this.data = data;
		return this;
	}
}