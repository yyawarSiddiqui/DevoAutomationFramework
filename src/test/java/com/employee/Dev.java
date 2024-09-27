package com.employee;

public final class  Dev extends Emp {

	public Dev(int eMPid, String projectName, String skillSet) {
		
		super(eMPid, projectName, skillSet); // This Keyword is use to call parent class constructor from child class Constructor
		
		
		
	}

	@Override
	public String toString() {
		return "Dev [getEMPid()=" + getEMPid() + ", getProjectName()=" + getProjectName() + ", getSkillSet()="
				+ getSkillSet() + "]";
	}

	
}
