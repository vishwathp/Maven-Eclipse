package saucedemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filterpage {
	
	WebDriver driver;
	public Filterpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@data-test='product_sort_container']")
	WebElement Filter;
	
	@FindBy(xpath="//option[@value='az']")
	WebElement AZ;

	@FindBy(xpath="//option[@value='za']")
	WebElement ZA;
	
	@FindBy(xpath="//option[@value='hilo']")
	WebElement HiLo;
	
	@FindBy(xpath="//option[@value='lohi']")
	WebElement LoHi;
	
	
	public void clickonFilter() throws Exception
	{
		Filter.click();
		Thread.sleep(2000);
	}
	
	public void clickonAZ() throws Exception
	{
		AZ.click();
		Thread.sleep(2000);
	}
	
	public void clickonZA() throws Exception
	{
		ZA.click();
		Thread.sleep(2000);
	}
	
	public void clickonHiLo() throws Exception
	{
		HiLo.click();
		Thread.sleep(2000);
	}
	
	public void clickonLoHi() throws Exception
	{
		LoHi.click();
		Thread.sleep(2000);
	}
	
	
	
}
