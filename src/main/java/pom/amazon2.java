package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazon2 {

	@FindBy(xpath="(//span[contains(text(),\"Mobiles & Accessories\")])[2]")
	private WebElement mobileandaccess;

	public WebElement getMobileandaccess() {
		return mobileandaccess;
	}
	@FindBy(xpath="(//a[text()=\"Mi\"])[1]")
	private WebElement mi;
	
	public amazon2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void mibt() {
		mi.click();
	}
	
	
}
