@smoke
Feature: Reset Password

  Scenario: user could be able to recover password by clicking on forgot password

    Given user click on forgot password
    When enter his or her email
    Then user receives a link and recover password
