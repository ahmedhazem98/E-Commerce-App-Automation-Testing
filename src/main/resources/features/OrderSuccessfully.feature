@smoke
Feature: order product successfully

  Scenario: Create successful Order
    Given user add apple macbook to shopping cart
    When user go to shopping cart
    And update the shopping cart
    And should continue with order
    And enters the shipping address and payment
    Then user could order his product successfully