package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getttt {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				ChromeOptions cp = new ChromeOptions();
				cp.addArguments("--Incognito");
				WebDriver dr = new ChromeDriver(cp);
				dr.get("https://www.softwaretestingmaterial.com/");
				Thread.sleep(2000);
		//		dr.navigate().to("https://adactinhotelapp.com/HotelAppBuild2/");
//				dr.navigate().back();
				dr.get("https://adactinhotelapp.com/HotelAppBuild2/");
	}
}
