package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BrowserUtil {
	private WebDriver driver;
	private static WebDriver ScreenshotWebDriver;

	public BrowserUtil(WebDriver driver) {
		super();
		this.driver = driver;
		ScreenshotWebDriver=driver;

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

	public static String takesScreenShot(String TestName) {
		
		File ReportDirectory = new File(System.getProperty("user.dir") + "/Screenshot");
		try {
			FileUtils.forceMkdir(ReportDirectory);

		} catch (IOException e) {

			e.printStackTrace();
		}
		String pathname=System.getProperty("user.dir") +File.separator+"Screenshot"+File.separator+ ""+TestName+".png";
		TakesScreenshot takesScreenshot = (TakesScreenshot) ScreenshotWebDriver;
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);// Returns Binary data//
		File myFile = new File(System.getProperty("user.dir") +File.separator+"Screenshot"+File.separator+ ""+TestName+".png");
		
		try {
			myFile.createNewFile();
			FileUtils.copyFile(file, myFile);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pathname;
	}
	
}
