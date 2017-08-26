package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyHomePage extends AbstractPage {
	
	public MyHomePage(){
		PageFactory.initElements(eventDriver, this);
	}
	@FindBy(how=How.XPATH, using="//a[text()='Leads']")
	WebElement clicklead;
	
	public FindLeadsPage mainleadclick(){
		click(clicklead);
		return new FindLeadsPage();
	}

}
