Feature: E-commerce

  Background:
    Given I initialize chrome driver
    When I go to "http://www.hepsiburada.com" url
    Then I see home page

  @Denemee
  Scenario: 1 - Add product to cart with user login
    When I focus sign in title element
    When I click element: login button index: 1
    Then I see login page

    When I enter "" text to email address bar text area
    Then I enter "" text to password bar text area

    When I click element: submit login button index: 1
    Then I see home page
    And I wait my account title element 3 seconds

    When I enter "xiaomi note 10" text to search input box text area
    Then I click "ENTER" keyboard button
    And I see search results page

    When I focus product results button element
    Then I click element: product results button index: 1
    And I wait for 2 seconds

    When I click "PAGE_DOWN" keyboard button
    Then I wait all sellers button element 3 seconds

    When I click element: all sellers button index: 1
    Then I wait add to cart button element 3 seconds

    When I click element: add to cart button index: 1
    Then I wait continue to cart button element 3 seconds

    When I click element: continue to cart button index: 1
    Then I wait for 4 seconds
    And I see search results page

    When I click element: add to cart button index: 4
    Then I wait continue to cart button element 3 seconds

    When I click element: continue to cart button index: 1
    Then I wait for 4 seconds
    And I see search results page

    When I click "PAGE_UP" keyboard button
    Then I focus my cart button element

    When I click element: my cart button index: 1
    Then I wait skip button element 3 seconds

    When I click element: skip button index: 2
    Then I wait for 2 seconds
    And I wait complete the shopping button element 3 seconds


