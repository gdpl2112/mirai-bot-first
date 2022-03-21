package io.github.kloping.mirai0.commons.apiEntitys.pvpQqCom.v1;

public class SCoverList {
	private String urlCI;
	private String size;
	private Number id;
	private String type;
	private String url;
	private String imgType;

	public String getUrlCI(){
		return this.urlCI;
	}

	public SCoverList setUrlCI(String urlCI) {
		this.urlCI = urlCI;
		return this;
	}

	public String getSize(){
		return this.size;
	}

	public SCoverList setSize(String size) {
		this.size = size;
		return this;
	}

	public Number getId(){
		return this.id;
	}

	public SCoverList setId(Number id) {
		this.id = id;
		return this;
	}

	public String getType(){
		return this.type;
	}

	public SCoverList setType(String type) {
		this.type = type;
		return this;
	}

	public String getUrl(){
		return this.url;
	}

	public SCoverList setUrl(String url) {
		this.url = url;
		return this;
	}

	public String getImgType(){
		return this.imgType;
	}

	public SCoverList setImgType(String imgType) {
		this.imgType = imgType;
		return this;
	}
}