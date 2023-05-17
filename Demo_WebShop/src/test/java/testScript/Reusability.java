package testScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reusability {

	public WebDriver driver;
	
	@BeforeTest
	public void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");

	}
	
	@BeforeMethod
	public void login() {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("saikiranpatil@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Ojas@123");
	}
	
	@AfterMethod
	public void logout() {
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	
	@AfterSuite
	public void close() {
		driver.close();
	}
}
