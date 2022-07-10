package io.github.kloping.mirai0.commons.apiEntitys.kloping;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @author github.kloping
 */
@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode
@Data
public class VideoAnimeDetail {
    public String vid;
    public String desc;
    public String name;
    public String playUrl;
    public Integer order;
    public String source;
    public Boolean isVip;
}
