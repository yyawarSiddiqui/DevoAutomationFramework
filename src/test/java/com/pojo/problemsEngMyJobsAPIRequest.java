package com.pojo;

public class problemsEngMyJobsAPIRequest {


	private int id; 
	private String name; 
	private int tr_job_head_id;
	private String remark;
	private String added_by; 
	private String role_name; 
	private String created_at;
	
	public problemsEngMyJobsAPIRequest(int id, String name, int tr_job_head_id, String remark, String added_by,
			String role_name, String created_at) {
		super();
		this.id = id;
		this.name = name;
		this.tr_job_head_id = tr_job_head_id;
		this.remark = remark;
		this.added_by = added_by;
		this.role_name = role_name;
		this.created_at = created_at;
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

	public int getTr_job_head_id() {
		return tr_job_head_id;
	}

	public void setTr_job_head_id(int tr_job_head_id) {
		this.tr_job_head_id = tr_job_head_id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAdded_by() {
		return added_by;
	}

	public void setAdded_by(String added_by) {
		this.added_by = added_by;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	@Override
	public String toString() {
		return "problemsEngMyJobsAPIRequest [id=" + id + ", name=" + name + ", tr_job_head_id=" + tr_job_head_id
				+ ", remark=" + remark + ", added_by=" + added_by + ", role_name=" + role_name + ", created_at="
				+ created_at + "]";
	} 
	
	
	
}
