package io.github.klopin.test0.kp.interfaces;

import io.github.klopin.test0.kp.entity.QuestionData;
import io.github.klopin.test0.kp.entity.pre.Data;
import io.github.klopin.test0.kp.entity.pre.QuestionIdData;
import io.github.kloping.MySpringTool.annotations.http.DefaultValue;
import io.github.kloping.MySpringTool.annotations.http.GetPath;
import io.github.kloping.MySpringTool.annotations.http.HttpClient;
import io.github.kloping.MySpringTool.annotations.http.ParamName;

/**
 * @author github.kloping
 */
@HttpClient("https://api2.jiakaobaodian.com")
public interface JiaKaoBaoDian {
    /**
     * _r=116350158762969064095
     * carType=car
     * chapterId=121
     * cityCode=341300
     * course=kemu1
     * tagId=121
     * _=0.644750856067857
     *
     * @param _r
     * @param carType
     * @param cityCode
     * @param course
     * @param tagId
     * @param chapterId
     * @return
     */
    @GetPath("api/open/exercise/chapter.htm")
    QuestionIdData ids(
            @ParamName("_r")
                    String _r,
            @ParamName("carType")
            @DefaultValue("car")
                    String carType,
            @ParamName("cityCode")
            @DefaultValue("341300")
                    Integer cityCode,
            @ParamName("course")
            @DefaultValue("kemu1")
                    String course,
            @ParamName("tagId")
                    Integer tagId,
            @ParamName("chapterId")
                    Integer chapterId
    );

    /**
     * @param _r
     * @param data
     * @return
     */
    @GetPath("api/open/question/question-list.htm")
    QuestionData data(@ParamName("_r") String _r, @ParamName("questionIds") Data data);

    /**
     * @param _r
     * @param ids
     * @return
     */
    @GetPath("api/open/question/question-list.htm")
    QuestionData data(@ParamName("_r") String _r, @ParamName("questionIds") String ids);

}
