package com.class03;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class HWwithRefia extends CommonMethods{

	/**
	 * 1. Open chrome browser 
	 * 2. Go to
	 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login 
	 * 3.Login into the application 
	 * 4. Add 5 different Employees and create login
	 * credentials by providing:
	 *  ● First Name ● Last Name ● Username ● Password 
	 *  5. Provide Employee First and Last Name 
	 *  6. Verify Employee has been added
	 * successfully and take screenshot (you must have 5 different screenshots) 
	 * 7. Close the browser Specify group for this test case, add it into specifific
	 * suite and execute from xml fifile.
	 */

	@Test (dataProvider =("getData"))
	public void addEmployee(String fname, String lname, String username, String password) {
	login.adminLogin(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	dashboard.hoverOverAddEmployee();
	sendText(addEmp.firstName, fname);
	sendText(addEmp.lastName, lname);
	
	wait(1);
	click(addEmp.checkboxLoginDetails);
	wait(1);
	
	sendText(addEmp.username, username);
	sendText(addEmp.password, password);
	sendText(addEmp.confirmPassword, password);
	click(addEmp.saveBtn);
	
	
//	String expectedEmpId = addEmp.employeeId.getAttribute("value");
//	String actualEmpId = pdetails.employeeId.getAttribute("value");
//	Assert.assertEquals(actualEmpId, expectedEmpId, "Employee ID did not match!");
	
	
//	String expectedFullName=addEmp.firstName.getText()+addEmp.lastName.getText();
//	String actualFullName = pdetails.verifyEmployee.getText();
//	Assert.assertEquals(actualFullName, expectedFullName, "Employee ID did not match!");

	// take screeshot
	takeScreenshot(fname + "_" + lname);
	
	}
	
	
	@DataProvider 
	public Object[][] getData() {
		Object[][] data= {
				{"A", "B","123ab","Abcerevfgf1245!"},
				{"John", "Smith4","jsmith","bcerSevfgf1245!" },
				{"Jane", "Lu","jsmlu67","bcerevfWEgf1245!"},
				{"Fay", "Ko","komith67","bcerevFfgf1245!"},
				{"Nick", "Koko","knicj5656","bceDrevfgf1245!"}
		};
		return data;
	}
	

}
