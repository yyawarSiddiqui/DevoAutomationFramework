package com.pojo;

import java.util.Arrays;

public class SUPCountAPIRequestPOJO {
	
	private String message;
	private dataSUPCountAPIRequestPOJO[] data;
	
	public SUPCountAPIRequestPOJO(String message, dataSUPCountAPIRequestPOJO[] data) {
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

	public dataSUPCountAPIRequestPOJO[] getData() {
		return data;
	}

	public void setData(dataSUPCountAPIRequestPOJO[] data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "SUPCountAPIRequestPOJO [message=" + message + ", data=" + Arrays.toString(data) + "]";
	}
	
	
	
	

}
