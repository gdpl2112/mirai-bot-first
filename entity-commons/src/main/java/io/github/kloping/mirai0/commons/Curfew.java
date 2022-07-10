package io.github.kloping.mirai0.commons;

import io.github.kloping.file.FileUtils;
import io.github.kloping.serialize.HMLObject;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

/**
 * 宵禁的实体类
 *
 * @author github-kloping
 * @version 1.0
 */
public class Curfew {
    public static final SimpleDateFormat FORMAT_HH_MM = new SimpleDateFormat("HH:mm");
    private long gid;
    private Set<String> froms = new HashSet<>();
    private Set<String> tos = new HashSet<>();

    public Curfew() {
    }

    public static Curfew getInstance(long gid) {
        String hmlStr = FileUtils.getStringFromFile("./conf/" + gid + "/curfew.hml");
        Curfew curfew = null;
        if (hmlStr == null || hmlStr.trim().isEmpty()) {
            curfew = new Curfew();
        } else {
            curfew = HMLObject.parseObject(hmlStr).toJavaObject(Curfew.class);
        }
        curfew.setGid(gid);
        return curfew;
    }

    public long getGid() {
        return gid;
    }

    public void setGid(long gid) {
        this.gid = gid;
    }

    public Set<String> getFroms() {
        return froms;
    }

    public void setFroms(Set<String> froms) {
        this.froms = froms;
    }

    public Set<String> getTos() {
        return tos;
    }

    public void setTos(Set<String> tos) {
        this.tos = tos;
    }

    public void save() {
        FileUtils.putStringInFile(HMLObject.toHMLString(this), new File("./conf/" + gid + "/curfew.hml"));
    }

    public boolean delete() {
        return new File("./conf/" + gid + "/curfew.hml").delete();
    }
}
