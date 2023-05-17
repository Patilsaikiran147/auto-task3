package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerDemo.class)

public class Demo {
		static WebDriver driver;
		@Test
		public void India() {
			driver = new ChromeDriver();
			driver.get("https://www.naukri.com/");
			driver.manage().window().maximize();
		}
}
