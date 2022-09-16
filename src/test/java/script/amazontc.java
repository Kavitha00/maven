package script;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import Genericlib.Baseclass;
import pom.amazon1;
import pom.amazon2;
import pom.amazon3;
import pom.amazon4;


public class amazontc extends Baseclass {

	@Test
	public void tc1() throws InterruptedException {
		
		amazon1 one=new amazon1(driver);
		one.mobilebt();
		
		amazon2 two=new amazon2(driver);
		wb.mousehover(driver, two.getMobileandaccess());
		two.mibt();
		
		amazon3 three=new amazon3(driver);
		Point loc = three.getPhonemouse().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		wb.scrollbar(driver, x, y);
		three.phonebt();
		
		amazon4 four=new amazon4(driver);
		wb.mousehover(driver, four.getRating());
		Thread.sleep(3000);
		Thread.sleep(3000);
		
	}
	
	
}
