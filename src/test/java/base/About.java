package base;

import org.testng.annotations.Test;
import saucedemoPages.AboutPage;


public class About extends Baseclass{

	@Test
	public void abt() throws InterruptedException
	{
		test = extent.createTest("About"); 
		
		AboutPage ap = new AboutPage(driver);
		ap.Sidebar();
		Thread.sleep(1000);
		
		ap.About();
		Thread.sleep(3000);		
	}

}
