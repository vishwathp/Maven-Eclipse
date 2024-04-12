package base;

import org.testng.annotations.Test;
import saucedemoPages.Filterpage;

public class FilterViaAlphabets extends Baseclass {

	
	@Test
	public void FilterBtn() throws Exception 
	{
		//test = extent.createTest("ExtentReporters","SauceDemo Test");
		
		test = extent.createTest("FilterViaName"); 

			Filterpage Fp = new Filterpage(driver);
			
			Fp.clickonFilter();
			
			Thread.sleep(3000);
			
			Fp.clickonZA();
			
			Thread.sleep(3000);
			
			Fp.clickonAZ();
			
			Thread.sleep(3000);
			
	}
	
}
