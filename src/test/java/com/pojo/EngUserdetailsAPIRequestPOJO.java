package com.pojo;

public class EngUserdetailsAPIRequestPOJO {

	private String message;
	private EngUserdetailsAPIRequestdata data;
	
	public EngUserdetailsAPIRequestPOJO(String message, EngUserdetailsAPIRequestdata data) {
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

	public EngUserdetailsAPIRequestdata getData() {
		return data;
	}

	public void setData(EngUserdetailsAPIRequestdata data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "EngUserdetailsAPIRequestPOJO [message=" + message + ", data=" + data + "]";
	}
	
	
	
	
}
