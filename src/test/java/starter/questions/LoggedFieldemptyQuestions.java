package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.LoginView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoggedFieldemptyQuestions implements Question<Boolean> {
    public static LoggedFieldemptyQuestions loggedFieldempty() {
        return new LoggedFieldemptyQuestions();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(LoginView.lblisRequerid,isVisible()).forNoMoreThan(30).seconds());
        return LoginView.lblisRequerid.isVisibleFor(actor);
    }


}
