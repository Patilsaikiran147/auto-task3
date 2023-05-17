package Automation.Automation_1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='view-all-comp'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='About us']")).click();
		String phandle = driver.getWindowHandle();
		System.out.println(phandle);
		Set<String> handles = driver.getWindowHandles();
		for(String h1 : handles) {
			driver.switchTo().window(h1);
			System.out.println(h1);
			String URL = driver.getCurrentUrl();
			System.out.println(URL);
			if(URL.contains("Sponsored companies")) {
				driver.findElement(By.xpath("//a[text()='Careers']")).click();
				driver.close();
				break;
			}
		}
		driver.switchTo().window(phandle);
//		driver.findElement(By.xpath("//a[text()='Terms & Conditions']")).click();
//		driver.findElement(By.xpath("//a[text()='FeedBack']")).click();
//		String parentHandle;
//		parentHandle = driver.getWindowHandle();
//		Set<String> allhandles = driver.getWindowHandles();
//		for(String h1:allhandles) {
//		driver.switchTo().window(h1);
//		String URL = driver.getCurrentUrl();
//		if (URL.contains("TermsAndConditions"))
//		{
//		driver.findElement(By.xpath("//input[@id='btnOk']")).click();
//		driver.close();
//		break; } }
//		driver.switchTo().window(parentHandle);
	}

}
