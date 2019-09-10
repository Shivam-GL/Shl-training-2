package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	WebDriver driver;
	
	public BaseClass(WebDriver driver) {
		this.driver=driver;
	}
	public void clickBtn(WebElement button) {
		 button.click();
	}
	public void enterInput(WebElement inputField,String inputValue) {
		inputField.sendKeys(inputValue);
	}
	public void clearText(WebElement inputField) {
		inputField.clear();
	}
	
	public void Scroll() {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,1000)");
	}
	public void waitCondition(WaitExpectedConditions conditions,By locator,int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		switch (conditions)
		{
		case PRESENCE_OF_ELEMENT:
							wait.until(ExpectedConditions.presenceOfElementLocated(locator));
							break;
		case ELEMENT_TO_BE_CLICKABLE: 
						  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
						  break;	
		}
	}
	
	
}
