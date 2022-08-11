Feature: Login

  Scenario: Success Login verification

    Given User enter the username as "standard_user" and password as "secret_sauce"
    When User click login button
    Then Products page should open


  Scenario: Fail Login for Empty Username

    Given User enter the username as "" and password as "secret_sauce"
    When User click login button
    Then Empty username error message should be see

  Scenario: Fail Login for Empty Password

    Given User enter the username as "standard_user" and password as ""
    When User click login button
    Then Empty password error message should be see

  Scenario: Fail Login for Wrong User Information

    Given User enter the username as "leylame" and password as "123"
    When User click login button
    Then Wrong user error message should be see

  Scenario: Fail Login for Locked Out User Information

    Given User enter the username as "locked_out_user" and password as "secret_sauce"
    When User click login button
    Then Error message should be see for locked user

