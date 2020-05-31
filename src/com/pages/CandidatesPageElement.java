package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.BaseClass;
import com.utils.CommonMethods;

public class CandidatesPageElement extends CommonMethods{

	@FindBy (id="btnAdd")
	public WebElement add;
	
	//verify labels displayed
    @FindBy(xpath="//label[text()='Full Name']")
    public WebElement fullNamedisplay;
    
    @FindBy(xpath="//label[text()='Email ']")
    public WebElement emaildisplay;
    
    @FindBy(xpath="//label[text()='Job Vacancy']")
    public WebElement jobVacancydisplay;
    
    @FindBy(xpath="//label[text()='Resume']")
    public WebElement resumedisplay;
    
    @FindBy(id="addCandidate_firstName")
    public WebElement firstname;
    
    @FindBy(id="addCandidate_lastName")
    public WebElement lastname;
    
    @FindBy(id="addCandidate_email")
    public WebElement email;
    
    @FindBy(id="addCandidate_vacancy")
    public WebElement jobVacancy;
    
    @FindBy(id="addCandidate_resume")
    public WebElement resume;
    
    @FindBy (xpath="//input[@id='addCandidate_appliedDate']//following-sibling::img")
    public WebElement calendarBtn;
    
    
    @FindBy(className="ui-datepicker-month")
    public WebElement monthdd;
	
	@FindBy (className="ui-datepicker-year")
	public WebElement yeardd;
	
	@FindBy (xpath="//span[contains(text(),‘Next’)]")
	public WebElement nextBtn;
	
	@FindBy (xpath="//table[@class='ui-datepicker-calendar']/tbody/tr/td")
	public List<WebElement> chooseDay; 
	
	@FindBy (xpath="//table[@class='ui-datepicker-calendar']/tbody/tr")
	public List<WebElement> dayRows; 
	
	@FindBy (xpath="//table[@class='ui-datepicker-calendar']/thead/tr/th")
	public List<WebElement> dayColms; 
	
	
	public void addCandidate(String name, String lname, String eml) {
		sendText(firstname, name);
		sendText(lastname, lname);
		sendText(email, eml);
	}
	
	
	public void chooseDate() {
		selectDdValue(monthdd, "Aug");
		selectDdValue(yeardd, "2021");
		selectCalendarDate(chooseDay,"20");
		
//		List<WebElement> dayR=dayRows;
//		List<WebElement> dayC=dayColms;
//		
//		int colNum=dayC.size();
//		int rowNum=dayR.size();
//		//System.out.println(colNum+"///"+rowNum);
//		for(int i=1; i<rowNum; i++) {
//			for (int j=1; j<colNum; j++) {
//				WebElement cell=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["+i+"]/td["+j+"]"));
//			//String cellText=cell.getText();
//			if(j==20) {
//				//System.out.println(cellText);
//				cell.submit();
//			}
//			}
//		}
//		
		
	}
	
	
	public CandidatesPageElement() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	

	
}
