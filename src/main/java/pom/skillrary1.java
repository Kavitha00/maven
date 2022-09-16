package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillrary1 {

	@FindBy(xpath="(//a[text()=\"Cucumber\"])[2]")
	private WebElement cucumber;
	
	@FindBy(id="add")
	private WebElement add;
	
	@FindBy(xpath="(//button[@type=\"submit\"])[2]")
	private WebElement addcart;
	
	@FindBy(xpath="//b[text()=\"Select Courses by price:\"]")
	private WebElement selectcourses;
	
	@FindBy(xpath="//select[contains(@class,\"form-control\")]")
	private WebElement drop1;
	

	
	@FindBy(xpath="//input[@type=\"Submit\"]")
	private WebElement submit;
	
	public skillrary1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void cucumberbt() {
		cucumber.click();
	}
	
	public void addcartbt() {
		addcart.click();
	}

	public WebElement getSelectcourses() {
		return selectcourses;
	}


	public WebElement getDrop1() {
		return drop1;
	}





	
	public void submitbt() {
		submit.click();
	}


	


	public WebElement getAdd() {
		return add;
	}
	
}
