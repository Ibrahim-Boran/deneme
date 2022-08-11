Feature: Youtube

  Background:
    Given I initialize chrome driver
    When I go to "https://www.youtube.com/" url
    Then I see home page

  @Deneme
  Scenario: YouTubeTest
    When I focus Search element
    When I enter "Tarkan" text to Search text area
    Then I click "ENTER" keyboard button
    Then I click element: Music index: 1
    Then I click element: Explore index: 1
    Then I click element: Home index: 1
    When I focus Search element
    When I enter " Kış Güneşi" text to Search text area
    Then I click "ENTER" keyboard button
    And I wait for 5 seconds
