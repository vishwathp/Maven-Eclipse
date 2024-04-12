package base;

import org.testng.annotations.Test;

import saucedemoPages.AddToCart;
import saucedemoPages.Checkout;

public class InformationPage extends Baseclass{
	
	@Test
	public void  infn() throws Exception 
	{
		test = extent.createTest("Checkout: Your Information page"); 
		
		AddToCart ac = new AddToCart(driver);
		ac.clickonAddCart();
		Thread.sleep(2000);
		
		ac.clickonCart();
		Thread.sleep(2000);		
		
		Checkout co = new Checkout(driver);	
		co.checkoutbtn();
		
		co.Fname("Hinata");
		Thread.sleep(1000);
		
		co.Lname("Hyuga");
		Thread.sleep(1000);
		
		co.zipcode("1234");
		Thread.sleep(1000);
		
		co.continuebtn();
		Thread.sleep(2000);

	}

}
