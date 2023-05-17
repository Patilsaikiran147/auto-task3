package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
public WebDriver driver;
public static ExtentReports report;
public static ExtentTest test;
		
	@BeforeSuite
	public void setup()
	{ 	
		report = new ExtentReports("D:\\Testing Program\\DemoShop\\test.html");
	 	test = report.startTest("Login");
	 	WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
	    test.log(LogStatus.PASS, "launched application");
	}
	
	@BeforeTest
	public void login() {
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("saikiranpatil@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Ojas@123");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	    test.log(LogStatus.PASS, "login Successful");

		String str = driver.getTitle();
			Assert.assertEquals(str,"Demo Web Shop");
			System.out.println("Title:"+ str);
		
	}
	
	@AfterTest
	public void logout() {
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	    test.log(LogStatus.PASS,"application logout");

	}
	
	
	@AfterSuite
	public void tearDown()
	{
		if(driver!=null)
			driver.quit();
	    test.log(LogStatus.PASS,"application closed");
		report.endTest(test);
		 report.flush();
		 
	}
	
}
