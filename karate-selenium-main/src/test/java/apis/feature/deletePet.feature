@third
Feature: deletePet

  Background:
    * url 'https://petstore.swagger.io/v2'
    * header Accept = 'application/json'

    Scenario: Delete a pet
      * def result = call read('getPet.feature')
      * def id = result.response.id
      Given path '/pet/' + id
      When method delete
      Then status 200
      And print response
      And match responseHeaders['Content-Type'] == [application/json]
      And match +response.message == id
      And match response.type == 'unknown'