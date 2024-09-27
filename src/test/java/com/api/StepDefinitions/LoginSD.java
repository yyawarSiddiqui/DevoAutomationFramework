package com.api.StepDefinitions;

import com.pojo.LoginRequestPOJO;
import com.utility.TestUtility;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;

public class LoginSD {

	Response response;
	RequestSpecification requestSpecification;

	@Given("The base URL of the Application is {string}")
	public void the_base_url_of_the_application_is(String url) {

		baseURI = url;

	}

	@Given("the header passed is {string} {string}")
	public void the_header_passed_is(String name, String value) {

		requestSpecification=given().header(name, value).log().all();

	}

	@Given("the user credentials are {string} {string}")
	public void the_user_credentials_are(String username, String password) {
		
		requestSpecification.body(TestUtility.convertPOJOTOJSON(new LoginRequestPOJO(username, password)));
	}

	@When("I make a POST api request to the endpoint {string}")
	public void i_make_a_post_api_request_to_the_endpoint(String Endpoint) {

		response = requestSpecification.post(Endpoint);
	}

	@When("the status code needs to be {int}")
	public void the_status_code_needs_to_be(Integer int1) {

		response.then().log().all().statusCode(200);

	}

	@When("the response body should contain message as {string}")
	public void the_response_body_should_contain_message_as(String value) {

		response.then().assertThat().body("message", Matchers.equalToIgnoringCase(value));
	}

	@When("a token should be generated")
	public void a_token_should_be_generated() {
		
		

	}

	@When("response should be json body")
	public void response_should_be_json_body() {

	}
}
