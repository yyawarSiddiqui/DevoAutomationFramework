package com.api.tests;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dao.tr_customer_DAO;
import com.db.pojo.tr_customer_POJO;
import com.pojo.PendingJobApiRequestPOJO;
import com.pojo.pendingjobAPIdata;
import com.utility.TestUtility;

import io.restassured.http.Header;
import io.restassured.response.Response;

public class PendingJobApiRequestTest {

	Header Myheader;
	PendingJobApiRequestPOJO pendingJobApiRequestPOJO;
	pendingjobAPIdata pendingjobAPIdata;

	static {

		baseURI = "http://139.59.91.96:9000/v1";
	}

	@BeforeMethod()

	public void Setup() {

		Myheader = new Header("Authorization", TestUtility.getToken("sup"));
	}

	@Test
	public void PendingJobApiRequestTest1() {

		Response response = given()
				.header(Myheader)
					.contentType("application/json")
				.and()
					.log().all()
				.get("job/pending");
//		.then()
//			.assertThat()
//		.statusCode(200);

		pendingJobApiRequestPOJO = TestUtility.convertJSONTOPOJOPendingJobApiRequestResponse(response.asString());

		 pendingjobAPIdata = pendingJobApiRequestPOJO.getData()[0];
		

//		for (pendingjobAPIdata data : pendingjobAPIdata) {
//			
//			System.out.println(data.getId());
//		}
//		

	}
	
	@Test(description = "Test entries in Db", dependsOnMethods = { "PendingJobApiRequestTest1" })
	public void TestEntriesinDB() {

		tr_customer_DAO tr_customer_DAOs = new tr_customer_DAO();
		
		pendingjobAPIdata[] pendingjobAPIdataArray = pendingJobApiRequestPOJO.getData();

		for (pendingjobAPIdata data : pendingjobAPIdataArray) {
			
			tr_customer_POJO dataFromDb = tr_customer_DAOs.getDetailByCustomer_ID(data.getId());

			Assert.assertEquals(data.getId(), dataFromDb.getId());

		}

		tr_customer_POJO dataFromDb = tr_customer_DAOs.getDetailByCustomer_ID(pendingjobAPIdata.getId());

		Assert.assertEquals(pendingjobAPIdata.getId(), dataFromDb.getId());
	}
}
