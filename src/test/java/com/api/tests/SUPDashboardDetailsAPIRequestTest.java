package com.api.tests;

import org.testng.annotations.*;

import static com.utility.TestUtility.*;

import static io.restassured.RestAssured.*;
import io.restassured.http.Header;

public class SUPDashboardDetailsAPIRequestTest {

	private Header MyHeader;

	static {
		baseURI = "http://139.59.91.96:9000/v1";
	}

	@BeforeMethod()
	public void Setup() {

		MyHeader = new Header("Authorization", getToken("sup"));

	}

	@Test()
	public void Test() {

		given()
			.header(MyHeader)
		.and()
			.contentType("application/json").when()
		.body(convertPOJOTOJSON(gsetSUPDashboardDetailsAPIRequestPOJOData()))
			.log().all()
		.post("/dashboard/details")
			.then()
		.assertThat()
			.statusCode(200);
		

	}

}
