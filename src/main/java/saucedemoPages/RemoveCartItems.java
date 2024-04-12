package saucedemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveCartItems {

	
	WebDriver driver;
	public RemoveCartItems(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@id='shopping_cart_container']")
	WebElement Cart;
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack'] ")
	WebElement Bckpck;
	
	@FindBy(xpath="//button[text()='Remove']")
	WebElement CartRemove;
	
	@FindBy(xpath="//button[text()='Remove']")
	WebElement HomeRemove;
	
	@FindBy(xpath="//button[text()='Remove']")
	WebElement ProdDetRemove;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	WebElement Addcart;
	
	@FindBy(xpath="//div[@id='shopping_cart_container']")
	WebElement CartItem;
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-bike-light']")
	WebElement LightRemove;
		
	public void ClickRemvoeCart() throws Exception
	{
		CartRemove.click();
		Thread.sleep(3000);
	}
	
	public void RmvProdDet() throws Exception
	{
		ProdDetRemove.click();
		Thread.sleep(2000);
	}
	
	public void RmvLt() throws Exception
	{
		LightRemove.click();
		Thread.sleep(2000);
	}
	
	
	
	
	
}
