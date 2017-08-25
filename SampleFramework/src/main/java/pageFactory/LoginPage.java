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
	
	public LoginPage userID(){
		entertext(Username, "DemoSalesManager");
		return this;
	}
	public LoginPage pwd(){
		entertext(Pass, "crmsfa");
		return this;
	}
	public CrmSfaPage loginBtn(){
		click(loginbutton);
		return new CrmSfaPage();
	}
	



}
