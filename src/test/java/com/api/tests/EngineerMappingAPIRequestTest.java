package com.api.tests;

import org.testng.annotations.BeforeMethod;

import com.utility.TestUtility;

import static io.restassured.RestAssured.*;
import io.restassured.http.Header;
import org.testng.annotations.Test;

public class EngineerMappingAPIRequestTest {

	Header Myheader;

	static {

		baseURI = "http://139.59.91.96:9000/v1";
	}

	@BeforeMethod()
	public void Setup() {

		Myheader = new Header("Authorization", TestUtility.getToken("sup"));

	}
	
	@Test()
	public void  Test() {
		
		given()
			.header(Myheader)
		.and()
			.contentType("application/json")
		.get("/engineer/mapped")
			.then()
		.log().all()
			.assertThat()
		.statusCode(200);
		
	}

}
