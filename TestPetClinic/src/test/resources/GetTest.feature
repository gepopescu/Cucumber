Feature:
  Scenario:  AddNewOwner
    Given I can navigate to petclinic site
    When  I complete the required fields as firstName "Alin",lastName "Ion", address "TestAd",city "city",telephone "073255556565"
    Then  The new owner is displayed

    Scenario: Error message for the telephone field
      Given I can go to home in petclinic site
      When  I complete the required fields as firstName "Alin",lastName "Ion", address "TestAd",city "city",telephone "AAA"
      Then  The message error is displayed