package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardView {



    public static Target lblDashboard = Target.the("Button Sign In")
            .located(AppiumBy.xpath("//android.widget.TextView[@text='No articles are here... yet']"));



}
