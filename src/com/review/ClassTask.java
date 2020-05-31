package com.review;

import org.testng.Assert;
import org.testng.annotations.*;
import com.utils.CommonMethods;
public class ClassTask extends CommonMethods {
	private static final String SProductPage = null;
	@Test(dataProvider="Data")
	public void loginTest(String userName, String password) {
		sendText(slogin.userNameTextBox, userName);
		sendText(slogin.passwordTextBox, password);
		click(slogin.loginBtn);
		takeScreenShot("Sauce", userName);
		wait(2);
		String expected="Products";
		String actual=sProductPage.productLabel.getText();
		Assert.assertEquals(actual, expected, userName+" NOT Logged in");
		System.out.println(userName+" successfully logged in");
		takeScreenShot("Sauce", userName);
	}
	@DataProvider(name="Data")
	public Object[][] setUpData(){
		Object[][] data= {
				{"standard_user","secret_sauce"},
				{"locked_out_user", "secret_sauce"},
				{"problem_user","secret_sauce"},
				{"performance_glitch_user","secret_sauce"}
		};
		return data;
	}
}
