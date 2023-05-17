package qaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class report3 extends Report2 {
	
	@Test(priority=3)
	public void re() throws InterruptedException {
		
	driver.findElement(By.id("datepick_in")).clear();
	driver.findElement(By.name("datepick_in")).sendKeys("24/05/2023");
	 test.log(LogStatus.PASS, "dateIn");

	driver.findElement(By.id("datepick_out")).clear();
	driver.findElement(By.id("datepick_out")).sendKeys("27/05/2023");
	 test.log(LogStatus.PASS, "dateout");

	//Thread.sleep(2000);
	Select obj4 =new Select(driver.findElement(By.name("adult_room")));
	obj4.selectByIndex(1);
	 test.log(LogStatus.PASS, "adult room");

	Thread.sleep(3000);
	Select obj5= new Select (driver.findElement(By.name("child_room")));
	obj5.selectByIndex(1);
	 test.log(LogStatus.PASS, "child room");

	}
}
