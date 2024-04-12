package saucedemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	
	WebDriver driver;
	public Checkout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='checkout']")
	WebElement CheckoutBtn;
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement Firstname;

	@FindBy(xpath="//input[@id='last-name']")
	WebElement Lastname;

	@FindBy(xpath="//input[@id='postal-code']")
	WebElement Zip;

	@FindBy(xpath="//input[@id='continue']")
	WebElement Continue;
	
	@FindBy(xpath="//button[@id='cancel']")
	WebElement Cancel;
	
	@FindBy(xpath="//button[@id='back-to-products']")
	WebElement BackHome;
	
	
	@FindBy(xpath="//div[@class='error-message-container error']")
	WebElement ErrorMsg;
	
	public void checkoutbtn() throws Exception
	{
		CheckoutBtn.click();
		Thread.sleep(3000);	
	}
	
	public void Fname(String fstname) throws Exception
	{
		Firstname.sendKeys(fstname);
		Thread.sleep(3000);	
	}
	
	public void Lname(String lstname) throws Exception
	{
		Lastname.sendKeys(lstname);
		Thread.sleep(3000);	
	}
	
	public void zipcode(String PostalCode) throws Exception
	{
		Zip.sendKeys(PostalCode);
		Thread.sleep(3000);	
	}
	
	public void continuebtn() throws Exception
	{
		Continue.click();
		Thread.sleep(3000);	
	}
	
	public WebElement GetErrormsg()
	{
		return ErrorMsg;
	}
	
}
