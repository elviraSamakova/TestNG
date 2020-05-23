package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.BaseClass;

public class AddEmployeePageElement {

	@FindBy(xpath = "//a[@id='menu_pim_viewPimModule']/b")
	public WebElement pim;
	// WebElement pim =
	// driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b"));

	@FindBy(id = "menu_pim_addEmployee")
	public WebElement addEmplBtn;
	// WebElement addEmplBTN = driver.findElement(By.id("menu_pim_addEmployee"));

	@FindBy(xpath = "//label[contains(text(),'Full Name')]")
	public WebElement fullnameDisp;
	// WebElement fullnameDisp =
	// driver.findElement(By.xpath("//label[contains(text(),'Full Name')]"));

	@FindBy(xpath = "//label[contains(text(),'Employee Id')]")
	public WebElement employeeId;
	@FindBy(xpath = "//label[contains(text(),'Photograph')]")
	public WebElement photograph;
	@FindBy(id = "firstName")
	public WebElement fname;
	@FindBy(id = "lastName")
	public WebElement lname;
	@FindBy(id = "photofile")
	public WebElement chooseFile;
	@FindBy(id = "btnSave")
	public WebElement save;
	@FindBy(xpath = "//div[@id='profile-pic']/h1")
	public WebElement verifyEmployee;

	public AddEmployeePageElement() {
		PageFactory.initElements(BaseClass.driver, this);
		// BaseClass.driver cuz we did not extend above //this refers to the current
		// class
	}

}
