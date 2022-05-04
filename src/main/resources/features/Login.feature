@smoke
Feature: user should be able to login

  #Test Scenario 1
  Scenario: user login with valid username and password
  Given user go to login page
  When user enter valid username and password
    #Expected Result
  Then user could login successfully
