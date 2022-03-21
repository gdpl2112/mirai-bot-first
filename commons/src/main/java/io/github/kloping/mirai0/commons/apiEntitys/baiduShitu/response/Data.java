package io.github.kloping.mirai0.commons.apiEntitys.baiduShitu.response;

public class Data {
	private String ajaxTextUrl;
	private String imageUrl;
	private Number length;
	private List[] list;

	public String getAjaxTextUrl(){
		return this.ajaxTextUrl;
	}

	public Data setAjaxTextUrl(String ajaxTextUrl) {
		this.ajaxTextUrl = ajaxTextUrl;
		return this;
	}

	public String getImageUrl(){
		return this.imageUrl;
	}

	public Data setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		return this;
	}

	public Number getLength(){
		return this.length;
	}

	public Data setLength(Number length) {
		this.length = length;
		return this;
	}

	public List[] getList(){
		return this.list;
	}

	public Data setList(List[] list) {
		this.list = list;
		return this;
	}
}