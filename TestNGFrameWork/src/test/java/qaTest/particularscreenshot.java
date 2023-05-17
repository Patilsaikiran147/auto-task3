package qaTest;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class particularscreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"-tvmG4Lmvl3JRo9C3_1xnA\"]/div[2]/div[1]/div[2]/a/div[1]/img"));

		// Take a full-page screenshot
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		// Use the BufferedImage class to crop the screenshot to the area of the element
		BufferedImage fullImg = ImageIO.read(screenshot);
		Point point = element.getLocation();
		int width = element.getSize().getWidth();
		int height = element.getSize().getHeight();
		BufferedImage elementImg = fullImg.getSubimage(point.getX(), point.getY(), width, height);

		// Save the element screenshot to a file
		ImageIO.write(elementImg, "png", new File("D:\\Testing Program\\screenshot\\one.png"));

		driver.quit();
	}

}
