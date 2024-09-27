package com.pojo;

import java.util.Arrays;

public class EngMyJobsAPIRequestPOJO {
	
	private String message;
    private EngMyJobsAPIRequestdata[] data;
    
	public EngMyJobsAPIRequestPOJO(String message, EngMyJobsAPIRequestdata[] data) {
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

	public EngMyJobsAPIRequestdata[] getData() {
		return data;
	}

	public void setData(EngMyJobsAPIRequestdata[] data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "EngMyJobsAPIRequestPOJO [message=" + message + ", data=" + Arrays.toString(data) + "]";
	}
    
    

}
