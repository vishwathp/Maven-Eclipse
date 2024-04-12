package base;

import org.testng.annotations.Test;
import saucedemoPages.LoginPage;


public class Log extends Baseclass{


	@Test
	public void log () throws InterruptedException 
	{
		//test = extent.createTest("ExtentReporters","SauceDemo Test");
		//test = extent.createTest("ExtentReporters"); 
		
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername("standard_user");
		//Thread.sleep(3000);
		lp.enterpassword("secret_sauce");
		//Thread.sleep(3000);
		lp.clickonlogin();
		Thread.sleep(2000);
		
		
	}

}
