package com.api.tests;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.utility.TestUtility.*;

import io.restassured.http.Header;

public class FDDashboardDetailsAPIRequestPOJOTest {

	private Header myHeader;

	static {

		baseURI = "http://139.59.91.96:9000/v1";
	}

	@BeforeMethod(description = "Initializing the header")
	public void Setup() {

		myHeader = new Header("Authorization",
				 getToken("fd"));
	}

	@Test(description="Test the post request of FDDashboardDetailsAPIRequest")
	public void FDDashboardDetailsAPIRequestPOJOTest2() {

		String jobNumber= given()
		.header(myHeader)
			.and()
		.contentType("application/json")
			.when()
		.body(convertPOJOTOJSON(getFDDashboardDetailsAPIRequestPOJOData()))
			.log().all()
		.post("/dashboard/details")
		.then()
		.log().all()
		.assertThat()
		.statusCode(200)
		.body("message", equalTo("Success"))
		.extract().jsonPath().getString("data[1].job_number");
		
		System.out.println(jobNumber);
		
	}

}
