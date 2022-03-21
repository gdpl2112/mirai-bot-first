package io.github.kloping.mirai0.commons.apiEntitys.pvpQQH0;

import com.alibaba.fastjson.JSON;

/**
 * @author github-kloping
 * @make JvUtils JsonJSC by kloping
 */
public class PvpQQH0 {
	private Data[] data;

	public Data[] getData(){
		return this.data;
	}

	public PvpQQH0 setData(Data[] data) {
		this.data = data;
		return this;
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
}