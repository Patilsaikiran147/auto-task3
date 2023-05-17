package first;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textt {
 public static	WebDriver dr;
	public static void launch(String s) throws Exception {
	    dr = new ChromeDriver();
		dr.get("https://www.ojas-it.com/");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Robot r = new Robot();
		r.mouseWheel(100);
		String text = dr.findElement(By.xpath("/html/body/div[3]/div/h4[2]")).getText();
		System.out.println(text);
		if(text.contains(s)) {
			System.out.println(s);
		}
		else
			System.out.println("it is not matching");
	}


	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the text: ");
		String s = sc.next();
		launch(s);
		dr.close();
	}

}