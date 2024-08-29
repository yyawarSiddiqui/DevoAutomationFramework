package com.api.tests;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.Header;

public class PendingForJobAssignment {

	static {

		baseURI = "http://139.59.91.96:9000/v1";

	}

	@Test(description="Test PendingForJobAssignment get Request ")
	public void PendingForJobAssignmentTest() {

		Header MyHeader = new Header("Authorization",
				"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwiZmlyc3RfbmFtZSI6IkpvaG4iLCJsYXN0X25hbWUiOiJDZW5hIiwibG9naW5faWQiOiJpYW1zdXAiLCJtb2JpbGVfbnVtYmVyIjoiOTk4ODc3ODg5OSIsImVtYWlsX2lkIjoiam9obkBnbWFpbC5jb20iLCJwYXNzd29yZCI6IjVmNGRjYzNiNWFhNzY1ZDYxZDgzMjdkZWI4ODJjZjk5IiwicmVzZXRfcGFzc3dvcmRfZGF0ZSI6bnVsbCwibG9ja19zdGF0dXMiOjAsImlzX2FjdGl2ZSI6MSwibXN0X3JvbGVfaWQiOjIsIm1zdF9zZXJ2aWNlX2xvY2F0aW9uX2lkIjoxLCJjcmVhdGVkX2F0IjoiMjAyMS0xMS0wM1QwODowNjoyMy4wMDBaIiwibW9kaWZpZWRfYXQiOiIyMDIxLTEyLTIwVDA3OjQyOjAwLjAwMFoiLCJyb2xlX25hbWUiOiJTdXBlcnZpc29yIiwic2VydmljZV9sb2NhdGlvbiI6IlNlcnZpY2UgQ2VudGVyIEEiLCJpYXQiOjE2ODcxNDEwODR9.p98Fean_aLhYh4RjhYf3TZHN0clRmyLfq00PSImUaIo");

		given()
		.when()
		.header(MyHeader)
		.get("/job/pending")
		.then()
		.log().all()
		.assertThat()
		.statusCode(200);
		//.body("messsage", Matchers.equalTo("Success"));

	}

}
