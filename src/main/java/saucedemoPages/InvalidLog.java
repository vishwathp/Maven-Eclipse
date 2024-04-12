package saucedemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidLog {


	WebDriver driver;
	public InvalidLog(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='user-name']")
	WebElement invaliduname;

	@FindBy(xpath="//input[@id='password']")
	WebElement invalidpwd;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement Login;
	
	@FindBy(xpath="//*[text()='Epic sadface: Username and password do not match any user in this service']")
	WebElement LoginError;

	@FindBy(xpath="//*[text()='Epic sadface: Username and password do not match any user in this service']")
	WebElement Erorr;
		
	
	public void invaliduname(String iuname) throws InterruptedException
	{
		invaliduname.sendKeys(iuname);
		Thread.sleep(3000);
	}
	public void invalidpwd(String ipwd) throws InterruptedException
	{
		invalidpwd.sendKeys(ipwd);
		Thread.sleep(3000);
	}

	public void clickonlogin()
	{
		Login.click();
	}

	public WebElement LoginErrormsg()
	{
		return LoginError;
	}
}
