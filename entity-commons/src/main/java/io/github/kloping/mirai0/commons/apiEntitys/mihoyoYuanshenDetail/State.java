package io.github.kloping.mirai0.commons.apiEntitys.mihoyoYuanshenDetail;

public class State {
    private String referrer;
    private SignUpLink signUpLink;
    private Boolean skipConcept;
    private Boolean showDialog;
    private String btnStatus;
    private String preScrollTop;
    private Boolean hasFooter;
    private SocialInfo socialInfo;
    private String loginNum;
    private User user;
    private HeaderStyle headerStyle;

    public String getReferrer() {
        return this.referrer;
    }

    public State setReferrer(String referrer) {
        this.referrer = referrer;
        return this;
    }

    public SignUpLink getSignUpLink() {
        return this.signUpLink;
    }

    public State setSignUpLink(SignUpLink signUpLink) {
        this.signUpLink = signUpLink;
        return this;
    }

    public Boolean getSkipConcept() {
        return this.skipConcept;
    }

    public State setSkipConcept(Boolean skipConcept) {
        this.skipConcept = skipConcept;
        return this;
    }

    public Boolean getShowDialog() {
        return this.showDialog;
    }

    public State setShowDialog(Boolean showDialog) {
        this.showDialog = showDialog;
        return this;
    }

    public String getBtnStatus() {
        return this.btnStatus;
    }

    public State setBtnStatus(String btnStatus) {
        this.btnStatus = btnStatus;
        return this;
    }

    public String getPreScrollTop() {
        return this.preScrollTop;
    }

    public State setPreScrollTop(String preScrollTop) {
        this.preScrollTop = preScrollTop;
        return this;
    }

    public Boolean getHasFooter() {
        return this.hasFooter;
    }

    public State setHasFooter(Boolean hasFooter) {
        this.hasFooter = hasFooter;
        return this;
    }

    public SocialInfo getSocialInfo() {
        return this.socialInfo;
    }

    public State setSocialInfo(SocialInfo socialInfo) {
        this.socialInfo = socialInfo;
        return this;
    }

    public String getLoginNum() {
        return this.loginNum;
    }

    public State setLoginNum(String loginNum) {
        this.loginNum = loginNum;
        return this;
    }

    public User getUser() {
        return this.user;
    }

    public State setUser(User user) {
        this.user = user;
        return this;
    }

    public HeaderStyle getHeaderStyle() {
        return this.headerStyle;
    }

    public State setHeaderStyle(HeaderStyle headerStyle) {
        this.headerStyle = headerStyle;
        return this;
    }
}