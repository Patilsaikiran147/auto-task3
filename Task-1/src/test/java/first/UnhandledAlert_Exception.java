package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnhandledAlert_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
	//	driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//    driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		 WebElement l = driver.findElement(By.id("search-strings"));
	      l.sendKeys("Selenium");
	      driver.navigate().refresh();
	      l.sendKeys("Selenium");
	      driver.quit();
	}

}
