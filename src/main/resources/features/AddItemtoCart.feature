@smoke
Feature: Add product to shopping cart
  Scenario: Logged user could add different products to Shopping cart
    Given user add mobile to cart then clicks on the product apple macbook
    When user add it to the shopping cart
    Then item is added to the shopping cart and a confirmation message will be shown
