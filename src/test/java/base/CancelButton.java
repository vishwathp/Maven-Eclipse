package base;

import org.testng.annotations.Test;

import saucedemoPages.AddToCart;
import saucedemoPages.CancelBtn;
import saucedemoPages.Checkout;

public class CancelButton extends Baseclass{
	
	@Test
	public void  BckHmeBtn() throws Exception 
	{
		test = extent.createTest("Cancel Button"); 
		
		AddToCart ac = new AddToCart(driver);
		ac.clickonAddCart();
		Thread.sleep(1000);

		ac.clickonCart();
		Thread.sleep(1000);		

		Checkout co = new Checkout(driver);	
		co.checkoutbtn();

		co.Fname("Hinata");
		Thread.sleep(1000);

		co.Lname("Hyuga");
		Thread.sleep(1000);

		co.zipcode("123456");
		Thread.sleep(2000);

		co.continuebtn();
		Thread.sleep(1000);
		
		CancelBtn cb = new CancelBtn(driver);	
		cb.cancel();
		Thread.sleep(1000);
		
		
	}

}
