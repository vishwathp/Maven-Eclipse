package base;

import org.testng.annotations.Test;

import saucedemoPages.AddToCart;
import saucedemoPages.BackHomeBtn;
import saucedemoPages.Checkout;

public class OrderWOProd extends Baseclass{
	
	@Test
	public void  OrdrWOProd() throws Exception 
	{
		
		//test = extent.createTest("ExtentReporters","SauceDemo Test");
		test = extent.createTest("Order Without Product"); 

		AddToCart ac = new AddToCart(driver);
		ac.clickonCart();
		Thread.sleep(3000);		

		Checkout co = new Checkout(driver);	
		co.checkoutbtn();

		co.Fname("Hinata");
		Thread.sleep(1000);

		co.Lname("Hyuga");
		Thread.sleep(1000);

		co.zipcode("1234");
		Thread.sleep(2000);

		co.continuebtn();
		Thread.sleep(2000);
		
		BackHomeBtn bh = new BackHomeBtn(driver);
		bh.Finish();
		Thread.sleep(1000);
		
		

	}


}
