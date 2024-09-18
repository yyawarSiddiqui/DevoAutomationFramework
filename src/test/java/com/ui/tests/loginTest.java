package com.ui.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.*;

public class loginTest {
	private WebDriver driver;
	private LoginPage loginPage;

	@BeforeMethod(description = "Setup the browser and load the page")
	public void Setup() {
		driver = new ChromeDriver();

		loginPage = new LoginPage(driver);

	}

	@Test
	public void testforloginWebsite() {

		loginPage.doLogin("iamfd", "password").clickonCreateJob().createjob();
	}

}
