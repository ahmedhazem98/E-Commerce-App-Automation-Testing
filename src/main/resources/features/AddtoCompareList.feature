@smoke
  Feature: Add products to compare list
    Scenario: SC11- Logged user could add different products to compare list
    Given user clicks on the product apple macbook
      When user added it to compare list
      Then user can add this item to the compare list and a confirmation message will be shown