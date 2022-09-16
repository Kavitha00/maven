package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fb4 {

	@FindBy(xpath="(//div[contains(@class,\"aglvbi8b om3e55n1 i8zpp7h3 g4tp4svg\")])[1]")
	private WebElement acc;
	
	@FindBy(xpath="//span[text()=\"Log Out\"]")
	private WebElement logout;
	
	public fb4(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void accountbt() {
		acc.click();
	}
	
	public void logoutbt() {
		logout.click();
	}
	
}
