package com.api.tests;

import org.testng.annotations.*;

import com.pojo.AssignEngineerAPIRequestPOJO;
import com.pojo.AssignEngineerAPIResponsePOJO;
import com.utility.TestUtility;

import static io.restassured.RestAssured.*;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class AssignEngineerAPIRequestTest {

	Header Myheader;
	AssignEngineerAPIResponsePOJO assignEngineerAPIResponsePOJO;

	static {

		baseURI = "http://139.59.91.96:9000/v1";
	}

	@BeforeMethod
	public void Setup() {

		Myheader = new Header("Authorization", TestUtility.getToken("eng"));

	}
	
	@Test(dependsOnGroups = {"createJob"})
	public void Test01() {
		
		Response response=given()
			.header(Myheader)
			.contentType("application/json")
		.and()
			.body(TestUtility.convertPOJOTOJSON(TestUtility.AssignEngineerAPIRequestPOJOData()))
			.log().all()
		.when()
			.post("/engineer/assign");
		
			
		
		assignEngineerAPIResponsePOJO=TestUtility.convertJSONTOPOJOAssignEngineerResponse(response.asString());
		System.out.println(assignEngineerAPIResponsePOJO);
		
			
	}

}
