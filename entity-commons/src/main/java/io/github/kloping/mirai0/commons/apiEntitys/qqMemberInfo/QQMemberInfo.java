package io.github.kloping.mirai0.commons.apiEntitys.qqMemberInfo;


import static io.github.kloping.mirai0.commons.resouce_and_tool.CommonSource.pathToImg;

/**
 * @author github-kloping
 */
public class QQMemberInfo {
    private String msg;
    private Number code;
    private Data data;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("头像:").append(pathToImg(data.getAvatar())).append("\n");
        sb.append("活跃天数:  ").append(data.getActivedays()).append("\n");
        sb.append("QQ等级:").append(data.getLevel()).append("\n");
        sb.append("成长速度:").append(data.getGrowthrate()).append("\n");
        sb.append("QQ等级加速倍速:").append(data.getItotaldays()).append("\n");
        sb.append("下次升级天数:").append(data.getUpgradedays()).append("\n");
        sb.append("会员等级:").append(data.getViplevel()).append("\n");
        sb.append("QQ会员每日成长值:").append(data.getAddstep()).append("\n");
        sb.append("QQ会员剩余时间:").append(data.getLeftdays()).append("\n");
        sb.append("会员到期时间:").append(data.getVipduedate()).append("\n");
        sb.append("大会员基础成长值:").append(data.getIbasedays()).append("\n");
        sb.append("大会员成长值:").append(data.getIbigclubgrowth()).append("\n");
        sb.append("大会员等级:").append(data.getIbigclublevel()).append("\n");
        return sb.toString();
    }

    public String getMsg() {
        return this.msg;
    }

    public QQMemberInfo setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Number getCode() {
        return this.code;
    }

    public QQMemberInfo setCode(Number code) {
        this.code = code;
        return this;
    }

    public Data getData() {
        return this.data;
    }

    public QQMemberInfo setData(Data data) {
        this.data = data;
        return this;
    }


}