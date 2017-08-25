package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.AbstractPage;

public class LoginPage extends pageFactory.AbstractPage{
	
	public LoginPage(){
		PageFactory.initElements(eventDriver, this);
	}
	@FindBy(how=How.ID, using="username")
	WebElement Username;
	@FindBy(how=How.ID, using="password")
	WebElement Pass;
	@FindBy(how=How.XPATH, using="//input[@value='Login']")
	WebElement loginbutton;
	
	public LoginPage userID(String arg_username){
		entertext(Username, arg_username);
		return this;
	}
	public LoginPage pwd(String arg_password){
		entertext(Pass, arg_password);
		return this;
	}
	public CrmSfaPage loginBtn(){
		click(loginbutton);
		return new CrmSfaPage();
	}
	



}
