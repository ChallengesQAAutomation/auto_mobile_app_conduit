package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.LoginView;


public class LoginFieldEmpty implements Task {

    private final String user;
    private final String password;

    public LoginFieldEmpty(String user, String password) {
        this.user = user;
        this.password = password;
    }


    public static Performable withUser(String user) {
        return new LoginFieldEmpty(user,"");
    }

    public static Performable withPassword(String password) {
        return new LoginFieldEmpty("",password);
    }
       @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(user).into(LoginView.txtEmail));

       actor.attemptsTo(
               Enter.theValue(password).into(LoginView.txtPassword));

       actor.attemptsTo(
                Click.on(LoginView.btnSignin));

    }


}
