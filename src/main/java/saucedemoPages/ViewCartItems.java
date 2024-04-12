package saucedemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewCartItems {

	
	WebDriver driver;
	public ViewCartItems(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@id='shopping_cart_container']")
	WebElement Cart;
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack'] ")
	WebElement Bckpck;
	
	@FindBy(xpath="//div[@class='inventory_item_desc']")
	WebElement Desc;
	
	
	public void clickonCart()
	{
		Cart.click();
	}
	
	
	public void clickonBackpack()
	{
		Bckpck.click();
	}
	
	public WebElement Backpackdesc()
	{
		return Bckpck;
	}
	
	public WebElement Descpn()
	{
		return Desc;
	}
	
	
}
