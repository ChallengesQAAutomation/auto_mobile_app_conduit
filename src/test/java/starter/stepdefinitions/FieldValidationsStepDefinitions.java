package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.tasks.LoginFieldEmpty;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static starter.questions.LoggedFieldemptyQuestions.loggedFieldempty;

public class FieldValidationsStepDefinitions {


     @Then("appropriate validation messages should be displayed")
    public void thenAppropriateValidationMessagesShouldBeDisplayed() {
        theActorInTheSpotlight().should(seeThat(loggedFieldempty()));
    }

    @When("they leave the required fields empty for input email address")
    public void theyLeaveTheRequiredFieldsEmptyForInputEmailAddress() {
        theActorInTheSpotlight().attemptsTo(LoginFieldEmpty.withUser("prueba_2@accenture.com.co"));
    }

    @When("they leave the required fields empty for input password")
    public void theyLeaveTheRequiredFieldsEmptyForInputPassword() {
        theActorInTheSpotlight().attemptsTo(LoginFieldEmpty.withPassword("123456a.*09?ad"));
    }
}
