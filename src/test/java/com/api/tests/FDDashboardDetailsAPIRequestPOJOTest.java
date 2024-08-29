package com.api.tests;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.utility.TestUtility.*;

import io.restassured.http.Header;

public class FDDashboardDetailsAPIRequestPOJOTest {

	private Header myHeader;

	static {

		baseURI = "http://139.59.91.96:9000/v1";
	}

	@BeforeMethod(description = "Initializing the header")
	public void Setup() {

		myHeader = new Header("Authorization",
				"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NCwiZmlyc3RfbmFtZSI6ImZkIiwibGFzdF9uYW1lIjoiZmQiLCJsb2dpbl9pZCI6ImlhbWZkIiwibW9iaWxlX251bWJlciI6Ijg4OTk3NzY2NTUiLCJlbWFpbF9pZCI6Im1hcmtAZ21haWwuY29tIiwicGFzc3dvcmQiOiI1ZjRkY2MzYjVhYTc2NWQ2MWQ4MzI3ZGViODgyY2Y5OSIsInJlc2V0X3Bhc3N3b3JkX2RhdGUiOm51bGwsImxvY2tfc3RhdHVzIjowLCJpc19hY3RpdmUiOjEsIm1zdF9yb2xlX2lkIjo1LCJtc3Rfc2VydmljZV9sb2NhdGlvbl9pZCI6MSwiY3JlYXRlZF9hdCI6IjIwMjEtMTEtMDNUMDg6MDY6MjMuMDAwWiIsIm1vZGlmaWVkX2F0IjoiMjAyMS0xMS0wM1QwODowNjoyMy4wMDBaIiwicm9sZV9uYW1lIjoiRnJvbnREZXNrIiwic2VydmljZV9sb2NhdGlvbiI6IlNlcnZpY2UgQ2VudGVyIEEiLCJpYXQiOjE3MjQxNTMwNDR9.uJgET6Oc1dLzovJqfKPYYAnQ_ZWpuNy1XKMUPntxTf4");
	}

	@Test(description="Test the post request of FDDashboardDetailsAPIRequest")
	public void FDDashboardDetailsAPIRequestPOJOTest2() {

		String jobNumber= given()
		.header(myHeader)
			.and()
		.contentType("application/json")
			.when()
		.body(convertPOJOTOJSON(getFDDashboardDetailsAPIRequestPOJOData()))
			.log().all()
		.post("/dashboard/details")
		.then()
		.log().all()
		.assertThat()
		.statusCode(200)
		.body("message", equalTo("Success"))
		.extract().jsonPath().getString("data[1].job_number");
		
		System.out.println(jobNumber);
		
	}

}
