package io.github.kloping.mirai0.commons.apiEntitys.mihoyoYuanshenDetail;

public class MihoyoYuanshenDetail {
	private String layout;
	private Data[] data;
	private State state;
	private String error;
	private Boolean serverRendered;

	public String getLayout(){
		return this.layout;
	}

	public MihoyoYuanshenDetail setLayout(String layout) {
		this.layout = layout;
		return this;
	}

	public Data[] getData(){
		return this.data;
	}

	public MihoyoYuanshenDetail setData(Data[] data) {
		this.data = data;
		return this;
	}

	public State getState(){
		return this.state;
	}

	public MihoyoYuanshenDetail setState(State state) {
		this.state = state;
		return this;
	}

	public String getError(){
		return this.error;
	}

	public MihoyoYuanshenDetail setError(String error) {
		this.error = error;
		return this;
	}

	public Boolean getServerRendered(){
		return this.serverRendered;
	}

	public MihoyoYuanshenDetail setServerRendered(Boolean serverRendered) {
		this.serverRendered = serverRendered;
		return this;
	}
}