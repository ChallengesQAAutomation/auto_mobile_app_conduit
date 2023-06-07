package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IncorrectStepDefinitions {

    @Given("the user is on the login screen")
    public void givenUserIsOnLoginScreen() {
        // Code to navigate to the login screen
    }

    @When("they enter incorrect credentials")
    public void whenTheyEnterIncorrectCredentials() {
        // Code to enter incorrect credentials
    }

    @Then("an error message should be displayed")
    public void thenAnErrorMessageShouldBeDisplayed() {
        // Code to verify error message
    }

}
