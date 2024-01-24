Feature:  Register Functionality for OpenCart E-commerce Website

  As a new user on the store website
  I want to be able to register my account

  Background:
    Given I am on the OpenCart Register Account page
    When I click MyAccount button
    Then I click Register button

  Scenario: Successful registration with correct data
    Given I have entered a valid name, last name, email, telephone, password, password confirm
    When I click on the Privacy Policy button and Continue button
    Then My profile should be created successfully

  Scenario: Successful registration with correct data with Newsletter button
    Given I have entered a valid name, last name, email, telephone, password, password confirm
    And I click Newsletter button
    When I click on the Privacy Policy button and Continue button
    Then My profile should be created successfully

    Scenario Outline: Error when trying to register with an existing account
      Given I have entered a valid name, last name, email, telephone, password, password confirm
      When I click on the Privacy Policy button and Continue button
      Then I should see an error message "<error_message>"
      Examples:
        | error_message                                  |
        | Warning: E-Mail Address is already registered! |

      Scenario Outline: Error when trying to register without Privacy Policy button
        Given I have entered a valid name, last name, email, telephone, password, password confirm
        When I click on the Continue button
        Then I should see error message "<error_message2>"
        Examples:
          | error_message2                                 |
          | Warning: You must agree to the Privacy Policy! |

        Scenario Outline: Error when trying to register with an incorrect password confirmation
          Given I have entered a valid name, last name, email, telephone, password and incorrect password confirm
          When I click on the Privacy Policy button and Continue button
          Then I should see error password message "<error_message3>"
          Examples:
            | error_message3                                 |
            | Password confirmation does not match password! |










