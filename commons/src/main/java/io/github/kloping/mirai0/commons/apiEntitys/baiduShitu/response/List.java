package io.github.kloping.mirai0.commons.apiEntitys.baiduShitu.response;

public class List {
	private String fromUrl;
	private Number width;
	private String objUrl;
	private Number index;
	private String contsign;
	private String thumbUrl;
	private Number height;

	public String getFromUrl(){
		return this.fromUrl;
	}

	public List setFromUrl(String fromUrl) {
		this.fromUrl = fromUrl;
		return this;
	}

	public Number getWidth(){
		return this.width;
	}

	public List setWidth(Number width) {
		this.width = width;
		return this;
	}

	public String getObjUrl(){
		return this.objUrl;
	}

	public List setObjUrl(String objUrl) {
		this.objUrl = objUrl;
		return this;
	}

	public Number getIndex(){
		return this.index;
	}

	public List setIndex(Number index) {
		this.index = index;
		return this;
	}

	public String getContsign(){
		return this.contsign;
	}

	public List setContsign(String contsign) {
		this.contsign = contsign;
		return this;
	}

	public String getThumbUrl(){
		return this.thumbUrl;
	}

	public List setThumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
		return this;
	}

	public Number getHeight(){
		return this.height;
	}

	public List setHeight(Number height) {
		this.height = height;
		return this;
	}
}