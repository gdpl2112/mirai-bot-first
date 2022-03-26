package io.github.kloping.mirai0.commons.apiEntitys.baidu;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import io.github.kloping.MySpringTool.entity.RequestData;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author github.kloping
 */
public class AiRequest implements RequestData {
    private String type = "tns";
    private Integer per = 4103;
    private Integer spd = 5;
    private Integer pit = 5;
    private Integer vol = 5;
    private Integer aue = 6;
    private String tex;
    private Map<String, String> data = new HashMap<>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPer() {
        return per;
    }

    public void setPer(Integer per) {
        this.per = per;
    }

    public Integer getSpd() {
        return spd;
    }

    public void setSpd(Integer spd) {
        this.spd = spd;
    }

    public Integer getPit() {
        return pit;
    }

    public void setPit(Integer pit) {
        this.pit = pit;
    }

    public Integer getVol() {
        return vol;
    }

    public void setVol(Integer vol) {
        this.vol = vol;
    }

    public Integer getAue() {
        return aue;
    }

    public void setAue(Integer aue) {
        this.aue = aue;
    }

    public String getTex() {
        return tex;
    }

    public void setTex(String tex) {
        this.tex = tex;
    }

    @Override
    @JSONField(deserialize = false, serialize = false)
    public Set<Map.Entry<String, String>> getEntrySet() {
        return RequestData.super.getEntrySet();
    }

    @Override
    @JSONField(deserialize = false, serialize = false)
    public Map<String, String> getDataMap() {
        if (data.isEmpty()) {
            initData();
        }
        return data;
    }

    private synchronized void initData() {
        JSON.parseObject(JSON.toJSONString(this)).forEach((k, v) -> {
            data.put(k, v.toString());
        });
    }
}
