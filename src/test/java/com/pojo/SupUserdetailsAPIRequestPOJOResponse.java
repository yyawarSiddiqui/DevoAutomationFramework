package com.pojo;

public class SupUserdetailsAPIRequestPOJOResponse {

	private String message;
	private dataPOJOSUPUSERdetail data;
	
	public SupUserdetailsAPIRequestPOJOResponse(String message, dataPOJOSUPUSERdetail data) {
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

	public dataPOJOSUPUSERdetail getData() {
		return data;
	}

	public void setData(dataPOJOSUPUSERdetail data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "SupUserdetailsAPIRequestPOJOResponse [message=" + message + ", data=" + data + "]";
	}
	
	
	
}
