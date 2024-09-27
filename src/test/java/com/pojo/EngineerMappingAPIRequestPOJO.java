package com.pojo;

public class EngineerMappingAPIRequestPOJO {

	private String message;
	private EngineerMappingAPIRequestData[] data;
	
	public EngineerMappingAPIRequestPOJO(String message, EngineerMappingAPIRequestData[] data) {
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

	public EngineerMappingAPIRequestData[] getData() {
		return data;
	}

	public void setData(EngineerMappingAPIRequestData[] data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "EngineerMappingAPIRequestPOJO [message=" + message + ", data=" + data + "]";
	}

	
}
