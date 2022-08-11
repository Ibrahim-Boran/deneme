Feature: case2

  Background: Define Url
    * url someUrlBase
    * header x-api-key = 'DEMO-API-KEY'
    * header Authorization = '5924fda8-0a4d-4da2-9416-b5a491f6901b'

  Scenario: Call get request image_id and sub_id
    * def jsonBody = read('classpath:data/cats.json')
    * def result = call read('case1.feature')
    And jsonBody.image_id = result.imageid
    And jsonBody.sub_id = result.subid
    * def favorite_id = result.response[2].id
    And print jsonBody
    And print favorite_id
    And request jsonBody
    When method POST
    And status 400
    Then match response.message == 'DUPLICATE_FAVOURITE - favourites are unique for account + image_id + sub_id'

