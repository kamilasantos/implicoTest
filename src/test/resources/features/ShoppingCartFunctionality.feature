Feature: Shopping Cart Functionality

  Scenario: Add item to the shopping cart
    Given I am on the Swag Labs website
    When I log in as a standard user
    And I add an item to the cart
    Then the item should be added successfully to the cart

  Scenario: Update quantity of an item in the cart
    Given I am on the Swag Labs website
    When I log in as a standard user
    And I add an item to the cart
    And I update the quantity of the added item
    Then the quantity should be updated successfully in the cart

  Scenario: Remove item in the cart
    Given I am on the Swag Labs website
    When I log in as a standard user
    And I add an item to the cart
    When I remove the item from the cart
    Then the item should not be visible in the cart

