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
public class VideoAnimeSource {
    public String keyword;
    public String from;
    public String name;
    public String desc;
    public String img;
    public String url;
    public Integer st;
    public VideoAnimeDetail[] details;
}
