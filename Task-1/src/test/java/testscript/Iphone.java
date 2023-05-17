package testscript;

import java.awt.AWTException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resuable.IphoneUtils;
import pageObj.Iphonepages;

public class Iphone extends IphoneUtils{
	@Test
	public void iphoneUser()  {
			Iphonepages ip = new Iphonepages(driver);
			open();
			ip.searchh("Iphone 13");
//			Windowhan();
//			String text = driver.findElement(ip.price).getText();
//			System.out.println(text);
//			open1();
//			driver.findElement(ip.pop).click();
//		//	notification();
//			WebElement element1 = driver.findElement(ip.search1);
//			element1.sendKeys("Iphone-13");
//			element1.sendKeys(Keys.ENTER);
//			ActionClass();
//			Thread.sleep(4000);
//			//robo();
//			driver.findElement(ip.product1).click();
//			Windowhan1();
//			String text1 = driver.findElement(ip.price1).getText();
//			System.out.println(text1);
//			
//			//close();
			
						}
}

