package com.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunTest implements IRetryAnalyzer {

	public static final int MAX_COUNT = 3;
	public static int count = 1;

	public boolean retry(ITestResult result) {

		while (count <= 3) {
			count++;
			return true;
		}

		return false;// if returns true it will be RE-executed , If false it's not going to be
						// Reexecuted but will be marked as fail test only
	}

}
