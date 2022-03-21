package io.github.kloping.mirai0.commons.apiEntitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class VideoSource {
    private Integer num;
    private String keyword;
    private MediaSource[] data;
    private Long time;
    private String source;
    private Integer state;
}
