package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FieldValidationsStepDefinitions {

    @Given("the user is on the login screen")
    public void givenUserIsOnLoginScreen() {
        // Code to navigate to the login screen
    }

    @When("they leave the required fields empty")
    public void whenTheyLeaveRequiredFieldsEmpty() {
        // Code to leave required fields empty
    }

    @Then("appropriate validation messages should be displayed")
    public void thenAppropriateValidationMessagesShouldBeDisplayed() {
        // Code to verify validation messages
    }

}