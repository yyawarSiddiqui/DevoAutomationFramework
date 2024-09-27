package com.pojo;

public class AssignEngineerAPIRequestPOJO {

	private String	job_id; 
	private int  engineer_id;
	
	public AssignEngineerAPIRequestPOJO(String job_id, int engineer_id) {
		super();
		this.job_id = job_id;
		this.engineer_id = engineer_id;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public int getEngineer_id() {
		return engineer_id;
	}

	public void setEngineer_id(int engineer_id) {
		this.engineer_id = engineer_id;
	}

	@Override
	public String toString() {
		return "AssignEngineerAPIRequestPOJO [job_id=" + job_id + ", engineer_id=" + engineer_id + "]";
	} 
	
	

}
