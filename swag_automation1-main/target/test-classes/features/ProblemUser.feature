Feature: Problem User

  Background:
    Given User enter the username as "problem_user" and password as "secret_sauce"
    When User click login button

  Scenario: Buying products by problem user

    Given User select "Price (low to high)" dropdown menuu
    And Check for not correct sort
    And Sauce Labs Bolt T-Shirt Add to Cart
    And Sauce Labs Bolt T-Shirt click for details
    And Match Product Name and Detail Page Name
    When User click your cart
    And Click Checkout Button
    And Enter the first name as "leyla" , last name as "meram" and postal code as "34674"
    And Last name error message should be see
    And Click Open Menu
    And Click About Button
    Then The page cannot be reached information
