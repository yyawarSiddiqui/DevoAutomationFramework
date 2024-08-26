package com.pojo;

public class problemsPOJO {

	private int id;
	private String remark;

	public problemsPOJO(int id, String remark) {
		super();
		this.id = id;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "problemsPOJO [id=" + id + ", remark=" + remark + "]";
	}

}
