package com.utility;

import com.api.tests.CreateJobAPIRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.opencsv.CSVReader;
import com.pojo.AssignEngineerAPIRequestPOJO;
import com.pojo.AssignEngineerAPIResponsePOJO;
import com.pojo.CreateJobPOJO;
import com.pojo.CreateJobResponsePojo;
import com.pojo.CustomerAddressPOJO;
import com.pojo.CustomerPOJO;
import com.pojo.Customer_productPOJO;
import com.pojo.EngCountAPIResponsePOJO;
import com.pojo.EngMyJobsAPIRequestPOJO;
import com.pojo.EngUserdetailsAPIRequestPOJO;
import com.pojo.FDDashboardDetailsAPIRequestPOJO;
import com.pojo.LoginEngineerAPIRequestPOJO;
import com.pojo.LoginEngineerAPIResponsePOJO;
import com.pojo.LoginRequestPOJO;
import com.pojo.LoginResponse;
import com.pojo.LoginSupervisorAPIRequestPOJO;
import com.pojo.PendingJobApiRequestPOJO;
import com.pojo.SUPDashboardDetailsAPIRequestPOJO;
import com.pojo.problemsPOJO;

import io.restassured.http.Header;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public abstract class TestUtility {

	public static String convertPOJOTOJSON(Object data) {

		Gson gson = new Gson();
		String result = gson.toJson(data);
		return result;

	}

	public static LoginResponse convertJSONTOPOJOLoginResponse(String jsondata) {

		Gson gson = new Gson();
		LoginResponse result = gson.fromJson(jsondata, LoginResponse.class);
		return result;

	}
	
	public static String convertPOJOTOJSONByMapper(Object data) {

		String json = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			json = mapper.writeValueAsString(data);

		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}

		return json;

	}

	public static CreateJobResponsePojo convertJSONTOPOJOCreateJobResponse(String jsondata) {

		Gson gson = new Gson();
		CreateJobResponsePojo result = gson.fromJson(jsondata, CreateJobResponsePojo.class);
		return result;

	}

	public static AssignEngineerAPIResponsePOJO convertJSONTOPOJOAssignEngineerResponse(String jsondata) {

		Gson gson = new Gson();
		AssignEngineerAPIResponsePOJO result = gson.fromJson(jsondata, AssignEngineerAPIResponsePOJO.class);
		return result;

	}
	
	public static PendingJobApiRequestPOJO convertJSONTOPOJOPendingJobApiRequestResponse(String jsondata) {

		Gson gson = new Gson();
		PendingJobApiRequestPOJO result = gson.fromJson(jsondata, PendingJobApiRequestPOJO.class);

		return result;

	}
	
public static LoginEngineerAPIResponsePOJO convertJSONTOPOJOLoginEngineerAPIResponsePOJO(String jsondata) {
	
	Gson gson=new Gson();
	LoginEngineerAPIResponsePOJO loginEngineerAPIResponsePOJO=gson.fromJson(jsondata, LoginEngineerAPIResponsePOJO.class);
	return loginEngineerAPIResponsePOJO;
	
}

public static EngUserdetailsAPIRequestPOJO convertJSONTOPOJOEngUserdetailsAPIRequest(String jsondata) {
	
	Gson gson=new Gson();
	EngUserdetailsAPIRequestPOJO engUserdetailsAPIRequestPOJO=gson.fromJson(jsondata, EngUserdetailsAPIRequestPOJO.class);
	return engUserdetailsAPIRequestPOJO;

}

public static EngCountAPIResponsePOJO convertJSONTOPOJOEngCountAPIResponse(String jsonData) {
	Gson gson = new Gson();
	EngCountAPIResponsePOJO engCountAPIResponsePOJO = gson.fromJson(jsonData, EngCountAPIResponsePOJO.class);
	return engCountAPIResponsePOJO;

}

public static EngMyJobsAPIRequestPOJO convertJSONTOPOJOEngMyJobsAPIRequestPOJO(String jsondata) {

	Gson gson = new Gson();
	EngMyJobsAPIRequestPOJO engMyJobsAPIRequestPOJO = gson.fromJson(jsondata, EngMyJobsAPIRequestPOJO.class);

	return engMyJobsAPIRequestPOJO;

}

	public static CreateJobPOJO getCreateJobJsonData() {

		Faker faker = new Faker();
		String fname = faker.name().firstName();
		String lastname = faker.name().lastName();
		String phoneNumber = faker.numerify("12########");
		String altPhonenumber = faker.numerify("92########");
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
	
	public static SUPDashboardDetailsAPIRequestPOJO gsetSUPDashboardDetailsAPIRequestPOJOData() {

		SUPDashboardDetailsAPIRequestPOJO sUPDashboardDetailsAPIRequestPOJO= new SUPDashboardDetailsAPIRequestPOJO("pending_for_repair");

		return sUPDashboardDetailsAPIRequestPOJO;

	}

	public static AssignEngineerAPIRequestPOJO AssignEngineerAPIRequestPOJOData() {

		int Job_id = CreateJobAPIRequest.jobid;

		String jobid = String.valueOf(Job_id);

		AssignEngineerAPIRequestPOJO assignEngineerAPIRequestPOJO = new AssignEngineerAPIRequestPOJO(jobid, 2);

		return assignEngineerAPIRequestPOJO;

	}
	
	public static LoginEngineerAPIRequestPOJO getLoginEngineerAPIRequestdata() {

		LoginEngineerAPIRequestPOJO loginEngineerAPIRequestPOJO = new LoginEngineerAPIRequestPOJO("iameng",	"password");

		return loginEngineerAPIRequestPOJO;

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

	public static Iterator<String[]> readCSVFile(String FileName) {

		File CsvFile = new File(
				System.getProperty("user.dir") + File.separator + "testdata" + File.separator + FileName);

		FileReader fileReader = null;
		CSVReader csvReader;
		List<String[]> datalist = null;

		try {

			fileReader = new FileReader(CsvFile);

			csvReader = new CSVReader(fileReader);

			// csvReader.readNext(); Reads the next line

			datalist = csvReader.readAll();// Returns list of String array

			csvReader.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

		Iterator<String[]> dataiterator = datalist.iterator();

		dataiterator.next();

		return dataiterator;
	}

	public static String[][] ReadExcel() {

		try {
			XSSFWorkbook xssfWorkbook = new XSSFWorkbook(
					System.getProperty("user.dir") + File.separator + "testdata" + File.separator + "logindata.xlsx");

			XSSFSheet Sheet = xssfWorkbook.getSheetAt(0);

			int lastIndexofRow = Sheet.getLastRowNum();// gives index of number of rows

			XSSFRow Row = Sheet.getRow(0);

			int totalNoofColumns = Row.getLastCellNum(); // gives number of Column

			String mydata[][] = new String[lastIndexofRow][totalNoofColumns];// Remove +1 as we start from row 2

			XSSFRow xssfRow;
			XSSFCell xssfcell;

			for (int rowindex = 1; rowindex <= lastIndexofRow; rowindex++) {

				for (int colindex = 0; colindex < totalNoofColumns; colindex++) {

					xssfRow = Sheet.getRow(rowindex);
					xssfcell = xssfRow.getCell(colindex);

					mydata[rowindex - 1][colindex] = xssfcell.getStringCellValue();

				}

			}

			xssfWorkbook.close();
			return mydata;

		} catch (IOException e) {

			e.printStackTrace();
			return null;
		}

	}

	public static String getTime() {
		Date date = new Date();
		System.out.println(date.toString());

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-YYYY HH:mm");
		String FormatedDate = simpleDateFormat.format(date);
		return FormatedDate;

	}

}
