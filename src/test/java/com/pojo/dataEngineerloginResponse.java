package com.pojo;

public class dataEngineerloginResponse {

	private String token;

	public dataEngineerloginResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "dataEngineerloginResponse [token=" + token + "]";
	}

}
