package saucedemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {
	
	WebDriver driver;
	public AboutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement Sidebar;
	
	@FindBy(xpath="//a[@id='about_sidebar_link']")
	WebElement AboutBtn;
	
	public void Sidebar() {
		Sidebar.click();
	}
	
	public void About() {
		AboutBtn.click();
	}

}
