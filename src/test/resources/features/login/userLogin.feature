Feature: Login User
  Scenario: Successful Login
    Given the user is on the login screen
    When they enter valid credentials
    Then they should be able to log in successfully

  Scenario: Field Validations email address
    Given the user is on the login screen
    When they leave the required fields empty for input email address
    Then appropriate validation messages should be displayed

  Scenario: Field Validations password
    Given the user is on the login screen
    When they leave the required fields empty for input password
    Then appropriate validation messages should be displayed

  Scenario: Incorrect Login
    Given the user is on the login screen
    When they enter incorrect credentials
    Then an error message should be displayed