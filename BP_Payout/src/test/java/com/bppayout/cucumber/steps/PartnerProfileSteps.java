package com.bppayout.cucumber.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.bppayout.model.partnerProfile.PartnerProfile;
import com.bppayout.services.BpPayoutServices;
import com.bppayout.utils.ApiHelper;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

public class PartnerProfileSteps extends ApiHelper {

	private Response getApiResponse;
	PartnerProfile getPartnerProfile;
	public static String partnerProfileID;

	@When("^User sends a request with \"([^\"]*)\" to get the partner profile$")
	public void user_sends_a_request_with_to_get_the_partner_profile(String partnerProfileID) throws Throwable {
//		List<Map<String, String>> dataList = dt.asMaps(String.class, String.class);
//		partnerProfileID = dataList.get(0).get("PartnerID");
		System.out.println("getApiResponse 2");

		getApiResponse = BpPayoutServices.getPartnerProfile(AccessTokenSteps.accessToken, partnerProfileID);
		getPartnerProfile = BpPayoutServices.gson().fromJson(getApiResponse.body().prettyPrint(), PartnerProfile.class);

		System.out.println("getApiResponse 2: " + getApiResponse);
	}

	@Then("^verify user get (\\d+) status code with Success messagee$")
	public void verify_user_get_status_code_with_Success_message(int statusCode) throws Throwable {
		Assert.assertTrue(getApiResponse.getStatusCode() == statusCode);
		System.out.println("Success status Code: " + statusCode);
		Assert.assertTrue(getPartnerProfile.getSuccess());
	}

	@Then("^verify partner profile data$")
	public void verify_partner_profile_data() throws Throwable {

		Assert.assertNotNull(getPartnerProfile.getData().getProfile().getCity());
		Assert.assertNotNull(getPartnerProfile.getData().getProfile().getEmail());
		Assert.assertNotNull(getPartnerProfile.getData().getProfile().getName());
		Assert.assertNotNull(getPartnerProfile.getData().getProfile().getPhone());
		Assert.assertNotNull(getPartnerProfile.getData().getProfile().getState());
		Assert.assertNotNull(getPartnerProfile.getData().getProfile().getStatus());	
		Assert.assertNotNull(getPartnerProfile.getData().getProfile().getOracleId());
		Assert.assertNotNull(getPartnerProfile.getData().getProfile().getId());
		Assert.assertNotNull(getPartnerProfile.getData().getProfile().getPincode());
		Assert.assertNotNull(getPartnerProfile.getData().getProfile().getUniqueCode());
		
		Assert.assertNotNull(getPartnerProfile.getData().getPan().getDetail());
		
		Assert.assertNotNull(getPartnerProfile.getData().getFinance().getAccountName());
		Assert.assertNotNull(getPartnerProfile.getData().getFinance().getAccountNumber());
		Assert.assertNotNull(getPartnerProfile.getData().getFinance().getIfscCode());
	}

}
