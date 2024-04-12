package base;

import org.testng.annotations.Test;

import saucedemoPages.AddToCart;
import saucedemoPages.BackHomeBtn;
import saucedemoPages.Checkout;
//import saucedemoPages.LoginPage;

public class SingleOrder extends Baseclass{
	
	@Test
	public void  singleOrdr() throws Exception 
	{
		test = extent.createTest("SingleProductOrder"); 
	
		AddToCart ac = new AddToCart(driver);
		ac.Bag();
		Thread.sleep(1000);

		ac.clickonCart();
		Thread.sleep(1000);		

		Checkout co = new Checkout(driver);	
		co.checkoutbtn();

		co.Fname("Hinata");
		//Thread.sleep(1000);

		co.Lname("Hyuga");
		//Thread.sleep(1000);

		co.zipcode("1234");
		//Thread.sleep(2000);

		co.continuebtn();
		Thread.sleep(1000);
		
		BackHomeBtn bh = new BackHomeBtn(driver);
		bh.Finish();
		Thread.sleep(1000);
		
		

	}

}