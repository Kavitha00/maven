package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fb3 {

	@FindBy(xpath="(//span[text()=\"Local\"])[2]")
	private WebElement local;
	
	@FindBy(xpath="//span[text()=\"Birthdays\"]")
	private WebElement birthday;
	
	@FindBy(xpath="//a[text()=\"Gowtham Zack\"]")
	private WebElement gowtham;
	
	public fb3(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void localbt() {
		local.click();
	}
	
	public void birthdaybt() {
		birthday.click();
	}
	
	public void gowthamacc() {
		gowtham.click();
	}
		
	
}
