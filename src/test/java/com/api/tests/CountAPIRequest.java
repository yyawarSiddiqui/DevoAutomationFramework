package com.api.tests;

import io.restassured.http.Header;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class CountAPIRequest {
	
	private Header MyHeader;
	

	static {
		
		baseURI = "http://139.59.91.96:9000/v1";
	}
	
	@BeforeMethod(description="Initializing the headers")
	public void setup() {

		MyHeader = new Header("Authorization",
				"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NCwiZmlyc3RfbmFtZSI6ImZkIiwibGFzdF9uYW1lIjoiZmQiLCJsb2dpbl9pZCI6ImlhbWZkIiwibW9iaWxlX251bWJlciI6Ijg4OTk3NzY2NTUiLCJlbWFpbF9pZCI6Im1hcmtAZ21haWwuY29tIiwicGFzc3dvcmQiOiI1ZjRkY2MzYjVhYTc2NWQ2MWQ4MzI3ZGViODgyY2Y5OSIsInJlc2V0X3Bhc3N3b3JkX2RhdGUiOm51bGwsImxvY2tfc3RhdHVzIjowLCJpc19hY3RpdmUiOjEsIm1zdF9yb2xlX2lkIjo1LCJtc3Rfc2VydmljZV9sb2NhdGlvbl9pZCI6MSwiY3JlYXRlZF9hdCI6IjIwMjEtMTEtMDNUMDg6MDY6MjMuMDAwWiIsIm1vZGlmaWVkX2F0IjoiMjAyMS0xMS0wM1QwODowNjoyMy4wMDBaIiwicm9sZV9uYW1lIjoiRnJvbnREZXNrIiwic2VydmljZV9sb2NhdGlvbiI6IlNlcnZpY2UgQ2VudGVyIEEiLCJpYXQiOjE3MjQ2NDM3NjF9.JBSIz6JJUm6MGkdN8505Bnv_AmF7TqzkI4LdscIi-kw");

	}

	@Test(description = "test CountAPIRequest get Request", groups = { "sanity" })
	public void CountAPIRequestTest() {

		

		
		 given()
		 	.header(MyHeader)
		.get("/dashboard/count")
			.then()
		.log().all()
			.assertThat()
		.statusCode(200)
		.body("message", Matchers.equalTo("Success"))
		.body("data[0].label", Matchers.equalTo("Pending for delivery"));
		
		

	}

}
