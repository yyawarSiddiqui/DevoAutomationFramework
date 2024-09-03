package com.api.tests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.utility.TestUtility.*;

import io.restassured.http.Header;

public class MasterAPIRequest {

	
	Header MyHeader;
	
	static {
		baseURI = "http://139.59.91.96:9000/v1";
	}

	
	@BeforeMethod(description="Initialize header")
	public void Setup() {
		
		 MyHeader = new Header("Authorization", getToken("fd"));
		
	}
	
	@Test(description = "test master API Test post request", groups = { "sanity", "smoke" })
	public void masterApiTest() {

		 given()
		.header(MyHeader)
		.contentType("application/json")
		.post("/master")
			.then()
		.log().all()
			.assertThat()
		.statusCode(200);
//			.extract()
//		.as(null);
		
	}

}
