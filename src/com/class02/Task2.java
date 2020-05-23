package com.class02;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utils.CommonMethods;

/**
 * Open Application
Verify logo is displayed
Enter valid credentials
Verify user successfully logged in, by verifying welcome message
 */

public class Task2 extends CommonMethods{
	@BeforeMethod
	public void openAndNavigate() {
		setUp();
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}

	@Test
	public void titleValidation() {
		String expectedTitle = "Human Management System";
	
}
	
}
