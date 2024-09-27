package com.ui.tests;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.pages.*;


@Listeners(com.listeners.MyUItestListener.class)
public class loginTest {
	private WebDriver driver;
	private LoginPage loginPage;

	@BeforeMethod(description = "Setup the browser and load the page",alwaysRun=true)
	public void Setup() {
		driver = new ChromeDriver();

		loginPage = new LoginPage(driver);

	}

	@Test(groups= {"sanity"})
	public void testforloginWebsite() {

		loginPage.doLogin("iamfd", "password").clickonCreateJob().createjob();
		
		Assert.assertTrue(false);
	}
	

}
