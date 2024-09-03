package com.api.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.utility.TestUtility.*;

import static io.restassured.RestAssured.*;
import io.restassured.http.Header;

public class SUPLoginrequest {
	

	Header MyHeader;
	
	static {

		baseURI = "http://139.59.91.96:9000/v1";
	}

	@BeforeMethod(description="initializing header")
	public void setup() {
		
		 MyHeader = new Header("Authorization", getToken("fd"));
	}
	
	@Test(description = "", groups = { "smoke" })
	public void SUPLoginrequestTest() {

		given()
		.header(MyHeader)
		.contentType("application/json")
		.body(convertPOJOTOJSON(getLoginSupervisorAPIRequestData()))
		.post("/login")
		.then()
		.log().all();

	}

}
