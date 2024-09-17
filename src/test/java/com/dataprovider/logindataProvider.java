package com.dataprovider;

import java.util.Iterator;

import org.testng.annotations.DataProvider;

import com.utility.TestUtility;

public class logindataProvider {

	@DataProvider(name = "Login Data")
	public Iterator<String[]> loginDP() {

		return TestUtility.readCSVFile("logindata.csv");

	}

	@DataProvider(name = "Login Excel Data")
	public String[][] loginExceldata() {

		return TestUtility.ReadExcel();

	}

}
