package com.api.tests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.BeforeMethod;

import com.pojo.EngCountAPIResponseData;
import com.pojo.EngCountAPIResponsePOJO;
import com.utility.TestUtility;

import io.restassured.http.Header;
import io.restassured.response.Response;

import org.testng.annotations.Test;

public class EngCountAPIResponseTest {

	Header myHeader;
	EngCountAPIResponseData engCountAPIResponseData	;
	EngCountAPIResponseData[] engCountAPIResponseDatas;

	static {

		baseURI = "http://139.59.91.96:9000/v1";
	}

	@BeforeMethod(description = "Initializing the Headers")
	public void Setup() {

		myHeader = new Header("Authorization", TestUtility.getToken("eng"));

	}

	@Test(description = "Test the EngCountAPI Request")
	public void Test() {

		Response response=given()
		.header(myHeader)
		.and()
		.contentType("application/json")
		.get("/dashboard/count");
		
		EngCountAPIResponsePOJO engCountAPIResponsePOJO = TestUtility
				.convertJSONTOPOJOEngCountAPIResponse(response.asString());

		engCountAPIResponseData = engCountAPIResponsePOJO.getData()[0];
	
		
		engCountAPIResponseDatas = engCountAPIResponsePOJO.getData();
		
		for( EngCountAPIResponseData data:engCountAPIResponseDatas) {
			
			//System.out.println(data.getCount());
			
		}
		
		
	}

}
