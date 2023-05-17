package qaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "https://demo.guru99.com/test/social-icon.html";
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);
		driver.get(baseUrl);
		String expectedTooltip = "Google+";
		WebElement googly = driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div/a[2]"));
		      String actualtext = googly.getAttribute("title");
		      System.out.println(actualtext);
		      if(expectedTooltip.equals(actualtext)) {
		    	  System.out.println("passed");
		      }
	}

}
//