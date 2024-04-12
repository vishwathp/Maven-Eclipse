package base;

import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemoPages.ProdDetails;
import saucedemoPages.AddToCart;


public class ProdDetPage extends Baseclass {
	
	@Test
	public void ProdDet() throws Exception 
	{
		//test = extent.createTest("ExtentReporters","SauceDemo Test");
		test = extent.createTest("Add Product from Product Details Page"); 

			ProdDetails pd = new ProdDetails(driver);
			pd.Product();
			Thread.sleep(1000);
			
			AddToCart ac = new AddToCart(driver);
			ac.clickonAddCart();
			Thread.sleep(1000);
			
			pd.BackpackDetails();
			Thread.sleep(2000);
			
			String actTitle = pd.BackpackDetails().getText();
			String expeTitle = "Sauce Labs Backpack";
			Assert.assertEquals(actTitle, expeTitle);
			
	}		

}
