Feature: Test orchestration feature

  Scenario: Run all of the tests in order

    * call read('postPet.feature')
    * call read('getPet.feature')
    * call read('deletePet.feature')