Feature: Login Page Feature

  Scenario: Login with valid credentials
    Given user is in the login page
    When user fill up login details
      | username       | password       |
      | valid_username | valid_password |
    And user clicks login button
    Then user should login successfully