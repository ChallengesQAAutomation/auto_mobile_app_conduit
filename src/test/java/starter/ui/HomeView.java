package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeView {

    public static Target btnLogin = Target
            .the(" Button Login")
            .located(By.xpath("//android.widget.Button[@content-desc=\"Login, tab, 2 of 2\"]/android.widget.ImageView"));




}
