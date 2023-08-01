package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectsBase {
	
	WebDriver driver;

	public PageObjectsBase(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
