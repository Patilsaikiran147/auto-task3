package qaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reportsssss {
	public static ExtentReports report;
	public static ExtentTest test;
	public static WebDriver driver;

	 @BeforeClass
	 public void starttest() {
	 report = new ExtentReports(System.getProperty("D:\\Testing Program\\TestNGFrameWork\\Reports") + "test.html");
	 test = report.startTest("started");
	 }


	 @Test(priority=1)
	 public void login() {
	 driver = new ChromeDriver();
	 driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
	 driver.findElement(By.name("username")).sendKeys("mansoor8");
	 driver.findElement(By.id("password")).sendKeys("mansoor");
	 driver.findElement(By.id("login")).click();
	 test.log(LogStatus.PASS, "login success");

	 }
	 
	 @AfterClass
	 public void endtest() {
     driver.quit();
	 report.endTest(test);
	 report.flush();
	 }
}
