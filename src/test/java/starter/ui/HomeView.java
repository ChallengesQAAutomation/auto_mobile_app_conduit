package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeView {

    public static Target btnLogin = Target
            .the("")
            .located(By.xpath("//android.widget.Button[@content-desc=\"Login, tab, 2 of 2\"]/android.widget.ImageView"));

    public static Target btnHome = Target.the("destino")
            .located(By.xpath("///android.widget.Button[@content-desc=\"Home, tab, 1 of 2\"]/android.widget.ImageView"));



}
