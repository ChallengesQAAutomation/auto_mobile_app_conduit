package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.questions.LoggedInQuestions;
import starter.tasks.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

public class SuccessLoginStepDefinitions {


    @Given("the user is on the login screen")
    public void givenUserIsOnLoginScreen() {
        // Code to navigate to the login screen
    }

    @When("they enter valid credentials")
    public void whenTheyEnterValidCredentials() {
        // Code to enter valid credentials
    }

    @Then("they should be able to log in successfully")
    public void thenShouldBeAbleToLoginSuccessfully() {
        // Code to verify successful login
    }

}