package first;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GetTitle3 {
	 WebDriver driver ;
			@Test()
			@Parameters("URL")
			public void title(String URL) {
			     driver = new ChromeDriver();
			     if(URL.equals("naukri")) {
			     driver.get("https://www.naukri.com/");
			     String title = driver.getTitle();
			     System.out.println(title);
			     driver.close();
			}
			else if(URL.equals("amazon")) {
				driver.get("https://www.amazon.com/");
			     String title1 = driver.getTitle();
			     System.out.println(title1);
			     driver.close();
			}
			else if(URL.equals("ojas")) {
				driver.get("https://www.ojas-it.com/");
			     String title2 = driver.getTitle();
			     System.out.println(title2);
			     driver.close();
			}
			}

			
	        public Object[][] write (String CellValue) throws IOException {
	    	File src = new File("C:\\Users\\sp21440\\Desktop\\excel1.xlsx");
	    	FileInputStream fis = new FileInputStream(src);
	    	XSSFWorkbook wb = new XSSFWorkbook(fis);
	    	XSSFSheet sheet = wb.getSheet("sheet1");
	    	sheet.getRow(1).createCell(1).setCellValue(CellValue);
	    	FileOutputStream fos = new FileOutputStream(src);
	    	wb.write(fos);
	    	wb.close();
	    	fos.close();
			return null;

	    }
}                                        


