package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotInteratable {

	public static void main(String[] args) {
		
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
				driver.manage().window().maximize();
      			driver.findElement(By.id("search-strings")).sendKeys("selenium");
//				 WebElement l = driver.findElement(By.id("search-strings"));
//			      l.sendKeys("Selenium");
			      driver.navigate().refresh();
//			      l.sendKeys("Selenium");
//			      driver.quit();
	}

}
