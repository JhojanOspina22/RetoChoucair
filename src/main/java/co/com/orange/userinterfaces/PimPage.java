package co.com.orange.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PimPage {
        public static final Target BTN_ADD= Target.the("Button add").located(By.xpath("//button[@class= 'oxd-button oxd-button--medium oxd-button--secondary']"));
        public static final Target CHK_LOGIN_DETAILS = Target.the("Check LOGIN DETAILS").located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span"));
        public static final Target INP_FIRSTNAME = Target.the("firstname Field").located(By.name("firstName"));
        public static final Target INP_LASTNAME = Target.the("lastname Field").located(By.name("lastName"));

        public static final Target INP_USERNAME = Target.the("Username Field").located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input"));
        public static final Target INP_PASSWORD= Target.the("Password Field").located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input"));
        public static final Target INP_CONFIRM_PASSWORD= Target.the("Confirm  Field").located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input"));
        public static final Target BTN_SAVE = Target.the("Register Button").located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
        public static final Target TXT_ERROR_USERNAME_REGISTERED = Target.the("Massage Username Registered Already").located(By.xpath("//label[contains(@class, 'center block smollMargin')]"));

}
