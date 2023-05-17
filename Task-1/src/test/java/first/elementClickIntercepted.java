package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementClickIntercepted {

	    public static void main(String[] args) throws Exception {
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        String Parent=driver.getWindowHandle();
	        System.out.println(Parent);
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        js.executeScript("window.scrollBy(0,250)", "");
	        driver.findElement(By.id("newTabsBtn")).click();
	        }
	}


