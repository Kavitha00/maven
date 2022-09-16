package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazon4 {

	@FindBy(xpath="(//a[contains(@class,\"a-popover-trigger a-declarative\")])[2]")
	private WebElement rating;

	public WebElement getRating() {
		return rating;
	}
	
	public amazon4(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	
}
