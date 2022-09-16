package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fb2 {

	@FindBy(xpath="//span[text()=\"Events\"]")
	private WebElement event;
	
	public fb2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void eventbt() {
		event.click();
	}
	
	
}
