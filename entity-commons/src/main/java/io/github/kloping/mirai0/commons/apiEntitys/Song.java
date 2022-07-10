package io.github.kloping.mirai0.commons.apiEntitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author github-kloping
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Song {
    private String lyric;
    private String media_name;
    private String author_name;
    private String imgUrl;
    private String songUrl;
}
