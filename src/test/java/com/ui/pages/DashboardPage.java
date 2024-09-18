package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtil;

public final class DashboardPage extends BrowserUtil {

	private static final By CreateJob = By.xpath("//span[text()=' Create Job ']/../../..");
	private WebDriver driver;

	public DashboardPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	public CreateJobPage clickonCreateJob() {
		
		click(CreateJob);
		CreateJobPage createJobPage=new CreateJobPage(driver);
		return  createJobPage;
	}
	
	
}
