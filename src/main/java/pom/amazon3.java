package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazon3 {

	@FindBy(xpath="//span[contains(text(),\"Xiaomi Mi A3 (Kind of Grey, 4GB RAM, 64GB Storage)\")]")
	private WebElement phonemouse;
	
	public WebElement getPhonemouse() {
		return phonemouse;
	}
	
	@FindBy(xpath="//span[contains(text(),\"Xiaomi Mi A3 (Kind of Grey, 4GB RAM, 64GB Storage)\")]")
	private WebElement phone;

	public amazon3(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void phonebt() {
		phone.click();
	}
	
}
