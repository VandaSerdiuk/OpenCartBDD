Feature: Product selection in OpenCart

  Since I'm already logged in, I need to select a product

  Background:
    Given I am on the OpenCart home page

  Scenario: Selection in the Components column Product Monitors
    Given I click on the Components button and a window pops up
    When Select the line Monitors and push in button
    Then Successful transition to the page Monitors

    Scenario: Testing the Components column Product Monitors
      Given I click on the Components button and a window pops up
      When Select the line Monitors and push in button
      Then Select the List button and push

      Scenario: Testing the Components column Product of all components in alphabetical order
        Given I click on the Components button and a window pops up
        When Select the line Show All Components and push in button

        Scenario: Testing the Components column Phones & PDAs
          Given I click on the Components button and a window pops up
          When Select the line Monitors and push in button
          Then I select Phones & PDAs
          And Successful transition to the page Phones & PDAs

          Scenario: Testing the column Phones & PDAs
            Given I click on the Components button and a window pops up
            When Select the line Show All Components and push in button
            Then I select Phones & PDAs
            And Testing options Sort By when select Prise Low High

            Scenario: Testing Add to Cart button
              Given I select line Phones and PDAs
              When I click on Add to Cart button
              Then My product should be successfully added to the Shopping Cart









