package io.github.kloping.mirai0.commons.apiEntitys.qqGroupInfo;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static io.github.kloping.mirai0.commons.resouce_and_tool.CommonSource.pathToImg;

/**
 * @author github-kloping
 */
public class QQGroupInfo {
    private String msg;
    private Number code;
    private Data data;

    public String getMsg() {
        return this.msg;
    }

    public QQGroupInfo setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Number getCode() {
        return this.code;
    }

    public QQGroupInfo setCode(Number code) {
        this.code = code;
        return this;
    }

    public Data getData() {
        return this.data;
    }

    public QQGroupInfo setData(Data data) {
        this.data = data;
        return this;
    }

    public Object[] toStrings() {
        List list = new LinkedList();
        list.add("群名称:\n" + data.getGroupname());
        list.add("群头像:\n" + pathToImg(data.getGroupimg()));
        list.add("群当前人数:" + data.getGroupsize());
        list.add("群人数总容量:" + data.getGrouptotal());
        list.add("群介绍:\n" + data.getGroupIntroduction());
        list.add("群分类:" + data.getGroupclassification());
        list.add("群标签:" + Arrays.toString(data.getGrouptags()));
        list.add("群创建时间:" + data.getGroupbuildingtime());
        list.add("加群宣传语:\n" + data.getGroupmessage());
        list.add("加群链接:" + data.getGrouplinks());
        list.add("群主QQ:" + data.getGroupleader().getQq());
        list.add("群主昵称:" + data.getGroupleader().getName());
        list.add("群主头像:" + pathToImg(data.getGroupleader().getImg()));
        list.add("群管理员s");
        for (Groupadministrator groupadministrator : data.getGroupadministrator()) {
            list.add("QQ:" + groupadministrator.getQq() + "\n昵称:" + groupadministrator.getName() + "\n头像:" + pathToImg(groupadministrator.getImg()));
        }
        return list.toArray();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("群名称:").append(data.getGroupname()).append("\n");
        sb.append("群头像:").append(pathToImg(data.getGroupimg())).append("\n");
        sb.append("加群链接:").append(data.getGrouplinks()).append("\n");
        sb.append("加群宣传语:").append(data.getGroupmessage()).append("\n");
        sb.append("群介绍:").append(data.getGroupIntroduction()).append("\n");
        sb.append("群创建时间:").append(data.getGroupbuildingtime()).append("\n");
        sb.append("群分类:").append(data.getGroupclassification()).append("\n");
        sb.append("群当前人数:").append(data.getGroupsize()).append("\n");
        sb.append("群人数总容量:").append(data.getGrouptotal()).append("\n");
        sb.append("群标签:").append(Arrays.toString(data.getGrouptags())).append("\n");
        sb.append("群主QQ:").append(data.getGroupleader().getQq()).append("\n");
        sb.append("群主昵称:").append(data.getGroupleader().getName()).append("\n");
        sb.append("群主头像:").append(pathToImg(data.getGroupleader().getImg())).append("\n");
        return sb.toString();
    }
}