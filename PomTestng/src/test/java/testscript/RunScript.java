package testscript;

import org.testng.annotations.Test;

import pageObj.Demo1;
import utils.DemoUtils;

public class RunScript extends DemoUtils{
					
			@Test
			public void script() {
				Demo1 demo = new Demo1(driver);
				demo.ad_username("saikiran147","Ojas123!");
				demo.bookiter();
				
				}
}
