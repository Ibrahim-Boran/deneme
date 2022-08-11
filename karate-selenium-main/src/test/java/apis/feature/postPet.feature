@first
Feature: postPet

  Background:
    * url 'https://petstore.swagger.io/v2'
    * header Accept = 'application/json'

    Scenario: Create a pet
      * def pet =
      """
      {
      "category": {
        "id": 0,
        "name": "Pets"
      },
      "name": "Scout",
      "photoUrls": [
          "scout.png"
      ],
      "tags": [
      {
        "id": 0,
        "name": "pet-dog"
      }
      ],
      "status": "available"
      }
      """
      Given path '/pet'
      And request pet
      When method post
      Then status 200
      Then match response == '#notnull'
      And print response
      #  * def id1 = response.id
      And print response.id
      And match response.id == '#notnull'
      And match response.name == pet.name
      And match responseHeaders['Date'] == '#notnull'
      And match responseHeaders['Content-Type'] == [application/json]



