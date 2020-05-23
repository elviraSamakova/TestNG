package com.class02;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utils.CommonMethods;

public class AssertionDemo extends CommonMethods {

	@BeforeMethod
	public void openBrowserAndNavigate() {
		setUp();
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}
	
	@Test
	public void titleValidation() {
		String expectedTitle = "Human Management System";
		String actualTitle = driver.getTitle();
		//1 way
		//Assert.assertEquals(expectedTitle, actualTitle);
	
		//2 way
		Assert.assertEquals(expectedTitle, actualTitle, "Title does not match");
	System.out.println("Text after assertion");
	
	}
	
	@Test
	   public void logoValidation() {
			//LoginPage
		}
	
}
