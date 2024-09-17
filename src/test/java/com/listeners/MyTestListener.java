package com.listeners;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class MyTestListener implements ITestListener {

	private ExtentReports Extentreports;
	private ExtentTest ExtentTest;
	private ExtentSparkReporter Extentreporter;

	public void onTestStart(ITestResult result) {

		System.out.println("******************" + result.getMethod().getMethodName() + " Test Start*****************");
		System.out.println("******************" + Arrays.toString(result.getMethod().getGroups()));
		System.out.println("******************" + result.getMethod().getDescription());

		ExtentTest = Extentreports.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("**************Test Success*************");
		ExtentTest.pass("Test Passed");
	}

	public void onTestFailure(ITestResult result) {

		System.out.println("****************Test Failed**************");
		ExtentTest.fail("Test failed");
	}

	public void onTestSkipped(ITestResult result) {

		System.out.println("********************Test Skipped***************");
		ExtentTest.skip("Test failed");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		System.out.println("*********************Test failed partially*******************");
	}

	public void onStart(ITestContext context) {
		System.out.println("******************Test Suite Start**************************");
		
		File  ReportDirectory=new File(System.getProperty("user.dir")+"/report");
		try {
			FileUtils.forceMkdir(ReportDirectory);
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		Extentreporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/report/ExtentReport.html");
		Extentreports = new ExtentReports();

		Extentreports.attachReporter(Extentreporter);

	}

	public void onFinish(ITestContext context) {
		System.out.println("********************Test Finish****************");
		Extentreports.flush();
	}

}
