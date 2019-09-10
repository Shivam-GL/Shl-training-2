package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class HomePage extends BaseClass{
	WebDriver driver;
	
	@FindBy ()
	WebElement element;
	
	
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login() {
		enterInput(element,"");
		enterInput(element,"");
		clickBtn(element);
	}
	
}
