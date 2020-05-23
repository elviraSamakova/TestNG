package com.class02;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.pages.AddEmployeePageElement;
import com.pages.LoginPageElements;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest extends CommonMethods {

	/**
	 * TC 1: HRMS Add Employee: 1. Open chrome browser 2. Go to
	 * “http://166.62.36.207/humanresources/symfony/web/index.php/ auth/login” 3.
	 * Login into the application 4. Click on Add Employee 5. Verify labels: Full
	 * Name, Employee Id, Photograph are displayed 6. Provide Employee First and
	 * Last Name 7. Add a picture to the profile 8. Verify Employee has been added
	 * successfully 9. Close the browser
	 */

	@BeforeMethod
	public void beforeMethod() {
		setUp();

	}

	@AfterMethod
	public void afterMethod() {
		tearDown();
	}

	@Test
	public void f() {
		LoginPageElements login = new LoginPageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));

		click(login.loginBtn);

		AddEmployeePageElement add = new AddEmployeePageElement();
		// WebElement pim =
		// driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b"));

		Actions action = new Actions(driver);
		action.moveToElement(add.pim).perform();

		wait(2);

		// WebElement addEmplBTN = driver.findElement(By.id("menu_pim_addEmployee"));
		// add.addEmplBtn.click();
		click(add.addEmplBtn);

		wait(1);

		// WebElement fullnameDisp =
		// driver.findElement(By.xpath("//label[contains(text(),'Full Name')]"));

		wait(1);
		isDisplayed(add.fullnameDisp);

		// WebElement empIdDisp =
		// driver.findElement(By.xpath("//label[contains(text(),'Employee Id')]"));

		wait(1);
		isDisplayed(add.employeeId);
		isDisplayed(add.photograph);

		// WebElement firstn = driver.findElement(By.id("firstName"));
		sendText(add.fname, ConfigsReader.getProperty("firstname"));

		// WebElement add.l = driver.findElement(By.id("lastName"));
		sendText(add.lname, ConfigsReader.getProperty("lastname"));

		wait(3);
		String filePath = "/Users/elvirasamakova/Desktop/myFile.png";

		// WebElement chooseFile = driver.findElement(By.id("photofile"));
		add.chooseFile.sendKeys(filePath);
		// add.save.click();
		wait(3);
		click(add.save);

		// driver.findElement(By.id("btnSave")).click();
		wait(4);
		String expectedTitle = "Elvira Samakova";

		// WebElement verify =
		// driver.findElement(By.xpath("//*[@id='profile-pic']/h1"));
		String actualTitle = add.verifyEmployee.getText();

		Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
		System.out.println("Test case Passed");

	}

}
