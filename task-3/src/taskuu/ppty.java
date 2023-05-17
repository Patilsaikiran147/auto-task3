package taskuu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ppty {
	static WebDriver driver;
	       @Test
			public void hyd() throws Exception {
				String browser= base.getlaunch("browser");
				String url = base.getlaunch("url");
				if(browser.equals("chrome")) {
					driver = new ChromeDriver();
					driver.get(url);
				}
				else if(browser.equals("edge")) {
					driver = new EdgeDriver();
					driver.get(url);
				}
			
	       }
}

