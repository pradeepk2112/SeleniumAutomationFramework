package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewLeadsPage extends AbstractPage {
	public static String getupdated;
	public ViewLeadsPage(){
		PageFactory.initElements(eventDriver, this);
	}
	@FindBy(how=How.XPATH, using="//a[text()='Edit']")
	WebElement clkedit;
	@FindBy(how=How.ID, using="viewLead_companyName_sp")
	WebElement updatenametext;
	
	public UpdateLeadsPage clkeditmethod(){
		click(clkedit);
		return new UpdateLeadsPage();
	}
	public ViewLeadsPage verifyupdatedname(){
		getupdated=getText(updatenametext);
		return this;
	}

}
