Feature: As a user, I should be able to access to Contacts module.

  Background:
    Given user is on login page



  @us_12
  Scenario Outline: AC#1 - verify users can access to Talks module

    And user provides valid "<username>" and "<password>"
    When user clicks on Contacts module
    Then user verifies the page title is Contents module's title
    Examples:
      | username | password    |
      | User5    | Userpass123 |
      | User35   | Userpass123 |
      | User65   | Userpass123 |
      | User95   | Userpass123 |



  Scenario Outline: AC#2 - verify user can add contacts
    And user provides valid "<username>" and "<password>"
    When user clicks on Contacts module

    And user clicks on New Contact button
    When user fills out the contact info like: Title, Phone, email, address, etc
    Then user verifies the contact name is added to the contact list
    Examples:
      | username | password    |
      | User5    | Userpass123 |
      | User35   | Userpass123 |
      | User65   | Userpass123 |
      | User95   | Userpass123 |
