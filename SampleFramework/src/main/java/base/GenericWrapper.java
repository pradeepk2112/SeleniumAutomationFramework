package base;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericWrapper extends wdbase {

	WebDriver driver;
	public static EventFiringWebDriver eventDriver; // public because pages will extend it & outside the package and 
	                                                // static will help in parallel run
	Select sel;
	Alert alert;

	public WebElement locateElement(String locate_by, String locatorvalue){
		WebElement elem = null;
		switch(locate_by){
		case "id":
		{
			elem= eventDriver.findElement(By.id(locatorvalue));
			break;
		}
		case "name":
		{
			elem= eventDriver.findElement(By.name(locatorvalue));
			break;
		}
		case "className":
		{
			elem= eventDriver.findElement(By.className(locatorvalue));
			break;
		}
		case "xpath":
		{
			elem= eventDriver.findElement(By.xpath(locatorvalue));
			break;
		}
		case "linktext":
		{
			elem= eventDriver.findElement(By.linkText(locatorvalue));
			break;
		}
		case "link":
		{
			elem= eventDriver.findElement(By.linkText(locatorvalue));
			break;
		}
		case "partiallinktext":
		{
			elem= eventDriver.findElement(By.partialLinkText(locatorvalue));	
			break;
		}
		case "tagName":
		{
			elem= eventDriver.findElement(By.tagName(locatorvalue));	
			break;
		}
		case "default":
		{
			System.out.println("Invalid locator provided");
			break;
		}
		}

		return elem;

	}
	public void entertext(WebElement elem,String sendkey){
		elem.clear();
		elem.sendKeys(sendkey);

	}
	public void click(WebElement elem){
		elem.click();

	}
	public void select(WebElement elem,String select_By, String a){

		switch(select_By){
		case "selectByIndex":
		{
			sel=new Select(elem);
			sel.selectByIndex(Integer.parseInt(a));
			break;
		}
		case "selectByValue":
		{
			sel=new Select(elem);
			sel.selectByValue(a);
			break;
		}
		case "selectBytext":
		{
			sel=new Select(elem);
			sel.selectByVisibleText(a);
			break;
		}
		}


	}

	public void alert(String acc_dis, String alertkey){
		alert=eventDriver.switchTo().alert();
		if(alertkey.length()>=1)alert.sendKeys(alertkey);
		switch(acc_dis){
		case "accept":{
			alert.accept();
			break;
		}
		case "dismiss":{
			alert.dismiss();
			break;
		}
		}


	}

	public String getText(WebElement elem){
		String actual_text=elem.getText();

		return actual_text;

	}
	public String verifyText(WebElement elem, String expectedText){
		String actual_text=elem.getText();
		if(actual_text.equalsIgnoreCase(expectedText))System.out.println("Text verified"); else System.out.println("Text mismatch");
		return actual_text;

	}
	public String getTitle(){
		return eventDriver.getTitle();

	}
	public void switchWindow(int index){
		Set<String> allwindowHandles=eventDriver.getWindowHandles();
		List<String> allwindows=new ArrayList<>();
		allwindows.addAll(allwindowHandles);
		eventDriver.switchTo().window(allwindows.get(index));

	}
	public String getAttribute(WebElement elem, String attribute){
		String actualattributevalue=elem.getAttribute(attribute);
		return actualattributevalue;
	}
	
	public void invokeApp(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		eventDriver=new EventFiringWebDriver(driver);
		wdbase handler=new wdbase();
		eventDriver.register(handler);
		eventDriver.manage().window().maximize();
		eventDriver.get("http://leaftaps.com/opentaps");
	}
	
	public void quitApp(){
		eventDriver.close();
	}
	public void sleep(int timeOut) throws InterruptedException{
		Thread.sleep(timeOut);
	}



}
