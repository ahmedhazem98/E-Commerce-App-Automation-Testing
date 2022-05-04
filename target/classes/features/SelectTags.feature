@smoke
  Feature: Select Tags
    Scenario: Logged user could select different tags
      When  user navigates to Apparel & shoes
      Then user navigates to awesome tag
      And user could find all products under the awesome tag
