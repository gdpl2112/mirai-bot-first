package io.github.kloping.mirai0.commons.apiEntitys.magiconch;

/**
 * @author github.kloping
 */
public class MagiconchNbnhhshRequest {
    private String text = "";

    public MagiconchNbnhhshRequest(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "{\"text\":\"" + text + "\"}";
    }
}
