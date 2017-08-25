package tests;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.AnnotationWrappers;


public class TC_003 extends AnnotationWrappers{
	
	public static WebElement elem;
	
	@Test
	public void deleteLead() throws IOException  {
		
		
		entertext(locateElement("id","username"),"DemoSalesManager");
		entertext(locateElement("id","password"), "crmsfa");
		click(locateElement("className","decorativeSubmit"));
		click(locateElement("linktext", "CRM/SFA"));
		click(locateElement("linktext","Leads"));
		click(locateElement("linktext","Find Leads"));
		click(locateElement("xpath","//span[contains(text(),'Phone')]"));
		click(locateElement("xpath","//button[contains(text(),'Find Leads')]"));
		String s=getText(locateElement("xpath","//*[@class='x-grid3-row-table']//a"));
		click(locateElement("xpath","//*[@class='x-grid3-row-table']//a"));
		click(locateElement("linktext","Delete"));
		click(locateElement("linktext","Find Leads"));
		click(locateElement("xpath","//span[contains(text(),'Name and ID')]"));
		entertext(locateElement("xpath", "//input[@name='id']"),s);
		click(locateElement("xpath","//button[contains(text(),'Find Leads')]"));
		verifyText(locateElement("xpath", "//div[contains(text(),'No records to display')]"), "No records to display");
		
		
}
}
