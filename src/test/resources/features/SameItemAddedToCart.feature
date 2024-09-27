Feature: Same item is added to cart validation

  Scenario: Verify the same item is added to cart And remove the item
    Given user open website
    Then verify home page is displayed
    When user clicks on mens section
    Then verify user is on mens section
    And clicks on TShirt category
    Then verify user is on mensTShirt page
    And user clicks on first tShirt
    When user selects xs size
    And clicks on add to cart button
    Then verify item is added to cart
    When user clicks on cart icon
    Then verify the same item is added to cart
    And same price is displayed
    When user click on delete button
    Then verify item is removed from the cart