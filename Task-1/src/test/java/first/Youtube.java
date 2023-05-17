package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Youtube {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//a[@class='gb_d']")).click();
	driver.switchTo().frame("app");
	driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/c-wiz/div/div/ul[1]/li[4]")).click();

	}


}
