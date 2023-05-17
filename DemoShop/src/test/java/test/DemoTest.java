package test;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BookPage;
import pages.ElectronicPage;

public class DemoTest extends BaseTest
{

    @Test(priority=1)
    public void DemoExample() throws InterruptedException
    {
    	ElectronicPage bp = new ElectronicPage(driver);
    	bp.Bookfunctionality();
    	bp.SelectbySortby();
    	bp.SelectbyDisplayby();
    	bp.SelectbyViewAs();
    	bp.FilterpriceIs();
    	Thread.sleep(2000);
    	bp.ImageIs();
    	Thread.sleep(3000);
    	bp.quantityIs("2");
    	Thread.sleep(2000);
    	bp.addtowishlistIs();
    	Thread.sleep(2000);
    	bp.topWishlistIs();
    	Thread.sleep(3000);
    	bp.validationcheckboxIs("Health Book");
    	Thread.sleep(3000);
    	bp.addTocartbuttonIs();
    	bp.coupontextboxIs("HELLO123");
    	bp.applycouponIs();
    	String couponmsg = bp.getmessagecouponIs();
    	System.out.println("coupon msg:"+couponmsg);
    	bp.giftcardIs("lOVE");
    	bp.addgiftcardIs();
    	bp.choosecountryIs("India");
    	bp.postalcodeIs("500072");
    	bp.estimationIs();
    	String shippingmessage = bp.shippingmessageIs();
    	System.out.println("shippingmessage:"+shippingmessage);
    	bp.checkboxagreeconditionIs();
    	bp.checkoutbuttonIs();

  }
}
