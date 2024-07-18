package co.com.orange.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

        public static final Target INP_USERNAME = Target.the("Input username").located(By.name("username"));
        public static final Target INP_PASSWORD = Target.the("Input password").located(By.name("password"));
        public static final Target BTN_LOGIN = Target.the("Button login").located(By.xpath("//button[contains(@class, 'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button')]"));


}
