package first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
	    dr.get("https://adactinhotelapp.com/HotelAppBuild2/");
	    dr.manage().window().maximize();
	    dr.findElement(By.id("username")).sendKeys("mansoor8");
	    dr.findElement(By.id("password")).sendKeys("mansoor");
	    dr.findElement(By.id("login")).click();
	    List<WebElement> elements = dr.findElements(By.xpath("//*[@id=\"hotels\"]"));
         System.out.println(elements.size());
//	    dr.findElement(By.id("location")).click();
//	    for(int i=1;i<array.length;i++)
//	    {
//	    Robot r=new Robot();
//	    r.keyPress(KeyEvent.VK_DOWN);
//	    r.keyRelease(KeyEvent.VK_DOWN);
//	    }
	}

}
