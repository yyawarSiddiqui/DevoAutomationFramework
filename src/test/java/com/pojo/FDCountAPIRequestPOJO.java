package com.pojo;

import java.util.Arrays;

public class FDCountAPIRequestPOJO {

	private String message;
	private DataPOJOFDCount data[];

	public FDCountAPIRequestPOJO(String message, DataPOJOFDCount[] data) {
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

	public DataPOJOFDCount[] getData() {
		return data;
	}

	public void setData(DataPOJOFDCount[] data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "FDCountAPIRequest [message=" + message + ", data=" + Arrays.toString(data) + "]";
	}

}
