package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BrowserUtil {
	private WebDriver driver;

	public BrowserUtil(WebDriver driver) {
		super();
		this.driver = driver;

	}

	public void goTOWebsite(String url) {
		driver.get(url);

	}

	public void click(By locator) {

		Sleep(4);
		WebElement ELem = driver.findElement(locator);
		ELem.click();
	}

	public void EnterText(By locator, String Text) {

		Sleep(4);
		WebElement ELem = driver.findElement(locator);
		ClearText(locator);
		ELem.sendKeys(Text);
	}

	public void ClearText(By locator) {

		WebElement ELem = driver.findElement(locator);
		ELem.clear();
	}

	public void Sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
