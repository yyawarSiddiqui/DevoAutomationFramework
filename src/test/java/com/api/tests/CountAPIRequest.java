package com.api.tests;

import io.restassured.http.Header;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utility.TestUtility;

import static io.restassured.RestAssured.*;

public class CountAPIRequest {
	
	private Header MyHeader;
	

	static {
		
		baseURI = "http://139.59.91.96:9000/v1";
	}
	
	@BeforeMethod(description="Initializing the headers")
	public void setup() {

		MyHeader = new Header("Authorization", TestUtility.getToken("fd"));

	}

	@Test(description = "test CountAPIRequest get Request", groups = { "sanity" })
	public void CountAPIRequestTest() {

		 given()
		 	.header(MyHeader)
		.get("/dashboard/count")
			.then()
		.log().all()
			.assertThat()
		.statusCode(200)
		.body("message", Matchers.equalTo("Success"))
		.body("data[0].label", Matchers.equalTo("Pending for delivery"));
		
		

	}

}
