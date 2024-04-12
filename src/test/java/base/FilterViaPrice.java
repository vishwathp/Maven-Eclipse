package base;

import saucedemoPages.Filterpage;

import org.testng.annotations.Test;
//import saucedemoPages.Filterpage;


public class FilterViaPrice extends Baseclass {

	@Test
	public void FilterBtn() throws Exception 
	{
		//test = extent.createTest("ExtentReporters","SauceDemo Test");
		test = extent.createTest("FilterViaPrice"); 

			Filterpage Fp = new Filterpage(driver);
			
			Fp.clickonFilter();
			
			Thread.sleep(3000);
			
			Fp.clickonLoHi();
			
			Thread.sleep(3000);
			
			Fp.clickonHiLo();
			
			Thread.sleep(3000);
			
	}
	
}
