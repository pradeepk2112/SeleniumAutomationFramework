package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.AbstractPage;

public class CrmSfaPage extends pageFactory.AbstractPage{
	
	public CrmSfaPage(){
		PageFactory.initElements(eventDriver, this);
	}
	@FindBy(how=How.LINK_TEXT, using="CRM/SFA")
	WebElement crmsfa;
	
	public MyHomePage crmsfa(){
		click(crmsfa);
		return new MyHomePage();
	}
	



}
