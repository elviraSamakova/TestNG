package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.BaseClass;
import com.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods {
	
	/*
	 * @FindBy(id = "menu_pim_viewPimModule")
	public WebElement pim;
	@FindBy(id = "menu_pim_addEmployee")
	public WebElement addEmployee;
	 */

	@FindBy(id = "welcome")
	public WebElement welcome;
	
	@FindBy(xpath = "//div[@id='branding']/a[1]/img")
	public WebElement logo;

	@FindBy(id = "menu_pim_addEmployee")
	public WebElement addEmployee;
	
	//@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	//public WebElement addEmployee;
	
	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement pim;
	
	@FindBy(id = "menu_recruitment_viewRecruitmentModule")
	public WebElement recruitment;
	
	@FindBy (id= "menu_recruitment_viewCandidates")
	public WebElement candidates;
	

	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void navigateToAddEmployee() {
		click(pim);
		click(addEmployee);
	}
	
	public void navigateToCandidates() {
		click(recruitment);
		click(candidates);
	}
	
	public void hoverOverCandidates() {
		Actions action= new Actions(driver);
		action.moveToElement(recruitment).perform();
		click(candidates);
	}

	public void hoverOverAddEmployee() {
		Actions action= new Actions(driver);
		action.moveToElement(pim).perform();
		click(addEmployee);
	}

	
	
	
	
	
}