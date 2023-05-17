package com.bppayout.services;

import com.bppayout.model.post.PostRequestRateCalModel;
import com.bppayout.utils.ApiHelper;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class BpPayoutServices extends ApiHelper {
	
	public static Response getPartnerList(String oktaAccessToken) {
		System.out.println("okta token: = " + oktaAccessToken);
		 return getBpPayoutApiUrl(oktaAccessToken).log().all().get("/bp_profile/list");
	}
	
	public static Response getPartnerProfile(String oktaAccessToken, String partnerID) {
		System.out.println("okta token: = " + oktaAccessToken);
		 return getBpPayoutApiUrl(oktaAccessToken).log().all().get("bp_profile/" + partnerID);
	}
	
//	@Step("Get partner information with ID: {0}")
//	public  void getPartnerProfile(int partnerId) {
//		SerenityRest.rest().given().when().delete("/" + partnerId);
//	}
	
	  public static Response updateRates(String oktaAccessToken, PostRequestRateCalModel postRateRequestModel) {
	        return getBpPayoutApiUrl(oktaAccessToken).body(gson().toJson(postRateRequestModel)).log().all().put("/rates/");
	    }

}
