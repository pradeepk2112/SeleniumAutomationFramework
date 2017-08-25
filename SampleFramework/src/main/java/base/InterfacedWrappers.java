package base;

import org.openqa.selenium.WebElement;

public interface InterfacedWrappers {
	
	public WebElement locateElement(String locate_by, String locatorvalue);
	public void entertext(WebElement elem,String sendkey);
	public void click(WebElement elem);
	public void select(WebElement elem,String select_By, String a);

	public void alert(String acc_dis, String alertkey);

	public String getText(WebElement elem);
	public String verifyText(WebElement elem, String expectedText);
	public String getTitle();
	public void switchWindow(int index);
	public String getAttribute(WebElement elem, String attribute);

	public void invokeApp();

}
