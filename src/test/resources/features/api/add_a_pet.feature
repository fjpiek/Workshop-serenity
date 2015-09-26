
Feature: Add a pet
  In order to sell a pet
  As a store owner
  I want to add a new pet to the catalog

  Scenario: Add a dog
    Given I have the following pet
    | name | status    |
    | Fido | available |
    When I add the pet to the store
    Then the pet should be available in the store
