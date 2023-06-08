package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.LoginView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoggedIncorrectQuestions implements Question<Boolean> {
    public static LoggedIncorrectQuestions loggedIncorrect() {
        return new LoggedIncorrectQuestions();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(LoginView.lblIncorrect_popup,isVisible()).forNoMoreThan(30).seconds());
        return LoginView.lblIncorrect_popup.isVisibleFor(actor);
    }


}
