package base;

import org.testng.annotations.Test;

import saucedemoPages.AddToCart;
import saucedemoPages.ProdDetails;
import saucedemoPages.RemoveCartItems;

public class EmptycartProdDet extends Baseclass{

	
	
	@Test
	public void ProdDet() throws Exception 
	{
		test = extent.createTest("Empty Cart"); 

			ProdDetails pd = new ProdDetails(driver);
			pd.Product();
			Thread.sleep(2000);
			
			AddToCart ac = new AddToCart(driver);
			ac.clickonAddCart();
			Thread.sleep(2000);
			
			RemoveCartItems rc = new RemoveCartItems(driver);
			rc.RmvProdDet();
			Thread.sleep(2000);
			
			
			
	}		

	
}
