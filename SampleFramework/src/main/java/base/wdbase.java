package base;

import org.junit.internal.Classes;

//import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class wdbase implements WebDriverEventListener{

	@Override
	public void afterAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Alert Accepted success");
	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Alert Dismissed success");
	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub

		System.out.println("value changed success........."+arg0.getAttribute("value")+"...."+arg2);
	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {

		// TODO Auto-generated method stub
		System.out.println("click success"+"...."+arg0);
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		System.out.println("element found.........."+arg1);
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("navigation backward");
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("navigation forward");

	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("refresh");
	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("navigated......."+arg0);

	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("script completed");

	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("not accepted alert");

	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("alert not dismissed");

	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		System.out.println("value changed success........."+arg0.toString()+"........."+arg2);

	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("before click......."+arg0);
		//wait.until(ExpectedConditions.elementToBeClickable(arg0));
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		System.out.println("before element found........"+arg1+"value of attribute....."+arg0);

	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("navigated back");

	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("navigated forward");
	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("navigation before refresh");
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("before navigating to");

	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("before scripting");
	}
	/**
	 * Author - Pradeep
	 * Param - Webdriver, super class exception throwable
	 * Description - This will catch all the exceptions in 
	 * one place
	 */

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		//Object obj;

		// TODO Auto-generated method stub
		System.out.println("excpetion happening");
		switch(throwable.getClass().getSimpleName()){
		case "NoSuchElementException":{
			System.out.println(throwable.getMessage());
			//System.out.println(throwable.printStackTrace());
		}
		case "NoSuchWindowException":{
			System.out.println(throwable.getMessage());
			//System.out.println(throwable.printStackTrace());
		}
		case "InvalidSelectorException":{
			System.out.println(throwable.getMessage());
			throwable.printStackTrace();
		}
		}
	}
}


/*if(throwable instanceof NoSuchElementException){
			System.out.println(throwable.getMessage());
		}else if(throwable instanceof NoSuchWindowException){
			System.out.println(throwable.getMessage());
		}else if(throwable instanceof InvalidSelectorException){
			System.out.println(throwable.getMessage());
		}else if(throwable instanceof StaleElementReferenceException){
			System.out.println(throwable.getMessage());
		}
		throw new RuntimeException();// to stop the execution flow after execution

	}
 */

