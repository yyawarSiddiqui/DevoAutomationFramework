package com.employee;

public abstract class Emp {
	
	private int EMPid;
	private String ProjectName;
	private String SkillSet;
	
	
	public Emp(int eMPid, String projectName, String skillSet) {
		super();
		EMPid = eMPid;
		ProjectName = projectName;
		SkillSet = skillSet;
	}
	public int getEMPid() {
		return EMPid;
	}
	public void setEMPid(int eMPid) {
		EMPid = eMPid;
	}
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	public String getSkillSet() {
		return SkillSet;
	}
	public void setSkillSet(String skillSet) {
		SkillSet = skillSet;
	}
	@Override
	public String toString() {
		return "Emp [EMPid=" + EMPid + ", ProjectName=" + ProjectName + ", SkillSet=" + SkillSet + "]";
	}

	
}
