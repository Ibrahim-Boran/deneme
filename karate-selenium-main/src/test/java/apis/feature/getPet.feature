@second
Feature: getPet

  Background:
    * url 'https://petstore.swagger.io/v2'
    * header Accept = 'application/json'

  Scenario: Select a pet
    * def result = call read('postPet.feature')
    * def id = result.response.id
    And print id
    Given path '/pet/'+ id
    When method get
    Then status 200
    And match response == '#notnull'
    And match response == result.response
    And match responseHeaders['Content-Type'] == [application/json]
    And match responseHeaders['Date'] == '#notnull'
    * def print = response