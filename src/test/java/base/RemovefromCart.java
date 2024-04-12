package base;


import org.testng.annotations.Test;
import saucedemoPages.RemoveCartItems;
import saucedemoPages.AddToCart;

public class RemovefromCart extends Baseclass {

	@Test

	public void  remove() throws Exception 
	{

		//test = extent.createTest("ExtentReporters","SauceDemo Test");
		test = extent.createTest("RemoveFromYourCart"); 
		
		AddToCart ac = new AddToCart(driver);
		ac.clickonAddCart();
		Thread.sleep(3000);

		ac.clickonCart();
		Thread.sleep(3000);	

		RemoveCartItems Rc = new RemoveCartItems(driver);
		Rc.ClickRemvoeCart();
		Thread.sleep(3000);	

	}

}
