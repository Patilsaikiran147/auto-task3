package utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoUtils {
	public static WebDriver driver ;
	static ChromeOptions cp;
	
	@BeforeTest()
	public  void open() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
	}
	
	@BeforeMethod
	public void launch() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void screenshot() throws IOException {
	   TakesScreenshot ts = (TakesScreenshot)driver;
	         File source = ts.getScreenshotAs(OutputType.FILE);
	         File des = new File("./screenshots/screenshot2.png");
	         Files.copy(source, des);
	}
	@BeforeMethod
	public void screenshot1() throws IOException {
	   TakesScreenshot ts = (TakesScreenshot)driver;
	         File source = ts.getScreenshotAs(OutputType.FILE);
	         File des = new File("./screenshots/screenshot1.png");
	         Files.copy(source, des);
	}
	@AfterTest
	public void close() {
		driver.close();
	}
	public static void ScrollDown()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)");
	}
	
	public static void robo() throws AWTException, InterruptedException {
		Robot r = new Robot();
		r.mouseWheel(750);
		Thread.sleep(2000);
	}
	public static void Windowhan() {
		Set<String> handles = driver.getWindowHandles();
		Object[] array = handles.toArray();
		driver.switchTo().window(array[1].toString());
	}
	public static void Windowhan1() {
		Set<String> handles = driver.getWindowHandles();
		Object[] array = handles.toArray();
		driver.switchTo().window(array[2].toString());
	}
	public static void notification() {
	    cp = new ChromeOptions();
		cp.addArguments("--disable-notifications");
		driver = new ChromeDriver(cp);
	}
	public static void alert() {
		driver.switchTo().alert().accept();
	}
}
