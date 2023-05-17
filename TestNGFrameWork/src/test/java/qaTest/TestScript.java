package qaTest;

import org.testng.annotations.Test;

import Base.BaseTest;
import PageEvent.LoginPageEvents;
import Utils.ElementFetch;
import Utils.Suitelistener;

public class TestScript extends Suitelistener  {
	LoginPageEvents logineve = new LoginPageEvents();
	ElementFetch ele = new ElementFetch();
	
			@Test
			public void samplemethodLogin() {
				BaseTest bs= new BaseTest();
				logineve.verifylogin();
				logineve.EnterCredential();
			}
}
