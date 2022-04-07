package io.github.kloping.mirai0.commons.apiEntitys.jkbd.pre;

public class QuestionIdData {
    private Data data;
    private Boolean success;
    private Number errorCode;

    public Data getData() {
        return this.data;
    }

    public QuestionIdData setData(Data data) {
        this.data = data;
        return this;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public QuestionIdData setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Number getErrorCode() {
        return this.errorCode;
    }

    public QuestionIdData setErrorCode(Number errorCode) {
        this.errorCode = errorCode;
        return this;
    }

}