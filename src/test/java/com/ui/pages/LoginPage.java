package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtil;

public final class LoginPage extends BrowserUtil {

	private static final By locatorusername = By.id("username");
	private static final By locatorPassword = By.id("password");
	private static final By SigninLocator = By.xpath("//button//span[text()=' Sign in ']/../..");
	
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		goTOWebsite("http://phoenix.testautomationacademy.in/sign-in");

	}

	public DashboardPage doLogin(String username, String Password) {

		
		EnterText(locatorusername, username);
		EnterText(locatorPassword, Password);
		click(SigninLocator);
		return new DashboardPage(driver);
	}

}
