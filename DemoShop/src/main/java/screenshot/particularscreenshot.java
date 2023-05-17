package screenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class particularscreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[3]"));
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

//		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File screenshotAs = element.getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(screenshotAs, new File("D:\\Testing Program\\screenshot\\one1.png"));

//		Screenshot myScreenshot = new AShot().takeScreenshot(driver, element);
//        ImageIO.write(myScreenshot.getImage(),"PNG",new File("D:\\Testing Program\\screenshot\\one.png"));

		driver.quit();

	}

}
