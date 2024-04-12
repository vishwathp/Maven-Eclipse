package base;

import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemoPages.ProdDetails;

public class SpecificProdPage extends Baseclass{

	
	@Test
	public void ProdDet() throws Exception 
	{
		
		//test = extent.createTest("ExtentReporters","SauceDemo Test");
		test = extent.createTest("Specific Product Details"); 

			ProdDetails pd = new ProdDetails(driver);
			pd.Onesi();
			Thread.sleep(2000);
			
			String actDesc = pd.GetProdDetails().getText();
			String expeDesc = "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.";
			Assert.assertEquals(actDesc, expeDesc);
			
		
	}
}
