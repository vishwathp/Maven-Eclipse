package saucedemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackHomeBtn {

	WebDriver driver;
	public BackHomeBtn(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='finish']")
	WebElement FinishBtn; 
	
	@FindBy(xpath="//button[@id='back-to-products']")
	WebElement BckHmBtn; 
	
	public void Finish() throws Exception
	{
		FinishBtn.click();
		Thread.sleep(1000);	
	} 
	
	public void BckHombtn() throws Exception
	{
		BckHmBtn.click();
		Thread.sleep(1000);	
	}
	
	
	
	
	
}
