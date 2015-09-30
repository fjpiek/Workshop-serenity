@version:Release-1
@version:Sprint-1.1
Feature: Search by keyword
  In order for buyers to find what they are looking for more efficiently
  As a seller
  I want buyers to be able to search for products by using keywords

   Scenario: Search for products by keyword
    Given I am on the petsplace homepage
    When I search for 'Whiskas'
    Then I should see only products related to 'Whiskas'

  Scenario Outline: Search for many products by keyword
    Given I am on the petsplace homepage
    When I search for '<product>'
    Then I should see a catagory option '<catagory>'
  Examples:
    |product  |catagory         |
    |exo terra|Terraria         |
    |juwel    |Aquaria & meubels|