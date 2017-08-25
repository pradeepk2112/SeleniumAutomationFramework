package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.AnnotationWrappers;

public class TC_001 extends AnnotationWrappers {

	WebElement ele;
	String leadId;
	WebDriver driver;
	

	@Test
	public void createLead() throws InterruptedException{

		
		entertext(locateElement("id","username"),"DemoSalesManager");
		
		entertext(locateElement("id","password"),"crmsfa");
		
		click(locateElement("xpath", "//input[@value='Login']"));
		
		click(locateElement("xpath", "//div[@class='crmsfa']"));
		
		click(locateElement("link", "Create Lead"));
		
		entertext(locateElement("id", "createLeadForm_companyName"),"CurrentlyGlobally");

		entertext(locateElement("id", "createLeadForm_firstName"),"Sathish");
		
		entertext(locateElement("id", "createLeadForm_lastName"),"Natarajan");
		
		select(locateElement("id", "createLeadForm_dataSourceId"),"selectBytext","Conference");
		
		select(locateElement("id", "createLeadForm_marketingCampaignId"),"selectBytext","Affiliate Sites");
		
		entertext(locateElement("id", "createLeadForm_primaryPhoneNumber"),"1234567890");
		
		entertext(locateElement("id", "createLeadForm_primaryEmail"),"testmail@gmail.com");
		
		click(locateElement("xpath","//input[@class='smallSubmit']"));
		
		getText(locateElement("id", "viewLead_companyName_sp"));
	}


}
