package com.pojo;

import java.util.Arrays;

public class EngCountAPIResponsePOJO {

	private String message;
	private EngCountAPIResponseData[] data;
	
	public EngCountAPIResponsePOJO(String message, EngCountAPIResponseData[] data) {
		super();
		this.message = message;
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public EngCountAPIResponseData[] getData() {
		return data;
	}

	public void setData(EngCountAPIResponseData[] data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "EngCountAPIResponsePOJO [message=" + message + ", data=" + Arrays.toString(data) + "]";
	}
	
	
}
