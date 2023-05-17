package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

public class ElectronicPage extends BookPage
{
    
	public ElectronicPage(WebDriver driver) {
	super(driver);
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//a[@href=\"/electronics\"])[1]")
	WebElement Electronic;
	
	@FindBy(xpath="(//a[@href=\"/cell-phones\"])[4]")
	WebElement selectMobile;
	
	@FindBy(id="products-viewmode")
	WebElement viewmode;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[1]")
	WebElement selectphone;
	
	@FindBy(id="add-to-wishlist-button-43")
	WebElement Addtowishlist;
	
	
	public void  ElectronicIs() {
		test = report.startTest("Electronic");
		Electronic.click();
	    test.log(LogStatus.PASS,"choose Electronic gadgets ");
	}
	
	public void  selectMobileIs() {
		selectMobile.click();	  
		test.log(LogStatus.PASS,"Selected Mobile");
	}
	
	public void  viewmodeIs() {
		Select sc = new Select(viewmode);
		sc.selectByIndex(1);
	}
	
	public void selectphoneIs() {
		selectphone.click();
	    test.log(LogStatus.PASS,"choosen Phone");
	}
	
	public void  AddtowishlistIs() {
		Addtowishlist.click();
	    test.log(LogStatus.PASS,"Successfully added to Wishlist");
	}
	
	
	



}
