package com.api.tests;

import static com.utility.TestUtility.*;

import static io.restassured.RestAssured.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.http.Header;

public class CreateJobAPIRequest {

	private Header myheader;
	
	static {

		baseURI = "http://139.59.91.96:9000/v1";
	}

	@BeforeMethod(description="Initializing the header")
	public void setup() {
		
		myheader=new Header("Authorization",
				getToken("fd"));

	}
	
	@Test(description="test CreateJobAPIRequest post Method" , groups= {"sanity"})
	public void CreateJobAPIRequestTest() {

		
		given()
			.contentType("application/json")
		.header(myheader)
			.and()
		.body(convertPOJOTOJSON(getCreateJobJsonData()))
		.log().all()
			.when()
		. post("/job/create")
			.then()
		.log().all()
			.assertThat()
		.statusCode(200)
		.extract()
		.body();

	}

}
