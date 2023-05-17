package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {

	public static void main(String[] args) {
			WebDriver d = new ChromeDriver();
			d.get("www.globalsqa.com");
			d.manage().window().maximize();
	}

}
