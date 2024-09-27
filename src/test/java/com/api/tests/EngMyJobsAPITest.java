package com.api.tests;

import org.testng.annotations.BeforeMethod;

import com.pojo.EngMyJobsAPIRequestPOJO;
import com.pojo.EngMyJobsAPIRequestdata;
import com.pojo.problemsEngMyJobsAPIRequest;
import com.utility.TestUtility;
import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class EngMyJobsAPITest {

	Header MyHeader;
	EngMyJobsAPIRequestPOJO engMyJobsAPIRequestPOJO;
	
	static {

		baseURI = "http://139.59.91.96:9000/v1";
	}

	@BeforeMethod(description = "Initializing the Headers")
	public void Setup() {

		MyHeader = new Header("Authorization", TestUtility.getToken("eng"));

	}

	@Test
	public void Test() {
		
		Response response=given()
		.header(MyHeader)
			.and().log().all()
		.contentType("application/json")
			.when()
		.get("/engineer/myjobs");
		
		response.then().log().all();

		response.then().assertThat().statusCode(200);

		engMyJobsAPIRequestPOJO = TestUtility.convertJSONTOPOJOEngMyJobsAPIRequestPOJO(response.asPrettyString());
		
		EngMyJobsAPIRequestdata EngMyJobsAPIRequestdata=engMyJobsAPIRequestPOJO.getData()[1];
		problemsEngMyJobsAPIRequest problemsEngMyJobsAPIRequest	=EngMyJobsAPIRequestdata.getProblems()[0];
	    System.out.println(problemsEngMyJobsAPIRequest.getTr_job_head_id());
		
		//System.out.println(engMyJobsAPIRequestPOJO);
		
		//System.out.println(TestUtility.convertPOJOTOJSON(engMyJobsAPIRequestPOJO));
	
		 String jsondata=TestUtility.convertPOJOTOJSONByMapper(engMyJobsAPIRequestPOJO);
		
		 System.out.println(jsondata);
	
		 
}
}
