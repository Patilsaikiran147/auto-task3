package Atul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class adactinpage {
		static WebDriver driver;
		public void launchapp() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		}
	
		public void login(String username, String password) {
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.className("login_button")).click();

}
		public void logout() {
			driver.findElement(By.partialLinkText("Logout")).click();
			driver.close();
}
}