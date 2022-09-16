package script;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import Genericlib.Baseclass;
import pom.skillrary1;

public class skillrarytc1 extends Baseclass {

	@Test
	public void tc1() throws IOException, InterruptedException {
		
		skillrary1 one=new skillrary1(driver);
		one.cucumberbt();
		wb.doubleclick(driver, one.getAdd());
		one.addcartbt();
		wb.alertpopup(driver);
		Point loc = one.getSelectcourses().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		wb.scrollbar(driver, x, y);
		Thread.sleep(3000);
		wb.dropdown(one.getDrop1(),pf.propertyfiledata("drop"));
		wb.dropdown(one.getDrop1(),pf.propertyfiledata("drop2"));
		wb.dropdown(one.getDrop1(),pf.propertyfiledata("drop3"));
		Thread.sleep(3000);
	}
	
}
