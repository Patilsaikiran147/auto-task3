package com.bppayout.pages;

import com.bppayout.model.AccessToken.OktaTokenStorage;
import com.bppayout.utils.ApiHelper;
import com.bppayout.utils.ConfigLoader;
import com.typesafe.config.Config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HomePage extends ApiHelper {
	 
	  private static final Logger log = LoggerFactory.getLogger(HomePage.class);
	    private static Config conf = ConfigLoader.load();
	    public static Boolean reviewerLogin = false;
	    public static  OktaTokenStorage oktaToken = new OktaTokenStorage();

	    @FindBy(id="username")
	    private WebElement username;
	    @FindBy(id="password")
	    private WebElement password;
	    @FindBy(id="kc-login")
	    private WebElement signInBtn;
	   
	    @FindBy(xpath="//b[text() = 'Logout']/..")
	    private WebElement logOut;

	    public void navigateToUrl() {
	    	System.out.println("geturl......");
	        getDriver().manage().window().maximize();
	        openAt(conf.getString("App_URL"));
	        System.out.println("open url......");
	    }

	    public String signInAndGetOktaTokenStorageForDevTestIntEnv(String user) {
	    	System.out.println("Enter to get okta ");
	        if (ConfigLoader.environment.equals("dev") || ConfigLoader.environment.equals("test")) {
	            withTimeoutOf(30, TimeUnit.SECONDS).waitFor(username).sendKeys("barry.styles@dan-demo.com");
	            waitFor(password).withTimeoutOf(30, TimeUnit.SECONDS).sendKeys("hgKT70!&vd");
	            waitFor(signInBtn).withTimeoutOf(30, TimeUnit.SECONDS).click();
	            waitABit(20000);

	        } else  {
	            if (user.equals("alekhya.ampally@delhivery.com")) {
	            	withTimeoutOf(30, TimeUnit.SECONDS).waitFor(username).sendKeys("alekhya.ampally@delhivery.com");
	 	            waitFor(password).withTimeoutOf(30, TimeUnit.SECONDS).sendKeys("Reeha@2129");
	 	            waitFor(signInBtn).withTimeoutOf(30, TimeUnit.SECONDS).click();
	 	            waitABit(20000);
	            }
	        }
	        System.out.println("okta token: end");
	        return (String) evaluateJavascript(String.format("return window.localStorage.getItem('%s');", "BP_Payout_UMA_IDT"));
	      
	    }

	    public void closeBrowsersAllTab() {
	        getDriver().quit();
	    }

}
