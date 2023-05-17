package first;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class soniyaExcel {
	public static WebDriver driver;
	public static XSSFSheet sheet;
//	public static XSSFSheet sheet1;
	public static XSSFWorkbook wb;
	public static FileInputStream fis;
	public static File src;
	static WebElement message;
	
	public void screenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("D:\\Testing Program\\Task-1\\Screenshot\\shot.png");
		Files.copy(from, to);
		
	}

	public void launchapp() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sp21440\\Downloads\\chromedriver_win32 (1).exe");
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
	}

	public void login(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("login_button")).click();
	
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}

	public int getrowcount(String xlpath, int sheetid) throws IOException {
		File src = new File(xlpath);
		fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(sheetid);
	//	sheet1 = wb.createSheet("sheet3");
		int rc = sheet.getLastRowNum();
		return rc;
	}

	public String getdata(int rowindex, int colindex) {
		String data = sheet.getRow(rowindex).getCell(colindex).getStringCellValue();
		return data;
	}

	public static void main(String[] args) throws InterruptedException, Exception {
		soniyaExcel obj = new soniyaExcel();
		int rowcount = obj.getrowcount("C:\\Users\\sp21440\\Desktop\\pass_fail.xlsx", 1);
			for (int i = 0; i <= rowcount; i++) {
				String un = obj.getdata(i, 0);
				String pwd = obj.getdata(i, 1);
				
				
				System.out.println(un + "   " + pwd);
				obj.launchapp();
				obj.login(un, pwd);
				obj.screenShot();
				Thread.sleep(1000);
				
				CellStyle style = wb.createCellStyle();
				style.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
				style.setFillPattern(FillPatternType.FINE_DOTS);

				CellStyle style1 = wb.createCellStyle();
				style1.setFillBackgroundColor(IndexedColors.RED.getIndex());
				style1.setFillPattern(FillPatternType.FINE_DOTS);
				
					XSSFCell cell = sheet.getRow(i).createCell(2);
				//	XSSFCell cell1 = sheet1.getRow(1).createCell(2);
					if (driver.getCurrentUrl().equals("https://adactinhotelapp.com/HotelAppBuild2/SearchHotel.php")) {
						cell.setCellValue("Pass");
						cell.setCellStyle(style);
						System.out.println("success");
					} 
					else {
						cell.setCellValue("Fail");
						cell.setCellStyle(style1);
						System.out.println("Failure");

					}
					driver.close();
				}
			
		FileOutputStream fos = new FileOutputStream("C:\\Users\\sp21440\\Desktop\\pass_fail.xlsx");
		wb.write(fos);
		wb.close();
		
	}
}
