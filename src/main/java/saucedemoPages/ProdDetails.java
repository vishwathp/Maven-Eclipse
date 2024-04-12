package saucedemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdDetails {
	
	WebDriver driver;
	public ProdDetails(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	WebElement Prodtext;
	
	@FindBy(xpath="//div[text()='Sauce Labs Onesie']")
	WebElement Onesie;
	
	@FindBy(xpath="//div[text()='Sauce Labs Bike Light']")
	WebElement BikeLgt;
	
	@FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']")
	WebElement Bolt;
	
	@FindBy(xpath="//div[text()='Sauce Labs Fleece Jacket']")
	WebElement FleeceJacket;
	
	@FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']")
	WebElement TshirtRed;
	
	@FindBy(xpath="//div[@class='inventory_details_desc large_size']")
	WebElement Desc;
	
	public void Product() throws Exception
	{
		Prodtext.click();
		Thread.sleep(3000);
	}
	
	public void Onesi() throws Exception
	{
		Onesie.click();
		Thread.sleep(3000);
	}
	
	public void BikeLt() throws Exception
	{
		BikeLgt.click();
		Thread.sleep(3000);
	}
	
	public void BoltTshirt() throws Exception
	{
		Bolt.click();
		Thread.sleep(3000);
	}
	
	public void Jacket() throws Exception
	{
		FleeceJacket.click();
		Thread.sleep(3000);
	}
	
	public void RedTshirt() throws Exception
	{
		TshirtRed.click();
		Thread.sleep(3000);
	}
	
	public WebElement GetProdDetails()
	{
		return Desc;
	}
	
	public WebElement BackpackDetails()
	{
		return Prodtext;
	}
	
	public WebElement Ons()
	{
		return Onesie;
	}
	
	public WebElement Tsh()
	{
		return TshirtRed;
	}
	
	public WebElement BikeLit()
	{
		return BikeLgt;
	}
	
	public WebElement BoltT()
	{
		return Bolt;
	}
	
	public WebElement JacketFleece()
	{
		return FleeceJacket;
	}
}
