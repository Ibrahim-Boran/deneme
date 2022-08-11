@orchestration
Feature: Test orchestration feature

  Scenario: Run all of the tests in order

    * call read('case1.feature')
    * call read('case2.feature')
    * call read('case3.feature')