package com.api.tests;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import static com.utility.TestUtility.*;
import org.testng.annotations.Test;

import com.dao.mst_role_dao;
import com.db.pojo.mst_role_POJO;
import com.pojo.EngUserdetailsAPIRequestPOJO;
import com.utility.TestUtility;

import io.restassured.http.Header;
import io.restassured.response.Response;

public class EngUserdetailsAPIRequestTest {
	
 Header	MyHeader ;
 EngUserdetailsAPIRequestPOJO engUserdetailsAPIRequestPOJO;

	static {

		baseURI = "http://139.59.91.96:9000/v1";
	}

	
	@BeforeMethod(description="initializing the Header")
	public void Setup() {

		MyHeader=new Header("Authorization", getToken("eng"));
		
	}
	
	@Test(description="Test the EngUserdetailsAPI")
	public void Test1() {
		
		Response response=given()
			.header(MyHeader)
		.and()
			.contentType("application/json")
		.when().log().all()
			.get("/userdetails");
		
		response.then().log().all();

		engUserdetailsAPIRequestPOJO = TestUtility.convertJSONTOPOJOEngUserdetailsAPIRequest(response.asPrettyString());
		System.out.println(engUserdetailsAPIRequestPOJO);
	}
	
	@Test(description = "test Db entries", dependsOnMethods  = {"Test1"} )
	public void TestDbEntries() {
		
		mst_role_dao mst_role_dao=new mst_role_dao();
		mst_role_POJO datafromDB=mst_role_dao.getRoleDetail(engUserdetailsAPIRequestPOJO.getData().getId());
		Assert.assertNotEquals(datafromDB.getName(), engUserdetailsAPIRequestPOJO.getData().getRole_name());
		
		
	}
}
