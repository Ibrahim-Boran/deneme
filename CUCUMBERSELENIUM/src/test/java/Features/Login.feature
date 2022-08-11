Feature: Login

  Scenario: Hepsiburada Login

   Given I navigate to the login page
    And I enter the username as "admin" and password as "adminpassword"
    And I click login button
    Then I should see the new page