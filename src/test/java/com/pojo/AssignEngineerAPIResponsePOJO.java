package com.pojo;

import java.util.Arrays;

public class AssignEngineerAPIResponsePOJO {

	private String message;
	private AssignEngineerAPIResponsedata[] data;

	public AssignEngineerAPIResponsePOJO(String message, AssignEngineerAPIResponsedata[] data) {
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

	public AssignEngineerAPIResponsedata[] getData() {
		return data;
	}

	public void setData(AssignEngineerAPIResponsedata[] data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "AssignEngineerAPIResponse [message=" + message + ", data=" + Arrays.toString(data) + "]";
	}

}
