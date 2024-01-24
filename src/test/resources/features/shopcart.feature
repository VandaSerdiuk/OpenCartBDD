Feature: Products checking in Shopping Cart

  I have selected products and want to check my shopping cart

  Background:
    Given I am on the Phones and PDAs page
    When I click on Add to Cart button all product

    Scenario: In Shop Cart I update Poduct1
      Given I click on Shop Cart option
      When I click on Update button
      Then My Product need be Successful in Shop cart

      Scenario: Successful transition to the cart using the cart link
        Given I click on Shop Cart option
        When I select cart link
        Then I should be able to successfully navigate to the shopping cart page

      Scenario: In Shop Cart I delete Product3
        Given I click on Shop Cart option
        When I click Delete button
        Then I should see just 2 product in page


