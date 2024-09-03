package com.api.tests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import static com.utility.TestUtility.*;

import io.restassured.http.Header;

public class EngineerDetailsRequest {

	static {

		baseURI = "http://139.59.91.96:9000/v1";
	}

	@Test(description = "Test EngineerDetailsRequest get Request", groups = { "sanity" })
	public void EngineerDetailsRequestTest() {

		Header MyHeader = new Header("Authorization", getToken("fd"));

		String Message=given()
		.contentType("application/json")
		.header(MyHeader)
		.get("/engineer/mapped")
		.then()
		.log().all()
		.assertThat()
		.statusCode(200)
		.extract().jsonPath().getString("data[0].id");
		
		
	}
}
