package qaTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class business {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				driver.get("https://magento.softwaretestingboard.com/women.html");
				driver.manage().window().maximize();		
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				Thread.sleep(2000);
				WebElement ele = driver.findElement(By.xpath("//nav[@class='navigation']//ul//li/following-sibling::li//span[text()='Women']"));
				Actions act = new Actions(driver);
				act.moveToElement(ele).build().perform();
				Thread.sleep(3000);
				WebElement ele1 = driver.findElement(By.xpath("//span[text()='Tops']"));
				act.moveToElement(ele1).build().perform();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@role=\"menu\"]//span[text()='Tees']")).click();
				driver.findElement(By.xpath("//li[@class=\"item product product-item\"]//img[@alt=\"Desiree Fitness Tee\"]")).click();
				driver.findElement(By.xpath("//div[@id=\"option-label-size-143-item-168\"]")).click();
				driver.findElement(By.xpath("//div[@id=\"option-label-color-93-item-60\"]")).click();
				driver.findElement(By.xpath("//button[@id=\"product-addtocart-button\"]")).click();
				driver.close();
	}

}
