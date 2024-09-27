package com.api.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.utility.TestUtility.*;

import static io.restassured.RestAssured.*;
import io.restassured.http.Header;

public class SUPCountAPIRequest {

	Header MyHeader;

	static {

		baseURI = "http://139.59.91.96:9000/v1";

	}

	@BeforeMethod(description="Intializing the header with token ")
	public void Setup() {
		
		MyHeader=new Header("Authorization", getToken("fd"));

	}
	
	@Test
	public void SUPCountAPIRequestTest() {
		
		given()
			.header(MyHeader)
		.contentType("application/json")
			.get("/dashboard/count")
		.then()
			.log().all()
		.assertThat()
		.statusCode(200);
		
		
	}
	
	
}
