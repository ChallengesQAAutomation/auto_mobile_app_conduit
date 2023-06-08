package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginView {



    public static Target txtEmail = Target.the("Input email")
            .located(AppiumBy.xpath("//android.widget.EditText[@text ='Ex: email@dominio.com']"));


    public static Target txtPassword = Target.the("Input password")
            .located(AppiumBy.xpath("//android.widget.EditText[@text ='Password']"));


    public static Target btnSignin = Target.the("Button Sign In")
            .located(AppiumBy.xpath("//android.widget.TextView[@text='Sign In']"));

    public static Target lblisRequerid = Target.the("Label is required")
            .located(AppiumBy.xpath("//android.widget.TextView[@text='This field is required']"));

    public static Target lblIncorrect_popup = Target.the("Label incorrect popup")
            .located(AppiumBy.xpath("//android.widget.TextView[@text='Oops, something went wrong, verify your connection and try again, please']"));





}
