package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazon1 {

	@FindBy(xpath="//a[text()=\"Mobiles\"]")
	private WebElement mobile;
	
	public amazon1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void mobilebt() {
		mobile.click();
	}
	
}
