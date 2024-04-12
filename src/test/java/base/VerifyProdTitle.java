package base;

//import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

//import saucedemoPages.AddToCart;
import saucedemoPages.ProdDetails;

public class VerifyProdTitle extends Baseclass{
	
	

	@Test
	public void ProdDet() throws Exception 
	{
		//test = extent.createTest("ExtentReporters","SauceDemo Test");
		test = extent.createTest("VerifyProdTitle"); 

			ProdDetails pd = new ProdDetails(driver);
			String actTitle = pd.BackpackDetails().getText();
			String expeTitle = "Sauce Labs Backpack";
			Assert.assertEquals(actTitle, expeTitle);
			
			System.out.println(actTitle);
			System.out.println(expeTitle);
			
			String actTitle1 = pd.BikeLit().getText();
			String expeTitle1 = "Sauce Labs Bike Light";
			Assert.assertEquals(actTitle1, expeTitle1);
			
			System.out.println(actTitle1);
			System.out.println(expeTitle1);
			
			String actTitle2 = pd.BoltT().getText();
			String expeTitle2 = "Sauce Labs Bolt T-Shirt";
			Assert.assertEquals(actTitle2, expeTitle2);
			
			System.out.println(actTitle2);
			System.out.println(expeTitle2);
			
			String actTitle3 = pd.JacketFleece().getText();
			String expeTitle3 = "Sauce Labs Fleece Jacket";
			Assert.assertEquals(actTitle3, expeTitle3);
			
			System.out.println(actTitle3);
			System.out.println(expeTitle3);
			
			String actTitle4 = pd.Ons().getText();
			String expeTitle4 = "Sauce Labs Onesie";
			Assert.assertEquals(actTitle4, expeTitle4);
			
			System.out.println(actTitle4);
			System.out.println(expeTitle4);
			
			String actTitle5 = pd.Tsh().getText();
			String expeTitle5 = "Test.allTheThings() T-Shirt (Red)";
			Assert.assertEquals(actTitle5, expeTitle5);
			
			System.out.println(actTitle5);
			System.out.println(expeTitle5);
			
			
			
	}		
	
	

}
