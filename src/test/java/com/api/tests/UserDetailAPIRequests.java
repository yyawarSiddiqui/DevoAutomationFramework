package com.api.tests;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static com.utility.TestUtility.*;

import io.restassured.http.Header;
import io.restassured.module.jsv.JsonSchemaValidator;

public class UserDetailAPIRequests {
	static {

		baseURI = "http://139.59.91.96:9000/v1";
	}
	
	private File JSonSchemaFile=new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"responseSchema"+File.separator+"UserDetailAPIRequests.json");

	@Test(description = "Test get UserDetailAPIRequests")
	public void UserDetailAPIRequestsTest() {

		Header Myheader = new Header("Authorization", getToken("fd"));

//		FDUserDetailsAPIRequestPOJO fDUserDetailsAPIRequestPOJO=
		given()
				.when()
					.header(Myheader)
				.and()
					.get("userdetails")
				.then()
					.log().all()
				.and()
					.assertThat()
				.statusCode(200)
					.body("message", Matchers.equalTo("Success"))
				.body(JsonSchemaValidator.matchesJsonSchema(JSonSchemaFile));
					//.extract()
//				.as(FDUserDetailsAPIRequestPOJO.class);
//		
//		//System.out.println(fDUserDetailsAPIRequestPOJO);
//		System.out.println(convertPOJOTOJSON(fDUserDetailsAPIRequestPOJO));


	}

}
