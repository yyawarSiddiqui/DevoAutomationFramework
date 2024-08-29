package com.pojo;

public class FDDashboardDetailsAPIRequestPOJO {

	private String details_key;

	public FDDashboardDetailsAPIRequestPOJO(String details_key) {
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
		return "FDDashboardDetailsAPIRequestPOJO [details_key=" + details_key + "]";
	}

}
