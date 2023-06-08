package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.DashboardView;

public class LoggedInQuestions implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return DashboardView.lblDashboard.isVisibleFor(actor);
    }


}
