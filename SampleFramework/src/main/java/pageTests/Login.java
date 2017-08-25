package pageTests;



import org.testng.annotations.Test;

import base.AnnotationWrappers;
import pageFactory.FindLeadsPage;
import pageFactory.LoginPage;
import pageFactory.UpdateLeadsPage;
import pageFactory.ViewLeadsPage;

public class Login extends AnnotationWrappers{
	@Test(dataProvider="getHardCodedData")
	public void login(String arg_un,String arg_pwd) throws InterruptedException{
		
		new LoginPage()
		.userID(arg_un)
		.pwd(arg_pwd)
		.loginBtn()
		.crmsfa()
		.findleadclick()
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
