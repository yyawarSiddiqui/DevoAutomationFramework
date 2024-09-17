package com.pojo;

public final class CreateJobResponsePojo {
	
	private String message;
	private CreateJobResponseData data;
	
	public CreateJobResponsePojo(String message, CreateJobResponseData data) {
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

	public CreateJobResponseData getData() {
		return data;
	}

	public void setData(CreateJobResponseData data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "CreateJobResponsePojo [message=" + message + ", data=" + data + "]";
	} 
	
	
	
	

}
