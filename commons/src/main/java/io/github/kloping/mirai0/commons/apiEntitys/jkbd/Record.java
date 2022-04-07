package io.github.kloping.mirai0.commons.apiEntitys.jkbd;

import com.alibaba.fastjson.JSON;
import io.github.kloping.mirai0.commons.apiEntitys.jkbd.pre.QuestionIdData;

/**
 * @author github.kloping
 */
public class Record {
    private int upCid = 121;
    private int upSt = 0;
    private int correct = 0;
    private int error = 0;
    private String upData = "";

    public int getUpCid() {
        return upCid;
    }

    public void setUpCid(int upCid) {
        this.upCid = upCid;
    }

    public int getUpSt() {
        return upSt;
    }

    public void setUpSt(int upSt) {
        this.upSt = upSt;
    }

    public String getUpData() {
        return upData;
    }

    public void setUpData(String upData) {
        this.upData = upData;
    }

    public QuestionIdData questionIdData() {
        return JSON.parseObject(upData).toJavaObject(QuestionIdData.class);
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public void add() {
        upSt++;
    }

    public void addCorrect() {
        correct++;
    }

    public void addError() {
        error++;
    }
}
