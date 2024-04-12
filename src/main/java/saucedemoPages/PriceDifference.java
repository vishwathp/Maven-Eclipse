package saucedemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceDifference {
	
	WebDriver driver;
	public PriceDifference(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='summary_info_label summary_total_label']")
	WebElement TotalPrice;
	
	@FindBy(xpath="//div[@class='summary_info_label summary_total_label']")
	WebElement CurrentPrice;
	
	public WebElement FinalPrice()
	{
		return TotalPrice;
	}
	
	public WebElement CurPrice()
	{
		return CurrentPrice;
	}

}
