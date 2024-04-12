package base;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import org.apache.commons.io.FileUtils;
//import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//import org.testng.annotations.AfterClass;

import saucedemoPages.LoginPage;

public class Baseclass 
{

	WebDriver driver;
	public ExtentReports extent;
	public ExtentSparkReporter reporter;
	public ExtentTest test;


	@BeforeMethod
	public void Start() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","D:\\Java-Selenium\\Art1\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();

		driver.getTitle();

		System.out.println("Page title is : " + driver.getTitle());

		driver.getCurrentUrl();

		System.out.println("Page URL is : " + driver.getCurrentUrl());

		LoginPage lp=new LoginPage(driver);
		lp.enterUsername("standard_user");
		Thread.sleep(1000);
		lp.enterpassword("secret_sauce");
		Thread.sleep(1000);
		lp.clickonlogin();
		Thread.sleep(3000);
	}
		

	@BeforeTest
	public void config()
	{

		//String Path = System.getProperty("D:\\Java-Selenium\\Assesment\\reports");
		String Path = System.getProperty("user.dir")+"\\reports\\index.html";
		reporter = new ExtentSparkReporter(Path);
		reporter.config().setDocumentTitle("Test results");
		reporter.config().setReportName("Web Automation Report");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester","Vishwath");


	}

	
	@AfterMethod
    public void afterMethod(ITestResult result) {
        // Log the result of the test
        if (result.getStatus() == ITestResult.FAILURE) {
            test.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.pass("Test passed");
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.skip("Test skipped");
        }
        extent.flush();
        //driver.quit();

    }

	
	@AfterMethod 
	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException { 
		if (testResult.getStatus() == ITestResult.FAILURE) { 
			System.out.println(testResult.getStatus());
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
			FileUtils.copyFile(scrFile, new File("errorScreenshots\\" + testResult.getName() + "-" 
					+ Arrays.toString(testResult.getParameters()) +  ".jpg"));
		} 
	}



	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
