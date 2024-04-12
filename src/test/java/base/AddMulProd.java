package base;


import org.testng.annotations.Test;
import saucedemoPages.AddToCart;


public class AddMulProd extends Baseclass{

	@Test
	public void addmulprod() throws InterruptedException 
	{

		test = extent.createTest("Add Multiple Products to Cart"); 

		AddToCart ac = new AddToCart(driver);
		ac.Bag();
		Thread.sleep(1000);

		ac.Bike();
		Thread.sleep(1000);

		ac.Jack();
		Thread.sleep(1000);

		ac.Tshir();
		Thread.sleep(1000);

		ac.clickonCart();
		Thread.sleep(2000);		

	}

}
