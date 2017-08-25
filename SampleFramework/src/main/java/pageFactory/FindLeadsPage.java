package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FindLeadsPage extends AbstractPage {
	
	public FindLeadsPage(){
		PageFactory.initElements(eventDriver, this);
	}
	@FindBy(how=How.LINK_TEXT, using="Find Leads")
	WebElement clkfindlead;
	@FindBy(how=How.XPATH, using="(//label[text()='First name:'])[3]//following::input[1]")
	WebElement firstname;
	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']")
	WebElement findleadbtn;
	@FindBy(how=How.XPATH, using="(//div[@class='x-grid3-body']//tr//td[1]//a)[1]")
	WebElement gridvalueclick;
	
	public FindLeadsPage clkfindleadmethod(){
		click(clkfindlead);
		return this;
	}
	public FindLeadsPage firstnamemethod(){
		entertext(firstname, "Lakshmi");
		return this;
	}
	public FindLeadsPage findleadbtnmethod(){
		click(findleadbtn);
		return this;
	}
	public ViewLeadsPage gridvalmethod(){
		click(gridvalueclick);
		return new ViewLeadsPage();
	}
	
}
