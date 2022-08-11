Feature: FooterBrands

  Scenario: Verify the Brands Link

    Given User navigate to homepage
    And User login email as "xxx" and password as "xxx"
    When Write all the links at the footer to the text file
    And User click Brands Link
    Then User should see Brands link inside the text file