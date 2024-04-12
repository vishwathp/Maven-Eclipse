package base;

import org.testng.Assert;
import org.testng.annotations.Test;

import saucedemoPages.AddToCart;
import saucedemoPages.ViewCartItems;

public class ViewcartItem extends Baseclass{

	@Test
	public void  Cart() throws Exception 
	{
		//test = extent.createTest("ExtentReporters","SauceDemo Test");
		test = extent.createTest("ViewCartItemDetails"); 
		
		ViewCartItems vc = new ViewCartItems(driver);	
		vc.clickonBackpack();		
		Thread.sleep(2000);
		
		AddToCart ac = new AddToCart(driver);
		ac.Bag();
		
		//click on cart  and verify the details in cart page
		
		vc.clickonCart();
		Thread.sleep(2000);
		
		String actDesc = vc.Descpn().getText();
		String expeDesc = "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
		Assert.assertEquals(actDesc, expeDesc);
		
			
	}
	
}
