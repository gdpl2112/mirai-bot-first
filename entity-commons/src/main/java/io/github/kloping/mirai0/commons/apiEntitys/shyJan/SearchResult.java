package io.github.kloping.mirai0.commons.apiEntitys.shyJan;

/**
 * @author github-kloping
 */
public class SearchResult {
	private String msg;
	private String code;
	private SearchData[] list;
	private String status;

	public String getMsg(){
		return this.msg;
	}

	public SearchResult setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	public String getCode(){
		return this.code;
	}

	public SearchResult setCode(String code) {
		this.code = code;
		return this;
	}

	public SearchData[] getList(){
		return this.list;
	}

	public SearchResult setList(SearchData[] list) {
		this.list = list;
		return this;
	}

	public String getStatus(){
		return this.status;
	}

	public SearchResult setStatus(String status) {
		this.status = status;
		return this;
	}
}