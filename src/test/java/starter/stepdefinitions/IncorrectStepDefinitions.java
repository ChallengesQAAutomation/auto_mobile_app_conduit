package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.tasks.Login;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static starter.questions.LoggedIncorrectQuestions.loggedIncorrect;

public class IncorrectStepDefinitions {

    @When("they enter incorrect credentials")
    public void whenTheyEnterIncorrectCredentials() {
        theActorInTheSpotlight().attemptsTo(
                Login.withCredentials("prueba@accenture.com","1234567")
        );
    }

    @Then("an error message should be displayed")
    public void thenAnErrorMessageShouldBeDisplayed() {

        theActorInTheSpotlight().should(seeThat(loggedIncorrect()));

    }

}
