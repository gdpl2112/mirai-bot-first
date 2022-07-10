package io.github.kloping.mirai0.commons.apiEntitys.ShiTu;

import java.util.ArrayList;
import java.util.List;

/**
 * @author github-kloping
 * @version 1.0
 */
public class Response {
    private List<String> similar = new ArrayList<>();
    private List<String> sources = new ArrayList<>();

    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    public List<String> getSimilar() {
        return similar;
    }

    public void setSimilar(List<String> similar) {
        this.similar = similar;
    }
}






