package base;

import org.testng.annotations.Test;

import saucedemoPages.AddToCart;
import saucedemoPages.RemoveCartItems;



public class RemoveFromHome extends Baseclass{

	@Test
	public void  removefromhome() throws Exception 
	{

		//test = extent.createTest("ExtentReporters","SauceDemo Test");
		test = extent.createTest("RemoveItemFromHomePage"); 
		
		AddToCart ac = new AddToCart(driver);
		ac.clickonAddCart();
		Thread.sleep(3000);
		
		RemoveCartItems Rc = new RemoveCartItems(driver);
		Rc.ClickRemvoeCart();
		Thread.sleep(3000);	
	}

}