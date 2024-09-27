package com.api.tests;

import static io.restassured.RestAssured.*;
import org.testng.annotations.*;

import com.pojo.LoginEngineerAPIResponsePOJO;

import static com.utility.TestUtility.*;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class LoginEngineerAPIRequestTest {
	Header header;

	static {

		baseURI = "http://139.59.91.96:9000/v1";
	}

	@BeforeMethod(description = "Initializing the Header")
	public void Setup() {

		header = new Header("Authorization", getToken("eng"));
	}

	@Test(description="Testing the login api for engineer Creds")
	public void Test() {

		Response response=given()
			.header(header)
			.contentType("application/json")
		.and()
			.body(convertPOJOTOJSON(getLoginEngineerAPIRequestdata()))
			.log().all()
		.when()
			.post("/login");
		
		response.then().assertThat().statusCode(200);
//		.then().log().all()
//		.statusCode(200);
		
		
		LoginEngineerAPIResponsePOJO  loginEngineerAPIResponsePOJO =convertJSONTOPOJOLoginEngineerAPIResponsePOJO(response.asString());
		
		
		String tokenGenerated=loginEngineerAPIResponsePOJO.getData().getToken();// we Can use this token in other APIS
	}
	
	

}
