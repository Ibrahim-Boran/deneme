@first
Feature: case1

  Background: Define Url
    * url someUrlBase
    * header x-api-key = 'DEMO-API-KEY'
    * header Authorization = '5924fda8-0a4d-4da2-9416-b5a491f6901b'

  Scenario: List favourites
    When method GET
    And status 200
    * def subid = response[2].sub_id
    * def imageid = response[2].image_id
    Then print response
    And print subid
    And print imageid





