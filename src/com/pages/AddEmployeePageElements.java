package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.BaseClass;
import com.utils.CommonMethods;

public class AddEmployeePageElements extends CommonMethods {

	@FindBy(id = "firstName")
	public WebElement firstName;

	@FindBy(id = "lastName")
	public WebElement lastName;

//	@FindBy(id = "employeeId")
//	public WebElement employeeId;
	
//	@FindBy(xpath="//div[@id='profile-pic']/h1")
//	public WebElement verifyEmployee;

	@FindBy(id = "chkLogin")
	public WebElement checkboxLoginDetails;

	@FindBy(id = "user_name")
	public WebElement username;

	@FindBy(id = "user_password")
	public WebElement password;

	@FindBy(id = "re_password")
	public WebElement confirmPassword;
	
	@FindBy(id = "status")
	public WebElement status;
	

	@FindBy(id = "btnSave")
	public WebElement saveBtn; //select dd
	
	public void addNewEmp(String fname, String lname, String username, String password, String confPassword) {
		sendText(addEmp.firstName, fname);
		sendText(addEmp.lastName, lname);
		
		click(addEmp.checkboxLoginDetails);
		
		sendText(addEmp.username, username);
		sendText(addEmp.password, password);
		sendText(addEmp.confirmPassword, confPassword);
		
		
	}
	
	

	public AddEmployeePageElements() {
		PageFactory.initElements(driver, this);
	}

}
