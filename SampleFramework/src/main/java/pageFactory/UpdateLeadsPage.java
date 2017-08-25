package pageFactory;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UpdateLeadsPage extends AbstractPage {
	public static String retrievingcompanyname;
	public UpdateLeadsPage(){
		PageFactory.initElements(eventDriver, this);
	}
	@FindBy(how=How.XPATH, using="(//span[text()='Company Name']//following::input)[1]")
	WebElement updatecompanyname;
	@FindBy(how=How.XPATH, using="(//span[text()='Important Note']//following::input[@class='smallSubmit'])[1]")
	WebElement submitbtn;
	
	String r=RandomStringUtils.randomAlphabetic(8);
	public UpdateLeadsPage modifyname(){
		entertext(updatecompanyname, r);
		return this;
	}
	public UpdateLeadsPage retrievingmodifyname(){
		retrievingcompanyname=getAttribute(updatecompanyname, "value");
		return this;
	}
	public ViewLeadsPage clksmallsubmit(){
		click(submitbtn);
		return new ViewLeadsPage();
	}
	

}
