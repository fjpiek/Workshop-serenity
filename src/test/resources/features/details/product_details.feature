Feature: Product details
  In order for buyers to to make the right decision
  As a seller
  I want buyers to be able to see the detail information of a product.


  Scenario: Display product details from the search result
    Given I have searched for 'Jewel'
    When I select item 1
    Then I should see product description on the details page
    And  I should see product price on the details page




