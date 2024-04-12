package base;


import org.testng.annotations.Test;
import saucedemoPages.AddToCart;

public class Addcart extends Baseclass{
	
	
	@Test
	public void addsingleprod() throws InterruptedException 
	{
		test = extent.createTest("AddToCart"); 

			AddToCart ac = new AddToCart(driver);
			ac.clickonAddCart();
			Thread.sleep(3000);
			
			ac.clickonCart();
			Thread.sleep(3000);		
			
	}
}
