package tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.AnnotationWrappers;
import base.GenericWrapper;

public class TC_002 extends AnnotationWrappers {
	
	@Test
	public void TC002() throws InterruptedException {
		
		
		entertext(locateElement( "id", "username"),"DemoSalesManager");
		
		entertext(locateElement( "id", "password"),"crmsfa");
		
		click(locateElement( "xpath", "//input[@class='decorativeSubmit']"));
		
		click(locateElement( "linktext", "CRM/SFA"));
		click(locateElement( "xpath", "//a[text()='Leads']"));
		click(locateElement( "linktext", "Find Leads"));
		entertext(locateElement( "xpath", "(//label[text()='First name:'])[3]//following::input[1]"),"lakshmi");
		click(locateElement( "xpath", "//button[text()='Find Leads']"));
		Thread.sleep(4000);
		click(locateElement( "xpath", "(//div[@class='x-grid3-body']//tr//td[1]//a)[1]"));
		String title=getTitle();
		if(title.equalsIgnoreCase("View Lead | opentaps CRM"))System.out.println("Title verified");else System.out.println("not verified");
		click(locateElement( "xpath", "//a[text()='Edit']"));
		String r=RandomStringUtils.randomAlphabetic(8);
		entertext(locateElement( "xpath", "(//span[text()='Company Name']//following::input)[1]"),r);
		String companynameupdate=getAttribute(locateElement( "xpath", "(//span[text()='Company Name']//following::input)[1]"), "value");
		click(locateElement( "xpath", "(//span[text()='Important Note']//following::input[@class='smallSubmit'])[1]"));
		String updatedname=getText(locateElement( "id", "viewLead_companyName_sp"));
		String only_int=updatedname.replaceAll("[0-9( )]", "");
		if(companynameupdate.equals(only_int)){
			System.out.println("updated value is reflected");
		}
		
		// TODO Auto-generated method stub

	}

}
