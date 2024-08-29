package com.api.tests;

import org.hamcrest.Matchers;

import com.pojo.FDCountAPIRequestPOJO;
import com.utility.TestUtility;

import static io.restassured.RestAssured.*;
import io.restassured.http.Header;

public class FDCountAPIRequest {

	static {
		
		baseURI = "http://139.59.91.96:9000/v1";
	}
	
	public static void main(String[] args) {
		

		Header myheader = new Header("Authorization",
				"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NCwiZmlyc3RfbmFtZSI6ImZkIiwibGFzdF9uYW1lIjoiZmQiLCJsb2dpbl9pZCI6ImlhbWZkIiwibW9iaWxlX251bWJlciI6Ijg4OTk3NzY2NTUiLCJlbWFpbF9pZCI6Im1hcmtAZ21haWwuY29tIiwicGFzc3dvcmQiOiI1ZjRkY2MzYjVhYTc2NWQ2MWQ4MzI3ZGViODgyY2Y5OSIsInJlc2V0X3Bhc3N3b3JkX2RhdGUiOm51bGwsImxvY2tfc3RhdHVzIjowLCJpc19hY3RpdmUiOjEsIm1zdF9yb2xlX2lkIjo1LCJtc3Rfc2VydmljZV9sb2NhdGlvbl9pZCI6MSwiY3JlYXRlZF9hdCI6IjIwMjEtMTEtMDNUMDg6MDY6MjMuMDAwWiIsIm1vZGlmaWVkX2F0IjoiMjAyMS0xMS0wM1QwODowNjoyMy4wMDBaIiwicm9sZV9uYW1lIjoiRnJvbnREZXNrIiwic2VydmljZV9sb2NhdGlvbiI6IlNlcnZpY2UgQ2VudGVyIEEiLCJpYXQiOjE3MjQxNTMwNDR9.uJgET6Oc1dLzovJqfKPYYAnQ_ZWpuNy1XKMUPntxTf4");



		FDCountAPIRequestPOJO FDCountAPIRequestPOJO = given()
		.when()
			.header(myheader)
		.and().
			get("/dashboard/count")
		.then()
		.log().all()
			.assertThat()
		.statusCode(200)
			.time(Matchers.lessThan(2000l))
		.extract()
			.as(FDCountAPIRequestPOJO.class);

		
		System.out.println(TestUtility.convertPOJOTOJSON(FDCountAPIRequestPOJO));
	}

}
