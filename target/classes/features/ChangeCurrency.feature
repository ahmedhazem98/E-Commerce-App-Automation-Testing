@smoke
  Feature: change the currency
    Scenario: Logged User could switch between currencies US-Euro
      When user selects currency drop list and chooses Euro
      Then the price of the product appears in Euro