#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


@sanity @api
Feature: Verify login API Feature for the User
  As a user of APP if i provide valid creds to the login api token should be generated

  
  Scenario: Valid Creds for the USer
    Given The base URL of the Application is "http://139.59.91.96:9000/v1"
    And the header passed is "content-type" "application/json"
    And the user credentials are "iamfd" "password"
    When I make a POST api request to the endpoint "login"
    And the status code needs to be 200
    And the response body should contain message as "Success"
    And a token should be generated
    And response should be json body 
    
    

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
