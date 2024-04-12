package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//import com.aventstack.extentreports.util.Assert;

import saucedemoPages.InvalidLog;

public class InvalidLogin {

	WebDriver driver;
	public ExtentReports extent;
	public ExtentSparkReporter reporter;
	public ExtentTest test;
	@BeforeTest
	public void config()
	{

		//String Path = System.getProperty("D:\\Java-Selenium\\Scroll\\reports\\index.html");
		String Path = System.getProperty("user.dir")+"\\reports\\invalid\\LoginFail.html";
		reporter = new ExtentSparkReporter(Path);
		reporter.config().setDocumentTitle("Test results");
		reporter.config().setReportName("Web automation report");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester","Vishwath");

		extent.flush();
	}


	@Test
	public void invalidLog() throws InterruptedException 
	{
		test = extent.createTest("InvalidLogin");

		System.setProperty("webdriver.chrome.driver","D:\\Java-Selenium\\Art1\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();

		driver.getTitle();

		System.out.println("Page title is : " + driver.getTitle());

		driver.getCurrentUrl();

		System.out.println("Page URL is : " + driver.getCurrentUrl());

		InvalidLog lp=new InvalidLog(driver);
		lp.invaliduname("stduser");
		lp.invalidpwd("secret");
		lp.clickonlogin();
		Thread.sleep(2000);

		String acterrmsg = lp.LoginErrormsg().getText();
		String experror = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(acterrmsg, experror);
		System.out.println(acterrmsg);
		System.out.println(experror);

		driver.close();
	

	}
	
}
