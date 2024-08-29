package com.pojo;

public class MasterAPIRequestPOJOResponse {

	
	private String message;
	private dataPOJOMaster  data;
	
	public MasterAPIRequestPOJOResponse(String message, dataPOJOMaster data) {
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

	public dataPOJOMaster getData() {
		return data;
	}

	public void setData(dataPOJOMaster data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "MasterAPIRequestPOJOResponse [message=" + message + ", data=" + data + "]";
	}
	
	
	
}
