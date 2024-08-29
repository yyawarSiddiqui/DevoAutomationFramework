package com.pojo;

public class MstOem {

	private int id;
	private String name;
	private String code;
	private int is_active;
	private String created_at;
	private String modified_at;

	public MstOem(int id, String name, String code, int is_active, String created_at, String modified_at) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.is_active = is_active;
		this.created_at = created_at;
		this.modified_at = modified_at;
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

	public int getIs_active() {
		return is_active;
	}

	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getModified_at() {
		return modified_at;
	}

	public void setModified_at(String modified_at) {
		this.modified_at = modified_at;
	}

	@Override
	public String toString() {
		return "MstOem [id=" + id + ", name=" + name + ", code=" + code + ", is_active=" + is_active + ", created_at="
				+ created_at + ", modified_at=" + modified_at + "]";
	}

}
