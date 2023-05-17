package PageEvent;


import org.testng.Assert;

import PageObj.LoginPageObjects;
import Utils.ElementFetch;

public class LoginPageEvents {
		ElementFetch ele = new ElementFetch();
		public void verifylogin() {
			Assert.assertTrue(ele.getWebElements("id",LoginPageObjects.login).size()>0,"element not found");
		}
		public void EnterCredential() {
			ele.getWebElement("id",LoginPageObjects.username).sendKeys("saikiran147");
			ele.getWebElement("id",LoginPageObjects.password).sendKeys("Ojas123!");
			ele.getWebElement("id",LoginPageObjects.login).click();
		}
}
