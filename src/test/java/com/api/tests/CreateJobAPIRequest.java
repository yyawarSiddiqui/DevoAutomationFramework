package com.api.tests;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateJobAPIRequest {

	public static void main(String[] args) {

		RestAssured.baseURI = "http://139.59.91.96:9000/v1";

		Header myheader = new Header("Authorization",
				"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NCwiZmlyc3RfbmFtZSI6ImZkIiwibGFzdF9uYW1lIjoiZmQiLCJsb2dpbl9pZCI6ImlhbWZkIiwibW9iaWxlX251bWJlciI6Ijg4OTk3NzY2NTUiLCJlbWFpbF9pZCI6Im1hcmtAZ21haWwuY29tIiwicGFzc3dvcmQiOiI1ZjRkY2MzYjVhYTc2NWQ2MWQ4MzI3ZGViODgyY2Y5OSIsInJlc2V0X3Bhc3N3b3JkX2RhdGUiOm51bGwsImxvY2tfc3RhdHVzIjowLCJpc19hY3RpdmUiOjEsIm1zdF9yb2xlX2lkIjo1LCJtc3Rfc2VydmljZV9sb2NhdGlvbl9pZCI6MSwiY3JlYXRlZF9hdCI6IjIwMjEtMTEtMDNUMDg6MDY6MjMuMDAwWiIsIm1vZGlmaWVkX2F0IjoiMjAyMS0xMS0wM1QwODowNjoyMy4wMDBaIiwicm9sZV9uYW1lIjoiRnJvbnREZXNrIiwic2VydmljZV9sb2NhdGlvbiI6IlNlcnZpY2UgQ2VudGVyIEEiLCJpYXQiOjE3MjQ2NDM3NjF9.JBSIz6JJUm6MGkdN8505Bnv_AmF7TqzkI4LdscIi-kw");

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType("application/json");
		requestSpecification.header(myheader);
		requestSpecification.body("{\r\n" + "    \"mst_service_location_id\": 0,\r\n"
				+ "    \"mst_platform_id\": 2,\r\n" + "    \"mst_warrenty_status_id\": 1,\r\n"
				+ "    \"mst_oem_id\": 1,\r\n" + "    \"customer\": {\r\n"
				+ "        \"first_name\": \"Cornelius\",\r\n" + "        \"last_name\": \"Kuphal\",\r\n"
				+ "        \"mobile_number\": \"0489568498\",\r\n" + "        \"mobile_number_alt\": \"\",\r\n"
				+ "        \"email_id\": \"ned.mcglynn@yahoo.com\",\r\n"
				+ "        \"email_id_alt\": \"jatinvsharma@gmail.com\"\r\n" + "    },\r\n"
				+ "    \"customer_address\": {\r\n" + "        \"flat_number\": \"135\",\r\n"
				+ "        \"apartment_name\": \"33166\",\r\n" + "        \"street_name\": \"9072 Marvin Point\",\r\n"
				+ "        \"landmark\": \"9603\",\r\n" + "        \"area\": \"New Ashleyfort\",\r\n"
				+ "        \"pincode\": \"6959689\",\r\n" + "        \"country\": \"Maharashtra\",\r\n"
				+ "        \"state\": \"India\"\r\n" + "    },\r\n" + "    \"customer_product\": {\r\n"
				+ "        \"dop\": \"2023-06-10T18:30:00.000Z\",\r\n"
				+ "        \"serial_number\": \"40485011257803\",\r\n" + "        \"imei1\": \"40485011257803\",\r\n"
				+ "        \"imei2\": \"40486011257803\",\r\n" + "        \"popurl\": \"2023-06-10T18:30:00.000Z\",\r\n"
				+ "        \"product_id\": 1,\r\n" + "        \"mst_model_id\": 1\r\n" + "    },\r\n"
				+ "    \"problems\": [\r\n" + "        {\r\n" + "            \"id\": 1,\r\n"
				+ "            \"remark\": \"Phone not working\"\r\n" + "        }\r\n" + "       \r\n" + "    ]\r\n"
				+ "}");
		Response response = requestSpecification.post("/job/create");
		System.out.println(response.asPrettyString());

	}

}
