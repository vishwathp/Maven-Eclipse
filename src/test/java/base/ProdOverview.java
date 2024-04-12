package base;

import org.testng.Assert;
import org.testng.annotations.Test;

import saucedemoPages.AddToCart;
import saucedemoPages.Checkout;
import saucedemoPages.ProdDetails;

public class ProdOverview extends Baseclass{
	
	
	@Test
	public void ProdDiff() throws Exception 
	{

		//test = extent.createTest("ExtentReporters","SauceDemo Test");
		
		test = extent.createTest("Product Overview Page"); 
		
		AddToCart ac = new AddToCart(driver);
		ac.Bag();
		Thread.sleep(1000);

		ac.Ones();
		Thread.sleep(1000);

		ac.RedT();
		Thread.sleep(1000);
		
		ac.clickonCart();
		Thread.sleep(2000);

		Checkout co = new Checkout(driver);	
		co.checkoutbtn();

		co.Fname("Inoue");
		Thread.sleep(1000);

		co.Lname("Orihime");
		Thread.sleep(1000);

		co.zipcode("134223");
		Thread.sleep(1000);

		co.continuebtn();
		Thread.sleep(2000);
		
		ProdDetails pd = new ProdDetails(driver);
		
		String actTitle = pd.BackpackDetails().getText();
		String expeTitle = "Sauce Labs Backpack";
		Assert.assertEquals(actTitle, expeTitle);

		System.out.println(actTitle);
		System.out.println(expeTitle);
		
		String actTitle1 = pd.Ons().getText();
		String expeTitle1 = "Sauce Labs Onesie";
		Assert.assertEquals(actTitle1, expeTitle1);
		
		System.out.println(actTitle1);
		System.out.println(expeTitle1);
		
		String actTitle2 = pd.Tsh().getText();
		String expeTitle2 = "Test.allTheThings() T-Shirt (Red)";
		Assert.assertEquals(actTitle2, expeTitle2);
		
		System.out.println(actTitle2);
		System.out.println(expeTitle2);
		
		
		
	}	

}
