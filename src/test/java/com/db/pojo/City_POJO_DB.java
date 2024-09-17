package com.db.pojo;

public class City_POJO_DB {

	private int id;
	private String name;
	private String code;

	public City_POJO_DB(int id, String name, String code) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "City_POJO_DB [id=" + id + ", name=" + name + ", code=" + code + ", ]";
	}

}
