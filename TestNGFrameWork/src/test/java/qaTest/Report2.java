package qaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class Report2 extends Reportsssss{
	
	@Test(priority=2)
	public void location() {
		Select obj=new Select(driver.findElement(By.id("location"))) ;
		obj.selectByIndex(2);
		 test.log(LogStatus.PASS, "location");

		Select obj1=new Select(driver.findElement(By.id("hotels")));
		obj1.selectByIndex(1);
		 test.log(LogStatus.PASS, "hotels");

		Select obj2=new Select(driver.findElement(By.id("room_type")));
		obj2.selectByIndex(3);
		 test.log(LogStatus.PASS, "room type");

		Select obj3=new Select(driver.findElement(By.id("room_nos")));
		obj3.selectByIndex(1);
		 test.log(LogStatus.PASS, "room Nos");

		
	}

}
