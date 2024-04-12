package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extentdemo {
	WebDriver driver;
	ExtentReports extent;

	@BeforeTest
	public void Setup() {
		// ExtentReports, ExtentSparkReporter
		String path = System.getProperty("user.dir")+"\\Reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Web site Test Results");
		reporter.config().setReportName("Test Results");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester name", "Vishwath P");

	}

	@Test
	public void Check_page() {
		extent.createTest("Check_page");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/");
		driver.manage().window().maximize();

		driver.getTitle();

		System.out.println("Page title is : " + driver.getTitle());

		driver.getCurrentUrl();

		System.out.println("Page URL is : " + driver.getCurrentUrl());

		extent.flush();
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}


}
