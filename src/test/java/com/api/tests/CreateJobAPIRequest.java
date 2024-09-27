package com.api.tests;

import static com.utility.TestUtility.*;
import static io.restassured.RestAssured.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.dao.tr_job_head_DAO;
import com.db.pojo.Job_Head_POJO;
import com.pojo.CreateJobResponsePojo;
import com.utility.TestUtility;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class CreateJobAPIRequest {

	private Header myheader;
	CreateJobResponsePojo createJobResponsePojo;
	public static int jobid;
	
	
	static {

		baseURI = "http://139.59.91.96:9000/v1";
	}

	@BeforeMethod(description="Initializing the header")
	public void setup() {
		
		myheader=new Header("Authorization",
				getToken("fd"));

	}
	
	@Test(description="test CreateJobAPIRequest post Method" , groups= {"sanity","createJob"})
	public void CreateJobAPIRequestTest() {

		
		Response response=given()
			.contentType("application/json")
		.header(myheader)
			.and()
		.body(convertPOJOTOJSON(getCreateJobJsonData()))
		.log().all()
			.when()
		. post("/job/create");
		
		
		createJobResponsePojo = TestUtility.convertJSONTOPOJOCreateJobResponse(response.asString());
		jobid = createJobResponsePojo.getData().getId();

	}

	
	@Test(description="test Entries in DB", groups= {"sanity","smoke"}, dependsOnMethods = {"CreateJobAPIRequestTest"})
	public void ValidateEntriesinDB() {
		
		tr_job_head_DAO tr_job_head_DAO=new tr_job_head_DAO();
		
		Job_Head_POJO datafromDB=tr_job_head_DAO.getJobDetails(createJobResponsePojo.getData().getId());
		
		Assert.assertEquals(datafromDB.getId(), createJobResponsePojo.getData().getId());
		
	}
}
