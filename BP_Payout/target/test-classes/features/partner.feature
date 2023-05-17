Feature: Test the Partner list and agent List

  @smoke
  Scenario: Check if the partners list can be fetched by user
    Given User login with "alekhya.ampally@delhivery.com" to get the OktaToken
    When User sends a GET request to the list endpoint
    Then verify user get 200 status code with Success message
    And verify "partner" rate list data


  Scenario Outline: Check if the partner profile data can be fetched by user
    Given User login with "alekhya.ampally@delhivery.com" to get the OktaToken
    When User sends a request with "<PartnerID>" to get the partner profile
    Then verify user get 200 status code with Success messagee
    And verify partner profile data

    Examples: 
      | PartnerID |
      |     11640 |
      |     11911 |

  Scenario Outline: Get rate card list- Post invalid profile id data as parameters
    Given User login with "alekhya.ampally@delhivery.com" to get the OktaToken
    #When User sets data for "<profileID>" to get the rate card list data
    #And User hit the url to get rate card list data
    #Then Verify user "<status_code>", "<error_msg>" status code and error message to after hitting the rate card list url
#
    #Examples: 
      #| profileID | status_code | error_msg                              |  
      #| TV        |         400 | market should be min 2 characters long |  
