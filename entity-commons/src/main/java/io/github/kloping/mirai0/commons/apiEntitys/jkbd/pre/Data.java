package io.github.kloping.mirai0.commons.apiEntitys.jkbd.pre;

/**
 * @author github-kloping
 */
public class Data {
    private Chapter chapter;
    private Number[] questionList;

    public Chapter getChapter() {
        return this.chapter;
    }

    public Data setChapter(Chapter chapter) {
        this.chapter = chapter;
        return this;
    }

    public Number[] getQuestionList() {
        return this.questionList;
    }

    public Data setQuestionList(Number[] questionList) {
        this.questionList = questionList;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Number number : questionList) {
            sb.append(number.toString()).append("%2C");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}