package com.api.tests;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.utility.TestUtility.*;

import static io.restassured.RestAssured.*;
import io.restassured.http.Header;

public class FDCountAPIRequest {

	private Header myheader;

	static {

		baseURI = "http://139.59.91.96:9000/v1";
	}

	@BeforeMethod
	public void Setup() {

		myheader = new Header("Authorization", getToken("fd"));
	}

	@Test(description="Test FDCountAPIRequest get request")
	public  void FDCountAPIRequestTest() {

		//FDCountAPIRequestPOJO FDCountAPIRequestPOJO = 
				given()
		.when()
			.header(myheader)
		.and().
			get("/dashboard/count")
		.then()
		.log().all()
			.assertThat()
		.statusCode(200)
			.time(Matchers.lessThan(2000l));
//		.extract()
//			.as(FDCountAPIRequestPOJO.class);

		
	}

}
