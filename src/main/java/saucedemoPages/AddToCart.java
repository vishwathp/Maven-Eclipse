package saucedemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	WebDriver driver;
	public AddToCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Add to cart']")
	WebElement Addcart;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement Backpack;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
	WebElement Bikelight;

	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	WebElement Tshirt;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	WebElement Jacket;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")
	WebElement Onsie;
	
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	WebElement RedTshirt;
	
	@FindBy(xpath="//div[@id='shopping_cart_container']")
	WebElement CartItem;
	
	
	
	public void clickonAddCart()
	{
		Addcart.click();
	}

	public void clickonCart()
	{
		CartItem.click();
		
	}
	
	public void Bag()
	{
		Backpack.click();
		
	}
	
	public void Bike()
	{
		Bikelight.click();
	}
	
	public void Tshir()
	{
		Tshirt.click();
	}
	
	public void Jack()
	{
		Jacket.click();
	}
	
	public void Ones()
	{
		Onsie.click();
	}
	
	public void RedT()
	{
		RedTshirt.click();
	}

	
}
