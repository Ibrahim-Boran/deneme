Feature: Buy Product

  Background:
    Given User enter the username as "standard_user" and password as "secret_sauce"
    When User click login button

  Scenario: Buying products by filtering

    Given User select "Price (low to high)" dropdown menuu
    And Sauce Labs Backpack Add to Cart
    And Sauce Labs Bolt T-Shirt click for details
    And Sauce Labs Bolt T-Shirt Add to Cart
    When User click your cart
    And Remove Sauce Labs Bolt T-Shirt
    And Click Continue Shopping Button
    And Sauce Labs Onesie T-Shirt Add to Cart
    When User click your cart
    And Click Checkout Button
    And Enter the first name as "" , last name as "" and postal code as "34674"
    And Click Continue Button
    And Fist name error message should be see
    And Enter the first name as "leyla" , last name as "" and postal code as "34674"
    And Click Continue Button
    And Last name error message should be see
    And Click Cancel Button
    And Click Checkout Button
    And Enter the first name as "leyla" , last name as "meram" and postal code as ""
    And Click Continue Button
    And Postal code error message should be see
    And Enter the first name as "" , last name as "" and postal code as ""
    And Enter the first name as "leyla" , last name as "meram" and postal code as "34674"
    And Click Continue Button
    And Click Finish Button
    Then Thank you message should be seen
    And Click Open Menu
    And Click Logout