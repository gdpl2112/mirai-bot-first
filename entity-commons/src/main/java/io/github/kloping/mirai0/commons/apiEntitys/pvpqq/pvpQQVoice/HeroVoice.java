package io.github.kloping.mirai0.commons.apiEntitys.pvpqq.pvpQQVoice;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author HRS-Computer
 */
public class HeroVoice {
    private String yxidzt6368;
    private String yxmczt3242;
    private JSON dqpfyy5403;

    public String getYxidzt6368() {
        return this.yxidzt6368;
    }

    public HeroVoice setYxidzt6368(String yxidzt6368) {
        this.yxidzt6368 = yxidzt6368;
        return this;
    }

    public String getYxmczt3242() {
        return this.yxmczt3242;
    }

    public HeroVoice setYxmczt3242(String yxmczt3242) {
        this.yxmczt3242 = yxmczt3242;
        return this;
    }

    public JSON getDqpfyy5403() {
        return dqpfyy5403;
    }

    public void setDqpfyy5403(JSON dqpfyy5403) {
        this.dqpfyy5403 = dqpfyy5403;
    }

    public boolean isArray() {
        return (dqpfyy5403 instanceof JSONArray);
    }

	public Dqpfyy5403 getObj(){
		JSONObject jo = (JSONObject) dqpfyy5403;
		return jo.toJavaObject(Dqpfyy5403.class);
	}

	public Dqpfyy5403[] getArr(){
		JSONArray jo = (JSONArray) dqpfyy5403;
		return jo.toJavaList(Dqpfyy5403.class).toArray(new Dqpfyy5403[0]);
	}

}