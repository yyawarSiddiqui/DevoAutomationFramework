package com.api.tests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pojo.SupUserdetailsAPIRequestPOJOResponse;
import com.utility.TestUtility;

import static com.utility.TestUtility.*;

import io.restassured.http.Header;

public class SupUserdetailsAPIRequestTest {

	Header MyHeader;

	static {

		baseURI = "http://139.59.91.96:9000/v1";
	}

	@BeforeMethod(description = "initialize header of request")
	public void Setup() {

		MyHeader = new Header("Authorization", getToken("fd"));

	}

	@Test(description="Testing the SupUserdetailsAPI Get Request", groups= {"Sanity"})
	public void SupUserdetailsAPIRequestTest2() {
		
		
		SupUserdetailsAPIRequestPOJOResponse supUserdetailsAPIRequestPOJOResponse=given()
		.header(MyHeader)
			.and()
		.get("userdetails")
		.then()
			.log().all()
			.assertThat()
			.statusCode(200)
		.extract()
		.as(SupUserdetailsAPIRequestPOJOResponse.class);// This will assign Values in response to respective pojos
		
		
		System.out.println(convertPOJOTOJSON(supUserdetailsAPIRequestPOJOResponse));
		
	}

}
