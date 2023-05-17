package Resuable;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;



public class IphoneUtils  {
	public static WebDriver driver ;
	static	ChromeOptions cp;
	@BeforeTest
	public static void open() {
	    driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public static void open1() {
		driver.get("https://www.reliancedigital.in/");
		driver.manage().window().maximize();
	}
	public static void ActionClass()
	{
	 Actions a=new Actions(driver);
	 WebElement findElement = driver.findElement(By.xpath("//*[@id=\"pl\"]/div[2]/ul/li[2]/div/a/div[2]/button[2]"));
	 a.moveToElement(findElement).perform();
	}
	public static void ScrollDown()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)");
	}
	public static void robo() throws AWTException {
		Robot r = new Robot();
		r.mouseWheel(350);
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
		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--disable-notifications");
		driver = new ChromeDriver(cp);
	}
	public static void alert() {
		driver.switchTo().alert().accept();
	}
	@AfterTest
		public static void close(){
			driver.quit();
		}
		}

