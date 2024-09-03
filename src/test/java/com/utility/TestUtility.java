package com.utility;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.pojo.CreateJobPOJO;
import com.pojo.CustomerAddressPOJO;
import com.pojo.CustomerPOJO;
import com.pojo.Customer_productPOJO;
import com.pojo.FDDashboardDetailsAPIRequestPOJO;
import com.pojo.LoginRequestPOJO;
import com.pojo.LoginSupervisorAPIRequestPOJO;
import com.pojo.problemsPOJO;

import io.restassured.http.Header;

import static io.restassured.RestAssured.*;

public class TestUtility {

	public static String convertPOJOTOJSON(Object data) {

		Gson gson = new Gson();
		String result = gson.toJson(data);
		return result;

	}

	public static CreateJobPOJO getCreateJobJsonData() {

		Faker faker = new Faker();
		String fname = faker.name().firstName();
		String lastname = faker.name().lastName();
		String phoneNumber = faker.numerify("12########");
		String altPhonenumber = faker.numerify("92########");
		;
		String email = faker.internet().emailAddress();
		String imei = faker.numerify("12#############");

		CustomerPOJO customerPOJO = new CustomerPOJO(fname, lastname, phoneNumber, altPhonenumber, email, email);
		Customer_productPOJO customer_productPOJO = new Customer_productPOJO("2024-02-19T20:00:00.000Z",
				"RDSF3456783455", imei, imei, "2024-02-19T20:00:00.000Z", 1, 1);

		CustomerAddressPOJO customerAddress = new CustomerAddressPOJO("22", "Aashirwaad", "11",
				"whitefield metro station", "gardens", "490023", "India", "Chhattisgarh");

		problemsPOJO problemsPOJO[] = new problemsPOJO[1];
		problemsPOJO[0] = new problemsPOJO(2, "ok");

		CreateJobPOJO createJobPOJO = new CreateJobPOJO(0, 2, 1, 1, customerPOJO, customerAddress, customer_productPOJO,
				problemsPOJO);
		return createJobPOJO;

	}

	public static LoginSupervisorAPIRequestPOJO getLoginSupervisorAPIRequestData() {

		LoginSupervisorAPIRequestPOJO loginSupervisorAPIRequestPOJO = new LoginSupervisorAPIRequestPOJO("iamsup",
				"password");

		return loginSupervisorAPIRequestPOJO;

	}

	public static FDDashboardDetailsAPIRequestPOJO getFDDashboardDetailsAPIRequestPOJOData() {

		FDDashboardDetailsAPIRequestPOJO fdDashboardDetailsAPIRequestPOJO = new FDDashboardDetailsAPIRequestPOJO(
				"created_today");

		return fdDashboardDetailsAPIRequestPOJO;

	}

	public static String getToken(String role) {

		LoginRequestPOJO loginRequestPOJO = null;

		if (role.equalsIgnoreCase("fd")) {

			loginRequestPOJO = new LoginRequestPOJO("iamfd", "password");
		}

		else if (role.equalsIgnoreCase("sup")) {

			loginRequestPOJO = new LoginRequestPOJO("iamsup", "password");
		}

		else if (role.equalsIgnoreCase("eng")) {

			loginRequestPOJO = new LoginRequestPOJO("iameng", "password");
		}

		else if (role.equalsIgnoreCase("qc")) {

			loginRequestPOJO = new LoginRequestPOJO("iamqc", "password");
		}

		String token = given().when().header(new Header("Content-Type", "application/json")).and()
				.body(convertPOJOTOJSON(loginRequestPOJO)).post("/login").then().extract().jsonPath()
				.getString("data.token");

		return token;

	}

}
