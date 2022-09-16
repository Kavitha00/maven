package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fb1 {

	@FindBy(xpath="//a[contains(text(),\"Create New Account\")]")
	private WebElement createacc;
	
	@FindBy(name="firstname")
	private WebElement firstname;
	
	@FindBy(name="lastname")
	private WebElement surname;
	
	@FindBy(xpath="(//input[@type=\"text\"])[4]")
	private WebElement mobileno;
	
	@FindBy(xpath="(//input[@type=\"password\"])[2]")
	private WebElement password;
	
	@FindBy(xpath="(//input[@type=\"radio\"])[1]")
	private WebElement radiobt;
	
	@FindBy(name="websubmit")
	private WebElement signup;



public fb1(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void createaccbt() {
	createacc.click();
}
public void firstnametext() {
	firstname.sendKeys("kavitha");
}
public void surnametext() {
	surname.sendKeys("s");
}
public void mobilenumber() {
	mobileno.sendKeys("7358083533");
}
public void passwordtext() {
	password.sendKeys("Kavi@2001");
}
public void radiobtt() {
	radiobt.click();
}
public void signupbt() {
	signup.click();
}


}
