package io.github.klopin.test0.kp.entity;

/**
 * @author github-kloping
 */
public class QuestionData {
    private Data[] data;
    private Boolean success;
    private Number errorCode;

    public Data[] getData() {
        return this.data;
    }

    public QuestionData setData(Data[] data) {
        this.data = data;
        return this;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public QuestionData setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Number getErrorCode() {
        return this.errorCode;
    }

    public QuestionData setErrorCode(Number errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}