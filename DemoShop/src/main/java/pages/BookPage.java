package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import test.BaseTest;

public abstract class BookPage extends BaseTest{
	
	public WebDriver driver;
	
	public BookPage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//ul[@class=\"top-menu\"]//a[@href=\"/books\"]")
	WebElement ClickBook;
	
	@FindBy(id="products-orderby")
	WebElement sortBy;
	
	@FindBy(id="products-pagesize")
	WebElement pageBy;
	
	@FindBy(id="products-viewmode")
	WebElement ViewAs;
	
	@FindBy(xpath="//a[text()='    Under ']")
	WebElement Filterbyprice;
	
	@FindBy(xpath="//h2[@class=\"product-title\"]//a[text()='Health Book']")
	WebElement image;
	
	@FindBy(id="addtocart_22_EnteredQuantity")
	WebElement quantity;
	
	@FindBy(id="add-to-wishlist-button-22")
	WebElement addToWishlist;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	WebElement Topwishlist;
	
	@FindBy(xpath="//input[@type=\"checkbox\" and @name=\"addtocart\"]")
	List<WebElement> countofChecbox;
		
	@FindBy(xpath="//input[@type=\"submit\" and @name=\"addtocartbutton\"]")
	WebElement addTocartbutton;
	
	@FindBy(xpath="//input[@name=\"discountcouponcode\" and @class=\"discount-coupon-code\"]")
	WebElement coupontextbox;
	
	@FindBy(xpath="//input[@value=\"Apply coupon\"]")
	WebElement applycoupon;
	
	@FindBy(className="message")
	WebElement getmessagecoupon;
	
	@FindBy(xpath="//input[@type=\"text\" and @name=\"giftcardcouponcode\"]")
	WebElement giftcard;
	
	@FindBy(xpath="//input[@type=\"submit\" and @name=\"applygiftcardcouponcode\"]")
	WebElement addgiftcard;
	
	@FindBy(id="CountryId")
	WebElement choosecountry;
	
	@FindBy(id="ZipPostalCode")
	WebElement postalcode;
	
	@FindBy(name="estimateshipping")
	WebElement estimation;
	
	@FindBy(xpath="//ul[@class=\"shipping-results\"]")
	WebElement shippingmessage;
	
	@FindBy(xpath="//input[@type=\"checkbox\" and @name=\"termsofservice\"]")
	WebElement checkboxagreecondition;
	
	@FindBy(xpath="//button[@type=\"submit\" and @name=\"checkout\"]")
	WebElement checkoutbutton;
	
//=================================================================================================================================	
	
	public void Bookfunctionality() {
		ClickBook.click();
	 	test = report.startTest("Books");
	    test.log(LogStatus.PASS,"choose Book");

	}
		
	public void SelectbySortby() throws InterruptedException {
		Select sc = new Select(sortBy);
		sc.selectByIndex(1);
		Thread.sleep(2000);
		sc.selectByIndex(2);
		Thread.sleep(2000);
		sc.selectByIndex(3);
		Thread.sleep(2000);
		sc.selectByIndex(4);
		Thread.sleep(2000);
		sc.selectByVisibleText("Price: Low to High");
	}
	
	public void SelectbyDisplayby() throws InterruptedException {
		Select sc = new Select(pageBy);
		sc.selectByIndex(2);
		Thread.sleep(2000);
		sc.selectByIndex(1);
		Thread.sleep(2000);
		sc.selectByIndex(0);
	}
	
	public void SelectbyViewAs() throws InterruptedException {
		Select sc = new Select(ViewAs);
		sc.selectByIndex(1);
		Thread.sleep(2000);
		sc.selectByIndex(0);
	}
	
	public void  FilterpriceIs() {
		Filterbyprice.click();
	}
	
	public void  ImageIs() {
		image.click();
	    test.log(LogStatus.PASS,"select Book");
	}
	
	public void  quantityIs(String number) {
		quantity.clear();
		quantity.sendKeys(number);
	}
	
	public void  addtowishlistIs() {
		addToWishlist.click();
	}
	
	public void  topWishlistIs() {
		Topwishlist.click();
	    test.log(LogStatus.PASS,"clicked onTopwishlist");
	}
	
	public void  validationcheckboxIs(String s) {
		 int checkboxrow = countofChecbox.size();
		 System.out.println("Number of list of wishlist: ="+checkboxrow);
			for(int i=1;i<=checkboxrow;i++) {
				String value=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/table/tbody/tr["+i+"]/td[4]/a")).getText();
				if(value.equalsIgnoreCase(s)) {
				driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/table/tbody/tr["+i+"]/td[2]/input")).click();
		}
	    test.log(LogStatus.PASS,"added to wishlist");
	}
	}
	
	public void  addTocartbuttonIs() {
		addTocartbutton.click();
	    test.log(LogStatus.PASS,"added to cart");
	}
	
	public void  coupontextboxIs(String coupon) {
		coupontextbox.sendKeys(coupon);
	}
	
	public void  applycouponIs() {
		applycoupon.click();
	}
	
	public String getmessagecouponIs() {
		return getmessagecoupon.getText();
	}
	
	public void  giftcardIs(String code) {
		giftcard.sendKeys(code);
	}
	
	public void  addgiftcardIs() {
		addgiftcard.click();
	}
	
	public void  choosecountryIs(String countryName) {
		Select sc = new Select(choosecountry);
		sc.selectByVisibleText(countryName);
	    test.log(LogStatus.PASS,"selected country");
	}
	
	public void  postalcodeIs(String code1) {
		postalcode.sendKeys(code1);
	}
	
	public void  estimationIs() {
		estimation.click();
	}
	
	public String  shippingmessageIs() {
	    test.log(LogStatus.PASS,"Delivered msg");
		return shippingmessage.getText();
	}
	
	public void  checkboxagreeconditionIs() {
		checkboxagreecondition.click();
	}
	
	public void  checkoutbuttonIs() {
		checkoutbutton.click();
	    test.log(LogStatus.PASS,"done with checkout");

	}
	
	
	
	
}