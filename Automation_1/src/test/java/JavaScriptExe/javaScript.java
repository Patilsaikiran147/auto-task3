package JavaScriptExe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javaScript {

	@Test
	public void hell() {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();				
        driver.get("http://demo.guru99.com/V4/");					
        WebElement button =driver.findElement(By.name("btnLogin"));			
        driver.findElement(By.name("uid")).sendKeys("mngr34926");					
        driver.findElement(By.name("password")).sendKeys("amUpenu");					
        JavascriptExecutor js = (JavascriptExecutor)driver;				
        js.executeScript("arguments[0].click();", button);		
        js.executeScript("alert('Welcome to Guru99');");

	}}
