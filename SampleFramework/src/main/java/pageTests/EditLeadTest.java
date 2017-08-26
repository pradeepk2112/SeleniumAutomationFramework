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

public class EditLeadTest extends AnnotationWrappers{
	
	@BeforeClass
	public void setData(){
		dataSheetName="Sheet1";
		dataFileName="input.xlsx";
	}
	@Test(dataProvider="getData")
	public void editlogin(String arg_un,String arg_pwd) throws InterruptedException{
		
		new LoginPage()
		.userID(arg_un)
		.pwd(arg_pwd)
		.loginBtn()
		.crmsfa()
		.mainleadclick()
		.clkfindleadmethod()
		.firstnamemethod()
		.findleadbtnmethod();
		sleep(4000);
		new FindLeadsPage()
		.gridvalmethod()
		.clkeditmethod()
		.modifyname()
		.retrievingmodifyname();
		String j=new UpdateLeadsPage().retrievingcompanyname;
		System.out.println("retrieved company name:"+j);
		new UpdateLeadsPage()
		.clksmallsubmit()
		.verifyupdatedname();
		String h=new ViewLeadsPage().getupdated;
		h=h.replaceAll("[0-9( )]", "");
		System.out.println("updated one"+h);



	}

}
