package base;

import org.testng.Assert;
import org.testng.annotations.Test;

import saucedemoPages.AddToCart;
import saucedemoPages.CancelBtn;
import saucedemoPages.Checkout;
import saucedemoPages.PriceDifference;
import saucedemoPages.RemoveCartItems;

public class PriceDiff extends Baseclass{


	@Test
	public void PriceDif() throws Exception 
	{
		//test = extent.createTest("ExtentReporters","SauceDemo Test");
		test = extent.createTest("Price Difference"); 

		AddToCart ac = new AddToCart(driver);
		ac.Bag();
		Thread.sleep(1000);

		ac.Bike();
		Thread.sleep(1000);

		ac.Jack();
		Thread.sleep(1000);

		ac.clickonCart();
		Thread.sleep(3000);

		Checkout co = new Checkout(driver);	
		co.checkoutbtn();

		co.Fname("Jack");
		Thread.sleep(1000);

		co.Lname("Sparrow");
		Thread.sleep(1000);

		co.zipcode("1345");
		Thread.sleep(2000);

		co.continuebtn();
		Thread.sleep(3000);
		
		PriceDifference pd = new PriceDifference(driver);
		String TPrice = pd.FinalPrice().getText();
		System.out.println(TPrice);
		
			
		CancelBtn cb = new CancelBtn(driver);
		cb.cancel();
		Thread.sleep(2000);

		ac.clickonCart();
		Thread.sleep(2000);
		
		RemoveCartItems rc = new RemoveCartItems(driver);
		rc.RmvLt();

		co.checkoutbtn();

		co.Fname("Jack");
		Thread.sleep(1000);

		co.Lname("Sparrow");
		Thread.sleep(1000);

		co.zipcode("1345");
		Thread.sleep(2000);

		co.continuebtn();
		Thread.sleep(3000);
		
		String CPrice = pd.CurPrice().getText();
		System.out.println(CPrice);
		
		Assert.assertNotEquals(TPrice, CPrice);
		
		//System.out.println(CPrice);
		//System.out.println(TPrice);
		
		if(CPrice != TPrice)
			System.out.println("Pass");
		else
			System.out.println("Fail");
			
		
		
	
		

	}		

}
