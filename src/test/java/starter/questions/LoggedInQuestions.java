package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.DashboardView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoggedInQuestions implements Question<Boolean> {
    public static LoggedInQuestions logged() {
        return new LoggedInQuestions();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(DashboardView.lblDashboard,isVisible()).forNoMoreThan(30).seconds());
        return DashboardView.lblDashboard.isVisibleFor(actor);
    }


}
