package mobile_testing1;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BasicAppium {
		@Test
		public void Basic() throws MalformedURLException
		{
			UiAutomator2Options opt = new UiAutomator2Options();
			opt.setDeviceName("kiru");
			opt.setApp("D:\\Testing Program\\mobile_testing1\\General-Store (1).apk");
			AndroidDriver driver = new AndroidDriver(new URL("http:127.0.0.1:4723"), opt);
		}
}
