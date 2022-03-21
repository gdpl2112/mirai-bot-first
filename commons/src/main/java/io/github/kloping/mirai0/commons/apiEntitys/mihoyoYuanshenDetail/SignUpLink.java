package io.github.kloping.mirai0.commons.apiEntitys.mihoyoYuanshenDetail;

public class SignUpLink {
	private String sub;
	private Boolean download;
	private Boolean ready;
	private String link;
	private String text;
	private String video;

	public String getSub(){
		return this.sub;
	}

	public SignUpLink setSub(String sub) {
		this.sub = sub;
		return this;
	}

	public Boolean getDownload(){
		return this.download;
	}

	public SignUpLink setDownload(Boolean download) {
		this.download = download;
		return this;
	}

	public Boolean getReady(){
		return this.ready;
	}

	public SignUpLink setReady(Boolean ready) {
		this.ready = ready;
		return this;
	}

	public String getLink(){
		return this.link;
	}

	public SignUpLink setLink(String link) {
		this.link = link;
		return this;
	}

	public String getText(){
		return this.text;
	}

	public SignUpLink setText(String text) {
		this.text = text;
		return this;
	}

	public String getVideo(){
		return this.video;
	}

	public SignUpLink setVideo(String video) {
		this.video = video;
		return this;
	}
}