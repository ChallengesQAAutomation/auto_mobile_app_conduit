Feature: Login user
  Scenario: Successful Login
    Given the user is on the login screen
    When they enter valid credentials
    Then they should be able to log in successfully

