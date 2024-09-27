package com.pojo;

import java.util.Arrays;

public class PendingJobApiRequestPOJO {

	private String message;
	private pendingjobAPIdata[] data;

	public PendingJobApiRequestPOJO(String message, pendingjobAPIdata[] data) {
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

	public pendingjobAPIdata[] getData() {
		return data;
	}

	public void setData(pendingjobAPIdata[] data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "PendingJobApiRequestPOJO [message=" + message + ", data=" + Arrays.toString(data) + "]";
	}

}
