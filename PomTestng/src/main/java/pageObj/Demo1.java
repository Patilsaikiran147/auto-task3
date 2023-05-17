package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Demo1 {
	
	 static WebDriver driver; 
	 public Demo1(WebDriver driver) {
			this.driver=driver;
     	}	

	By username     = By.id("username");
	By password     = By.id("password");
	By login_btn    = By.id("login");
	By Bookiternary = By.linkText("Booked Itinerary");
	
	
	public void ad_username(String name,String pwd) {
		driver.findElement(username).sendKeys(name);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(login_btn).click();
	}
	
	public void bookiter() {
		driver.findElement(Bookiternary).click();
	}
	
	
	
}

