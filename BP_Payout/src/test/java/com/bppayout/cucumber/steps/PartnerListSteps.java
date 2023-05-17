package com.bppayout.cucumber.steps;

import org.junit.Assert;

import com.bppayout.model.partnerList.PartnerList;
import com.bppayout.services.BpPayoutServices;
import com.bppayout.utils.ApiHelper;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Steps;

public class PartnerListSteps extends ApiHelper {
	private Response getApiResponse;
	PartnerList getPartnerList;

	@Steps
	BpPayoutServices steps;

	@When("^User sends a GET request to the list endpoint$")
	public void user_sends_a_GET_request_to_the_list_endpoint() throws Throwable {
		System.out.println("getApiResponse 1");

		getApiResponse = BpPayoutServices.getPartnerList(AccessTokenSteps.accessToken);
		getPartnerList = BpPayoutServices.gson().fromJson(getApiResponse.body().prettyPrint(), PartnerList.class);

		System.out.println("getApiResponse 2: " + getApiResponse);

	}

	@Then("^verify user get (\\d+) status code with Success message$")
	public void verify_user_get_status_code_with_Success_message(int statusCode) throws Throwable {
		Assert.assertTrue(getApiResponse.getStatusCode() == statusCode);
		System.out.println("Success status Code: " + statusCode);
		Assert.assertTrue(getPartnerList.getSuccess());
	}

	@Then("^verify \"([^\"]*)\" rate list data$")
	public void verify_rate_list_data(String arg1) throws Throwable {
		System.out.println("--------------" + getPartnerList.getData().get(0).getName());
		System.out.println("--------------" + getPartnerList.getData().get(0).getCity());
		System.out.println("List: = " + getPartnerList.getData().size());
		// List partnerList = (List) getPartnerList.getData();

		int listSize = getPartnerList.getData().size();
		for (int i = 0; i < listSize; i++) {

			Assert.assertNotNull(getPartnerList.getData().get(i).getEmail());
			System.out.println("getEmail = " + i + " = " + getPartnerList.getData().get(i).getEmail());
			Assert.assertNotNull(getPartnerList.getData().get(i).getName());
			System.out.println("getName = " + i + " = " + getPartnerList.getData().get(i).getName());
			Assert.assertNotNull(getPartnerList.getData().get(i).getPhone());
			System.out.println("getPhone = " + i + " = " + getPartnerList.getData().get(i).getPhone());
			Assert.assertNotNull(getPartnerList.getData().get(i).getPincode());
			System.out.println("getPincode = " + i + " = " + getPartnerList.getData().get(i).getPincode());
			Assert.assertNotNull(getPartnerList.getData().get(i).getStatus());
			System.out.println("getStatus = " + i + " = " + getPartnerList.getData().get(i).getStatus());
			Assert.assertNotNull(getPartnerList.getData().get(i).getId());
			System.out.println("getId = " + i + " = " + getPartnerList.getData().get(i).getId());
			Assert.assertNotNull(getPartnerList.getData().get(i).getUniqueCode());
			System.out.println("getUniqueCode = " + i + " = " + getPartnerList.getData().get(i).getUniqueCode());
			// Assert.assertNotNull(getPartnerList.getData().get(i).getCity());
			// System.out.println("get city = " + i + " =
			// "+getPartnerList.getData().get(i).getCity());
		}
	}

}
