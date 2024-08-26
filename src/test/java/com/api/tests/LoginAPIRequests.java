package com.api.tests;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPIRequests {

	public static void main(String[] args) {

		RestAssured.baseURI = "http://139.59.91.96:9000/v1";

		Header myheader = new Header("Content-Type", "application/json");

		// Make a Request//

		RequestSpecification requestSpecification = RestAssured.given(); // Return Request Specification to pass the
																			// parameters i.e. Allows you to specify how
																			// the request will look like.

		requestSpecification.header(myheader);
		requestSpecification
				.body("{\r\n" + "    \"username\": \"iamfd\",\r\n" + "    \"password\": \"password\"\r\n" + "}");

		Response response = requestSpecification.post("login");
		System.out.println("Response_Body"+response.asPrettyString());
		System.out.println("Status_Code="+response.statusCode());

	}

}
