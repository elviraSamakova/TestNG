package com.class04;

import org.testng.annotations.Test;
import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class TaskFromRefia extends CommonMethods{

	/**
	 * i have prepared a question you shoudl do this in 10-20 mins 6:13 
	 * 1. Open chrome browser 
	 * 2. Go to
	 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login” 
	 * 3. Login into the application and verify syntax logo 
	 * 4. Click on Recruitments --> candidates 
	 * 5. click on Add button // verify labels: full name, email, job
	 * vacancy, resume (u dont have to do this) 
	 * 6. provide info for
	 * firstname,lastname,email,jobVacancy 
	 * 7. chooseFile and upload a proper fit
	 * file 
	 * 8. click calendar on july 20 2020 
	 * 9. Close the browser (edited)
	 */

	
	@Test
	public void validAdminLogin() {
	login.adminLogin(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	
	//1st call the method and  go to PageInitializer 
	isDisplayed(dashboard.logo);
	
	//click on recruitments
	//dashboard.navigateToCandidates();
		
	//3rd way with Action to hover Over
	dashboard.hoverOverCandidates();
	
	candidates.add.click();
	isDisplayed(candidates.fullNamedisplay);
	
	candidates.addCandidate("E", "S", "a@yahoo.com");
	selectDdValue(candidates.jobVacancy, 1);
	
	String filePath="/Users/elvirasamakova/Desktop/bug.png";
	candidates.resume.sendKeys(filePath);
	
	click(candidates.calendarBtn);

	candidates.chooseDate();
	
	
	
	}
}
	


















