package saucedemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBtn {

	WebDriver driver;
	public CancelBtn(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='cancel']")
	WebElement CancelBton;
	
	public void cancel() throws Exception
	{
		CancelBton.click();
		Thread.sleep(3000);	
	}
	
}
