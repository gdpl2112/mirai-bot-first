package io.github.kloping.mirai0.commons.apiEntitys.mihoyoYuanshenDetail;

public class Data {
    private List[] list;
    private Article article;

    public List[] getList() {
        return this.list;
    }

    public Data setList(List[] list) {
        this.list = list;
        return this;
    }

    public Article getArticle() {
        return this.article;
    }

    public Data setArticle(Article article) {
        this.article = article;
        return this;
    }
}