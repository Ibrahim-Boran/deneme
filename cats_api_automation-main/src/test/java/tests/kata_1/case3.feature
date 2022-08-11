@wip
Feature: case3

  Background: Define Url
    * url someUrlBase
    * header x-api-key = 'DEMO-API-KEY'
    * header Authorization = '5924fda8-0a4d-4da2-9416-b5a491f6901b'

  Scenario: Call post request favorite_id and delete
    * def result = call read('case2.feature')
    * def favoriteid = result.favorite_id
    Given path favoriteid
    When method delete
    Then status 200
    And print response
    Then match response.message == 'SUCCESS'




