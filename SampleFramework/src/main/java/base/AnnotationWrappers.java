package base;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import dataProvider.ExcelDataProvider;

public class AnnotationWrappers extends GenericWrapper{
	
	public String dataSheetName;
	public String dataFileName;
	
	
	@DataProvider(name="getData")
	public Object[][] data() throws IOException{
		
		return ExcelDataProvider.getData(dataFileName,dataSheetName);
		
	}
	
	@BeforeSuite
	public void beforeSuite(){

	}
	@AfterSuite
	public void afterSuite(){

	}
	@BeforeTest
	public void beforeTest(){

	}
	@AfterTest
	public void afterTest(){

	}
	@BeforeGroups
	public void beforeGroups(){

	}
	@AfterGroups
	public void afterGroups(){

	}
	@BeforeClass
	public void beforeClass(){

	}
	@AfterClass
	public void afterClass(){

	}
	@BeforeMethod
	public void beforeMethod(){
		invokeApp();
	}
	@AfterMethod
	public void afterMethod(){
		quitApp();
	}
	

}
