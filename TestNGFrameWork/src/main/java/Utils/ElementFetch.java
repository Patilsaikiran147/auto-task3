package Utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseTest;

public class ElementFetch {
	public WebElement getWebElement(String identifierType, String identifierValue) {
		switch (identifierType) {
		case "xpath":
			return BaseTest.driver.findElement(By.xpath(identifierValue));
		case "id":
			return BaseTest.driver.findElement(By.id(identifierValue));
		case "name":
			return BaseTest.driver.findElement(By.name(identifierValue));
		case "tagName":
			return BaseTest.driver.findElement(By.tagName(identifierValue));
		case "linkTest":
			return BaseTest.driver.findElement(By.linkText(identifierValue));
		case "css":
			return BaseTest.driver.findElement(By.cssSelector(identifierValue));
		case "className":
			return BaseTest.driver.findElement(By.className(identifierValue));

		default:
			return null;

		}
	}
	
	public List<WebElement> getWebElements(String identifierType, String identifierValue) {
		switch (identifierType) {
		case "xpath":
			return BaseTest.driver.findElements(By.xpath(identifierValue));
		case "id":
			return BaseTest.driver.findElements(By.id(identifierValue));
		case "name":
			return BaseTest.driver.findElements(By.name(identifierValue));
		case "tagName":
			return BaseTest.driver.findElements(By.tagName(identifierValue));
		case "linkTest":
			return BaseTest.driver.findElements(By.linkText(identifierValue));
		case "css":
			return BaseTest.driver.findElements(By.cssSelector(identifierValue));
		case "className":
			return BaseTest.driver.findElements(By.className(identifierValue));

		default:
			return null;

		}
	}
}
