package script;



import org.testng.annotations.Test;

import Genericlib.Baseclass;
import pom.fb1;
import pom.fb2;
import pom.fb3;
import pom.fb4;

public class fbtc1 extends Baseclass{

 
	@Test
	public void tc1() throws InterruptedException {
		fb1 one=new fb1(driver);
		one.createaccbt();
		one.firstnametext();
		one.surnametext();
		one.mobilenumber();
		one.passwordtext();
		one.radiobtt();
		one.radiobtt();
		one.signupbt();
		Thread.sleep(3000);
		
		fb2 two=new fb2(driver);
		two.eventbt();
		
		fb3 three=new fb3(driver);
		three.localbt();
		three.birthdaybt();
		three.gowthamacc();
		Thread.sleep(3000);
		
		fb4 four=new fb4(driver);
		four.accountbt();
		four.logoutbt();
		
	}


	
}
