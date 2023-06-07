package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.LoginView;

import java.util.Arrays;

import static starter.ui.SearchView.*;

public class Login implements Task {

    private final String user, password;

    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }
    public static Performable withCredentials(String user, String password) {
        return new Login(user,password);
    }
       @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                NavigateTo.login());
        actor.attemptsTo(
                Enter.theValue(user).into(LoginView.txtEmail));
        actor.attemptsTo(
                Enter.theValue(password).into(LoginView.txtPassword));
       actor.attemptsTo(
                Click.on(LoginView.btnSignin));

    }


}
