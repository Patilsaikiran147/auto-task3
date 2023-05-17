package Atul;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.stqatools.com");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 

		Robot robot = new Robot();
		   // driver.get("https://stqatools.com/");
	        // Scroll Down using Robot class
	        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	        Thread.sleep(2000);
	        // Scroll Up using Robot class
	        robot.keyPress(KeyEvent.VK_PAGE_UP);
	        robot.keyRelease(KeyEvent.VK_PAGE_UP);
//		Thread.sleep(1000);
//		
//		robot.mouseWheel(10);
//		
//		// Get Screen Size
//		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
//	//	java.awt.Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
//		System.out.println(size);
//		// Capture ScreenShot
//		BufferedImage img = robot.createScreenCapture(new Rectangle(size));
//		// Store image into file
//		File path = new File("D://profile12.jpg");
//		// Write image path
//		ImageIO.write(img, "JPG", path);
		
		
	}

}
