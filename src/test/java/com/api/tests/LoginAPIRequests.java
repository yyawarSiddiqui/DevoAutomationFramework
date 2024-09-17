package com.api.tests;

import com.pojo.LoginRequestPOJO;
import static com.utility.TestUtility.*;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.restassured.http.Header;

@Listeners(com.listeners.MyTestListener.class)
public class LoginAPIRequests {

	static {
		baseURI = "http://139.59.91.96:9000/v1";
	}

	@Test(description = "Test Login API Request", groups = {
			"sanity" }, dataProviderClass = com.dataprovider.logindataProvider.class,
			// dataProvider = "Login Data"
			dataProvider = "Login Excel Data", retryAnalyzer = com.listeners.ReRunTest.class

	)
	public void LoginAPIRequestsTest(String username, String password) {

		Header myheader = new Header("Content-Type", "application/json");

		// Make a Request//

		// Return Request Specification to pass the
		// parameters i.e. Allows you to specify how
		// the request will look like.

		LoginRequestPOJO loginRequestPOJO = new LoginRequestPOJO(username, password);
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
				.and()
				.extract().jsonPath().getString("data.token");
					
		

//		System.out.println("Response_Body" + response.asPrettyString());
//		System.out.println("Status_Code=" + response.statusCode());

	}

}
