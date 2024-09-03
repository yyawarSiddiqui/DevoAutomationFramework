package com.api.tests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utility.TestUtility;

import io.restassured.http.Header;

public class PendingForJobAssignment {

	Header MyHeader;
	static {

		baseURI = "http://139.59.91.96:9000/v1";

	}
	
	@BeforeMethod
	public void Setup() {
		
		 MyHeader = new Header("Authorization", TestUtility.getToken("fd"));

	}

	@Test(description = "Test PendingForJobAssignment get Request ")
	public void PendingForJobAssignmentTest() {

		
		given()
		.when()
		.header(MyHeader)
		.get("/job/pending")
		.then()
		.log().all()
		.assertThat()
		.statusCode(200);
		//.body("messsage", Matchers.equalTo("Success"));

	}

}
