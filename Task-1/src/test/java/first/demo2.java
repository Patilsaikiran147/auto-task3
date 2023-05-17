package first;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo2 {
	WebDriver driver;

	HSSFWorkbook workbook;
	HSSFSheet sheet;
	HSSFCell cell;
	
	@BeforeTest
	public void TestSetup(){
	driver = new ChromeDriver();
	 driver.get("http://www.gcrit.com/build3/login.php");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void ReadData() throws IOException, Exception{ 
	File src=new File("D:\\Book3.xls");   
    FileInputStream fis = new FileInputStream(src);
	workbook = new HSSFWorkbook(fis);
	sheet= workbook.getSheet("Sheet1");                   
	for(int i=1; i<=sheet.getLastRowNum(); i++){
	System.out.println("Reached loop starts");	
	cell  = sheet.getRow(i).getCell(0);
	cell.setCellType(CellType.STRING);
	driver.findElement(By.xpath("//input[@name='email_address']")).sendKeys(cell.getStringCellValue());
	cell = sheet.getRow(i).getCell(1);
	cell.setCellType(CellType.STRING);
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(cell.getStringCellValue());
	  Thread.sleep(500);
	  cell = sheet.getRow(i).getCell(2);
	  cell.setCellType(CellType.STRING);
	  driver.findElement(By.xpath("//*[@id='tdb5']/span[2]")).click();
	  String ExpectedResult=cell.getStringCellValue();
	  String ActualResult=driver.getCurrentUrl();
	 sheet.getRow(i).createCell(3).setCellValue(ActualResult);
	FileOutputStream fos=new FileOutputStream(src);
	String status=ValidationOperation.verify(ExpectedResult, ActualResult);
	sheet.getRow(i).createCell(4).setCellValue(status);
	workbook.write(fos);
	if(driver.getCurrentUrl().equals("http://www.gcrit.com/build3/index.php")){
		System.out.println("passed  ");   
	} else {
		System.out.println("failed  ");
	}
	
	WebElement link_Home =driver.findElement(By.xpath("//span[text()='Log Off']"));
	  Actions action2 = new Actions(driver);
	 action2.moveToElement(link_Home).build().perform();
	 Thread.sleep(500);
     driver.findElement(By.xpath("//span[text()='Log Off']")).click();
     
	driver.navigate().to("http://www.gcrit.com/build3/login.php");
	System.out.println("navigate");
	  Thread.sleep(500);
	fos.close();
	}

	}

	public static class ValidationOperation {

		public static String verify(String ExpectedResult,String ActualResult) {
			
			try
			{
				Assert.assertEquals(ExpectedResult, ActualResult);
				return "pass";
			}
			catch(AssertionError rv)
			{
				return "fail";
				
				
			}
			

	}	}
}
