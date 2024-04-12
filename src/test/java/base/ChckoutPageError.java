package base;

import org.testng.Assert;
import org.testng.annotations.Test;

import saucedemoPages.AddToCart;
//import saucedemoPages.BackHomeBtn;
import saucedemoPages.Checkout;

public class ChckoutPageError extends Baseclass{


	@Test
	public void  CheckoutPage() throws Exception 
	{
		
		test = extent.createTest("Checkout Page Error"); 

		AddToCart ac = new AddToCart(driver);
		ac.Bag();
		Thread.sleep(1000);

		ac.clickonCart();
		Thread.sleep(1000);		

		Checkout co = new Checkout(driver);	
		co.checkoutbtn();

		co.Fname("");
		Thread.sleep(1000);

		co.Lname("Luffy");

		co.zipcode("264823");

		co.continuebtn();

		String actuerromsg = co.GetErrormsg().getText();
		String expected = "Error: First Name is required";
		Assert.assertEquals(actuerromsg, expected);

		//BackHomeBtn bh = new BackHomeBtn(driver);
		//bh.Finish();
		//Thread.sleep(1000);




	}

}
