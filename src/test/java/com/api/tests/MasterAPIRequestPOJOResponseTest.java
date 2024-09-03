package com.api.tests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pojo.MasterAPIRequestPOJOResponse;
import com.utility.TestUtility;

import io.restassured.http.Header;

public class MasterAPIRequestPOJOResponseTest {

	private Header Myheader;

	static {

		baseURI = "http://139.59.91.96:9000/v1";
	}

	@BeforeMethod(description = "Initializing the header")
	public void setup() {

		Myheader = new Header("Authorization", TestUtility.getToken("fd"));
	}
	
	@Test(description="Testing get request", groups= {"smoke"})
	public void MasterAPIRequestPOJOResponseAPITest()
	{
	
	//	MasterAPIRequestPOJOResponse masterAPIRequestPOJOResponse	=
				given()
		.header(Myheader)
			.and()
		.contentType("text/plain")
			.post("/master")
		.then()
			.log().all();
//		.extract()
//		.as(MasterAPIRequestPOJOResponse.class);
		
		
	}
}
