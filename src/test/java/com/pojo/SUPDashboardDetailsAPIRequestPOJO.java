package com.pojo;

public class SUPDashboardDetailsAPIRequestPOJO {

	private String details_key;

	public SUPDashboardDetailsAPIRequestPOJO(String details_key) {
		super();
		this.details_key = details_key;
	}

	public String getDetails_key() {
		return details_key;
	}

	public void setDetails_key(String details_key) {
		this.details_key = details_key;
	}

	@Override
	public String toString() {
		return "SUPDashboardDetailsAPIRequestPOJO [details_key=" + details_key + "]";
	}
	
	
}
