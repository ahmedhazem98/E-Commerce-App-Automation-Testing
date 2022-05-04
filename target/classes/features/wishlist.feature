@smoke
Feature: user could add products to wishlist

  Background: user login with valid credentials
    Given user go to login page
    When user enter valid username and password
    #Expected Result
    Then user could login successfully
  Scenario: logged user add products to wishlist successfully
    Given user add product to wishlist
    When user go to wishlist
    And count number of quanataties