package saucedemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement Username;

	@FindBy(xpath="//input[@id='password']")
	WebElement Password;

	@FindBy(xpath="//input[@id='login-button']")
	WebElement Login;
	
	public void enterUsername(String uname) throws InterruptedException
	{
		Username.sendKeys(uname);
		Thread.sleep(1000);
	}
	public void enterpassword(String pass) throws InterruptedException
	{
		Password.sendKeys(pass);
		Thread.sleep(1000);
	}
	public void clickonlogin()
	{
		Login.click();
	}
	
	
	
	
}
