package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

	Actions action;
	
	WebDriverWait wait;
	Select select;
	BrowserUtils utils;
	
	public void waitUntilElementVisiable(WebElement element) {
		wait=new WebDriverWait(Driver.getDriver(),5);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public void actionsSendKeys(WebElement element, String text) {
		action= new Actions(Driver.getDriver());
		action.sendKeys(element, text).build().perform();
	}
	

	public void actionsSendKeys(WebElement element, String string1,WebElement element2, String string2,WebElement element3, String string3){
		action= new Actions(Driver.getDriver());
		action.sendKeys(element, string1).build().perform();
		action.sendKeys(element2,string2).build().perform();
		action.sendKeys(element3,string3).build().perform();
		//action.sendKeys(element4,string4).build().perform();
	}
}
