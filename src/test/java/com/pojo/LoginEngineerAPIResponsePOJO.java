package com.pojo;

public class LoginEngineerAPIResponsePOJO {

	private String message;
	private dataEngineerloginResponse data;

	public LoginEngineerAPIResponsePOJO(String message, dataEngineerloginResponse data) {
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

	public dataEngineerloginResponse getData() {
		return data;
	}

	public void setData(dataEngineerloginResponse data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "LoginEngineerAPIResponsePOJO [message=" + message + ", data=" + data + "]";
	}

}
