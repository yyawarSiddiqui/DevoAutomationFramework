package com.pojo;

public class LoginRequestPOJO {

	private String username;
	
	private String password;

	private static int x;
	
	static {
		System.out.println("Inside POJO");
		x=10;
	}
	
	public LoginRequestPOJO(String username, String password) {
		super();
		System.out.println("Inside Constructor");
		this.username = username;
		this.password = password;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		
		return "LoginRequestPOJO [username=" + username + ", password=" + password + "]";
		
	}
	
	
	
}
