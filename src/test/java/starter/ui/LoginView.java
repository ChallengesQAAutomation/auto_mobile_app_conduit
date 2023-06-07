package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginView {



    public static Target txtEmail = Target.the("Precio de la reserva")
            .located(AppiumBy.id("//android.widget.EditText[@text ='Ex: email@dominio.com']"));


    public static Target txtPassword = Target.the("seleccionar la reserva")
            .located(AppiumBy.id("//android.widget.EditText[@text ='Password']"));


    public static Target btnSignin = Target.the("seleccionar la reserva")
            .located(AppiumBy.id("//android.widget.TextView[@text='Sign In']"));





}
