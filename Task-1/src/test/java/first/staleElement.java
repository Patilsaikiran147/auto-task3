package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staleElement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		driver.manage().window().maximize();
		 WebElement l= driver.findElement(By.id("search-strings"));
		 l.sendKeys("selenium");
		  	  Thread.sleep(3000);

          driver.navigate().refresh();
          l.sendKeys("Selenium");
	   driver.quit();
	}

}
