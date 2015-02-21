package com.bs.apibs.client.remote;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ServicioOauthResponse<T> {
	@JsonProperty("data") private T data;
	@JsonProperty("head") private HeadResponse head;

	@JsonCreator
	public ServicioOauthResponse(@JsonProperty("data") T data,@JsonProperty("head") HeadResponse head) {
		this.data = data;
		this.head = head;
	}
	
	public ServicioOauthResponse() {}

	public HeadResponse getHead() {
		return head;
	}

	public void setHead(HeadResponse head) {
		this.head = head;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
