package com.api.tests;

import com.pojo.LoginRequestPOJO;
import static com.utility.TestUtility.*;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;

import io.restassured.http.Header;

public class LoginAPIRequests {

	static {
		baseURI = "http://139.59.91.96:9000/v1";
	}

	public static void main(String[] args) {

		Header myheader = new Header("Content-Type", "application/json");

		// Make a Request//

		// Return Request Specification to pass the
		// parameters i.e. Allows you to specify how
		// the request will look like.

		LoginRequestPOJO loginRequestPOJO = new LoginRequestPOJO("iamfd", "password");
				 given()
				.when()
					.header(myheader)
				.and()
					.body(convertPOJOTOJSON(loginRequestPOJO))
				.and()
					.log().all()
					.post("/login")
				.then()
					.log().all()
					.assertThat()
					.statusCode(200)
				.and()
					.time(Matchers.lessThan(2000L))
					.body("message", Matchers.equalTo("Success"))
					.body("data.token", Matchers.equalTo("sfds"))
				.and()
				.extract().jsonPath().getString("data.token");
					
		

//		System.out.println("Response_Body" + response.asPrettyString());
//		System.out.println("Status_Code=" + response.statusCode());

	}

}
