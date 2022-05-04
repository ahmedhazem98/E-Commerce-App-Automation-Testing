@smoke
  Feature: User Registration
    Scenario: user could register with valid data
      Given user clicks on register button
      When enter Gender & First Name & Last Name & Email & Password
      Then registration is completed and success massage appears

