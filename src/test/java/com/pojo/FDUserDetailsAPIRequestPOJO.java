package com.pojo;

public class FDUserDetailsAPIRequestPOJO {

	private String message;
	private dataPOJO data;
	
	public FDUserDetailsAPIRequestPOJO(String message, dataPOJO data) {
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

	public dataPOJO getData() {
		return data;
	}

	public void setData(dataPOJO data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "FDUserDetailsAPIRequest [message=" + message + ", data=" + data + "]";
	}
	


}
