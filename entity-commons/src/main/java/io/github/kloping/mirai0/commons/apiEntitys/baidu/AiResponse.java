package io.github.kloping.mirai0.commons.apiEntitys.baidu;

/**
 * @author github.kloping
 */
public class AiResponse {
    private String data;
    private String msg;
    private Integer errno;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getErrno() {
        return errno;
    }

    public void setErrno(Integer errno) {
        this.errno = errno;
    }
}
