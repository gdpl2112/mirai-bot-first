package io.github.klopin.test0;

import io.github.klopin.test0.kp.Utils;
import io.github.klopin.test0.kp.entity.QuestionData;
import io.github.klopin.test0.kp.entity.pre.QuestionIdData;
import io.github.klopin.test0.kp.interfaces.JiaKaoBaoDian;
import io.github.kloping.MySpringTool.StarterApplication;
import io.github.kloping.MySpringTool.annotations.AutoStand;
import io.github.kloping.MySpringTool.annotations.CommentScan;

/**
 * @author github.kloping
 */
@CommentScan(path = "io.github.klopin.test0.kp")
public class Test0 {

    @AutoStand
    static JiaKaoBaoDian networkInterface;

    public static void main(String[] args) {
        StarterApplication.run(Test0.class);
        QuestionIdData data = networkInterface.ids(Utils.f(1), null, null, null, 121, 121);
        QuestionData questionData = networkInterface.data(Utils.f(1)
                , data.getData().getQuestionList()[4].toString());
        System.out.println();
    }

}
