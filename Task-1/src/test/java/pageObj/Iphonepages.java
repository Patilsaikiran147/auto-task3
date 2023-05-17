package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Iphonepages {
 static WebDriver driver; 

public Iphonepages(WebDriver driver) {
			this.driver=driver;
	}

 
	public	By search = By.xpath("//input[@id='twotabsearchtextbox']");
	public  By product = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span") ;
	public  By price   = By.xpath("//*[@id=\"newAccordionRow\"]/div/div[1]/h5/div[2]/div/span[1]");
	
	public By pop = By.xpath("//button[text()='Yes, Notify me']");
	public By search1 = By.id("suggestionBoxEle");
	public By product1 = By.xpath("//p[text()='Apple iPhone 13 128 GB, Starlight']");
	public By price1 = By.xpath("(//span[text()='64,900.00'])[1]");

public void searchh(String Iphonename) {
	WebElement element = driver.findElement(search);
	element.sendKeys(Iphonename);
	element.sendKeys(Keys.ENTER);
	driver.findElement(product).click();
}
}