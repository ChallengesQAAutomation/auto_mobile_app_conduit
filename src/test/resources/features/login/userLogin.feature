Feature: Flujo de alojamiento

  Scenario: Successful Login
    Given the user is on the login screen
    When they enter valid credentials
    Then they should be able to log in successfully

  Scenario: Field Validations
    Given the user is on the login screen
    When they leave the required fields empty
    Then appropriate validation messages should be displayed

  Scenario: Incorrect Login
    Given the user is on the login screen
    When they enter incorrect credentials
    Then an error message should be displayed