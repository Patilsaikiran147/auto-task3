package Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtendReport {
	ExtentReports report;
	ExtentTest test;
	public static WebDriver driver;
	
	@BeforeClass
	public void starttest() {
		report=new ExtentReports(System.getProperty("D:\\Testing Program\\PomTestng")+"test.html");
	    test=report.startTest("kiru");
	    }
	
	@Test
	public void adactinlogin() {
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.findElement(By.name("username")).sendKeys("mansoor8");
		driver.findElement(By.id("password")).sendKeys("mansoor");
		driver.findElement(By.id("login")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = ("Adactin.com - Search Hotel");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "it is navigated to url");
		test.log(LogStatus.FAIL, "it is not navigated");
		}
	
	@Test
	public void naukri() throws Exception {
		driver=new ChromeDriver();
		Thread.sleep(10000);
		driver.get("https://www.naukri.com/nlogin/login");
		driver.findElement(By.id("usernameField")).sendKeys("siriarikatla123@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Ravi@7995");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		String actualurl = driver.getCurrentUrl();
		String expectedurl = ("https://www.naukri.com/nlogin/login");
		System.out.println("naukri");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS,"it is navigated");
		test.log(LogStatus.FAIL, "fail");
		}
	@AfterClass
	public void close() {
		driver.close();
		report.endTest(test);
		report.flush();
		}
}
