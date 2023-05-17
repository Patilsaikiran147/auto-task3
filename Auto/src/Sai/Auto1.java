package Sai;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.get("https://secure.indeed.com/");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			String handle = driver.getWindowHandle();
			System.out.println(handle);
			driver.findElement(By.id("login-google-button")).click();
			driver.findElement(By.xpath("(//a[text()='Terms'])[1]")).click();
			Set<String> str = driver.getWindowHandles();
			System.out.println(str);
			Object[] ob = str.toArray();
			driver.switchTo().window(ob[1].toString());
			WebElement element = driver.findElement(By.id("headingSubtext"));
			System.out.println(element.getText());
			
	}

}
