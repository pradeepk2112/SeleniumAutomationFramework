package pageTests;



import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.AnnotationWrappers;
import dataProvider.ExcelDataProvider;
import pageFactory.FindLeadsPage;
import pageFactory.LoginPage;
import pageFactory.UpdateLeadsPage;
import pageFactory.ViewLeadsPage;

public class LoginDataProviderTest extends AnnotationWrappers{
	@BeforeClass
	public void setData(){
		dataSheetName="Sheet1";
		dataFileName="input.xlsx";
	}
	@Test(dataProvider="getData")
	public void login(String userName, String passWord) throws InterruptedException, IOException{
		
		new LoginPage()
		.userID(userName)
		.pwd(passWord)
		.loginBtn();
	}
		

}
