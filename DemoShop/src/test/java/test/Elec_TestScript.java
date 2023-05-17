package test;

import org.testng.annotations.Test;

import pages.ElectronicPage;

public class Elec_TestScript extends DemoTest {

	@Test(priority=2)
    public void Demo2() throws InterruptedException
    {
    	ElectronicPage ep = new ElectronicPage(driver);
    	ep.ElectronicIs();
    	ep.selectMobileIs();
    	ep.viewmodeIs();
    	Thread.sleep(2000);
    	ep.selectphoneIs();
    	ep.AddtowishlistIs();
}
}
