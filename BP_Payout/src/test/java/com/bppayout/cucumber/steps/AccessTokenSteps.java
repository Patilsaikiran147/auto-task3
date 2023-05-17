package com.bppayout.cucumber.steps;

import com.bppayout.pages.HomePage;
import com.bppayout.utils.ApiHelper;
import cucumber.api.java.en.Given;

public class AccessTokenSteps extends ApiHelper {

	 public static String accessToken, reviewerAccessToken;
	    public static boolean loginFlag = false, reviewerLoginFlag = false;
	    HomePage homepage;
	    
	    private String expireToken =
	            "eyJraWQiOiJPdWhuUFBaUm5ueWQ5VHNZX2NPUm9na202dGxJOWswMXpFQk5tc0JPUnZzIiwiYWxnIjoiUlMyNTYifQ.eyJ2ZXIiOjEsImp0aSI6IkFULlh2elNPUWRBcWpENzBFd3JQU2hqQWlGRGtnZ0lsTFhsdHhoaVZPb21jZU0iLCJpc3MiOiJodHRwczovL2RlbnRzdWFlZ2lzLXRlc3Qub2t0YS1lbWVhLmNvbS9vYXV0aDIvYXVzMzBrNWJ1c2lMdUQ2NHMwaTciLCJhdWQiOiJhcGk6Ly9Vc2VyLU1hbmFnZW1lbnQiLCJpYXQiOjE1OTk0ODQ4NDMsImV4cCI6MTU5OTQ4ODQ0MywiY2lkIjoiMG9hM2hmYWs5YlFBNWlneDkwaTciLCJ1aWQiOiIwMHU0ZWo3Z3ZyWkp2T3ZwdjBpNyIsInNjcCI6WyJlbWFpbCIsInByb2ZpbGUiLCJvcGVuaWQiXSwic3ViIjoiQ2xhcmEuV2F0c29uQGRhbi1kZW1vLmNvbSIsIkFjY2Vzc19SaWdodHMiOlsiV0ZNOio6KjpWSVo6YyxyLHUsZCIsIldGTTpBX0hNOio6Q0FSOmMscix1LGQiLCJXRk06QV9ITTpHQjpJUFM6YyxyLHUsZCIsIkNXSDoqOio6VklaOmMscix1LGQiLCJDV0g6QV9ITTpHQjpJUFM6YyxyLHUsZCIsIkNXSDpBX0hNOio6Q0FSOmMscix1LGQiXSwiVGltZW5vdyI6IjIwMjAtMDktMDdUMTM6MjA6NDMuODM4WiJ9.V832eaTyPpLC_zHgL83st_woMiFWOxKipKav7AKWlljrzgZxR3n85FHSO0VbLBP3qN872T-Ngutl36H2jci4zTsdjVKsFnce71YUmPbzUTtEE-fpTqSf7arDYTTLDyiTcXjxfqqcDDn24dW9UvyMXwSWS6TldZsHK-f8GYhVRhBzH_a3n37rCWf2Bc51ev5MBjzd05TDieFowbf7RemA29ocs8PQQ49ds9AS8JNrLVmS4EMB8JWOupWdQYj-OOtLzcIAu1hiRFvTfTFMNAsg3zJzwlYXS8uMe6xtzQe2fwW2g4mjDTdTky_ej9BLVfKwXtjdwKKpKQq1R81MIVO5ZA";
	    private String invalidToken =
	            "JPdWhuUFBaUm5ueWQ5VHNZX2NPUm9na202dGxJOWswMXpFQk5tc0JPUnZzIiwiYWxnIjoiUlMyNTYifQ.eyJ2ZXIiOjEsImp0aSI6IkFULlh2elNPUWRBcWpENzBFd3JQU2hqQWlGRGtnZ0lsTFhsdHhoaVZPb21jZU0iLCJpc3MiOiJodHRwczovL2RlbnRzdWFlZ2lzLXRlc3Qub2t0YS1lbWVhLmNvbS9vYXV0aDIvYXVzMzBrNWJ1c2lMdUQ2NHMwaTciLCJhdWQiOiJhcGk6Ly9Vc2VyLU1hbmFnZW1lbnQiLCJpYXQiOjE1OTk0ODQ4NDMsImV4cCI6MTU5OTQ4ODQ0MywiY2lkIjoiMG9hM2hmYWs5YlFBNWlneDkwaTciLCJ1aWQiOiIwMHU0ZWo3Z3ZyWkp2T3ZwdjBpNyIsInNjcCI6WyJlbWFpbCIsInByb2ZpbGUiLCJvcGVuaWQiXSwic3ViIjoiQ2xhcmEuV2F0c29uQGRhbi1kZW1vLmNvbSIsIkFjY2Vzc19SaWdodHMiOlsiV0ZNOio6KjpWSVo6YyxyLHUsZCIsIldGTTpBX0hNOio6Q0FSOmMscix1LGQiLCJXRk06QV9ITTpHQjpJUFM6YyxyLHUsZCIsIkNXSDoqOio6VklaOmMscix1LGQiLCJDV0g6QV9ITTpHQjpJUFM6YyxyLHUsZCIsIkNXSDpBX0hNOio6Q0FSOmMscix1LGQiXSwiVGltZW5vdyI6IjIwMjAtMDktMDdUMTM6MjA6NDMuODM4WiJ9.V832eaTyPpLC_zHgL83st_woMiFWOxKipKav7AKWlljrzgZxR3n85FHSO0VbLBP3qN872T-Ngutl36H2jci4zTsdjVKsFnce71YUmPbzUTtEE-fpTqSf7arDYTTLDyiTcXjxfqqcDDn24dW9UvyMXwSWS6TldZsHK-f8GYhVRhBzH_a3n37rCWf2Bc51ev5MBjzd05TDieFowbf7RemA29ocs8PQQ49ds9AS8JNrLVmS4EMB8JWOupWdQYj-OOtLzcIAu1hiRFvTfTFMNAsg3zJzwlYXS8uMe6xtzQe2fwW2g4mjDTdTky_ej9BLVfKwXtjdwKKpKQq1R81MIVO5ZA";
	    public static String tokenOfInvalidType = null;
	    
	    	
	    	@Given("^User login with \"([^\"]*)\" to get the OktaToken$")
	    	public void user_login_with_to_get_the_OktaToken(String userName) throws Exception {
	    		  homepage.navigateToUrl();
	  	        if (accessToken == null) {

	  	            String oktaTokenStorageFromBrowser = homepage.signInAndGetOktaTokenStorageForDevTestIntEnv(userName);
	  	            accessToken = oktaTokenStorageFromBrowser;
	  	            System.out.println("token" + oktaTokenStorageFromBrowser);
//	  	            OktaTokenStorage oktaTokenStorageForInt = gson().fromJson(oktaTokenStorageFromBrowser, OktaTokenStorage.class);
//	  	            accessToken = oktaTokenStorageForInt.getAccessToken().getAccessToken();
//	  	            System.out.println("Okata token:" +accessToken);
	  	        }
	    	}

}
