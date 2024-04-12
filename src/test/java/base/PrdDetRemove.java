package base;

import org.testng.annotations.Test;

import saucedemoPages.AddToCart;
import saucedemoPages.ProdDetails;
import saucedemoPages.RemoveCartItems;

public class PrdDetRemove extends Baseclass{
	
	@Test
	public void ProdDet() throws Exception 
	{
		//test = extent.createTest("ExtentReporters","SauceDemo Test");
		test = extent.createTest("Remove from Prod details Page"); 

			ProdDetails pd = new ProdDetails(driver);
			pd.Product();
			Thread.sleep(1000);
			
			AddToCart ac = new AddToCart(driver);
			ac.clickonAddCart();
			Thread.sleep(1000);
			
			RemoveCartItems Rc = new RemoveCartItems(driver);
			Rc.ClickRemvoeCart();
			Thread.sleep(1000);
	}		
	
	

}
