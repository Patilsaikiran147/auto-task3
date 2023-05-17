package com.bppayout.utils;

import io.restassured.specification.RequestSpecification;
import net.thucydides.core.pages.PageObject;
import io.restassured.RestAssured;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.typesafe.config.Config;
import static net.serenitybdd.rest.SerenityRest.given;
import java.net.URI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ApiHelper extends PageObject {
	
	 public Logger log = LoggerFactory.getLogger(ApiHelper.class);
	 private static Config conf = ConfigLoader.load();
	 private static String bpPayoutApiUrl = conf.getString("apiUrl");
	 public static Gson gson;
	 
	 protected static RequestSpecification getBpPayoutApiUrl(String adminToken) {
	        RestAssured.baseURI= URI.create(bpPayoutApiUrl).toString();
	       // SerenityRest.rest().basePath(bpPayoutApiUrl);
	        return given()
	                .header("Accept", "application/json, text/plain, */*")
	                .header("Content-Type", "application/json")
	                .header("Authorization", "Bearer " + adminToken);
	    }
	 
	  // Specify all one time default Gson config
	    public static Gson gson() {
	        GsonBuilder gsonBuilder = new GsonBuilder();
	        gson = gson(gsonBuilder);
	        return gson;
	    }

	 //Custom Gson config to override Default Gson  configuration
	    public static Gson gson(GsonBuilder gsonBuilder) {
	        gson = gsonBuilder.create();
	        return gson;
	    }

	    protected static RequestSpecification getUrlWithoutToken() {
	        RestAssured.baseURI = URI.create(bpPayoutApiUrl).toString();
	        return given()
	                .header("Accept", "application/json")
	                .header("Content-Type", "application/json;charset=UTF-8");
	    }

}
