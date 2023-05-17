package Atul;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingData {

	public static void main(String[] args) throws Throwable {
	
		 WebDriver driver;
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 System.out.println("JDBC loaded");
		 Thread.sleep(2000); 
		 Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/kiru ", "root", "root");
		 Statement smt=conn.createStatement(); 
		 ResultSet rst=smt.executeQuery("select * from login");
		 while(rst.next()) {
			 String Un=rst.getString(1);
			 String Pwd=rst.getString(2); 
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
			 driver.findElement(By.id("username")).sendKeys(Un);
			 driver.findElement(By.id("password")).sendKeys(Pwd);
			 driver.findElement(By.id("login")).click();
		 }
	}

}
