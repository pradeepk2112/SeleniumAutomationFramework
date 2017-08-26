package pageTests;



import org.testng.annotations.Test;

import base.AnnotationWrappers;
import pageFactory.FindLeadsPage;
import pageFactory.LoginPage;
import pageFactory.UpdateLeadsPage;
import pageFactory.ViewLeadsPage;

public class LoginDataProviderTest extends AnnotationWrappers{
	@Test(dataProvider="getHardCodedData")
	public void loginv(String userName, String passWord) throws InterruptedException{

		new LoginPage()
		.userID(userName)
		.pwd(passWord)
		.loginBtn();
	}
		

}
