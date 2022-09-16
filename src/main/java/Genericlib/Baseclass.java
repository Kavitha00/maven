package Genericlib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public WebDriver driver;
	
	public propertyfile pf = new propertyfile();
	
	public Webelements wb = new Webelements();
	
	@BeforeMethod
	public void openapp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(pf.propertyfiledata("url2"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeapp(ITestResult result) throws IOException {
		
		String name = result.getName();
		int status = result.getStatus();
		
		if(status==2) {
			screenshot s=new screenshot();
			s.getscreenshot(driver, name);
		}
		driver.quit();
	}
	
}
