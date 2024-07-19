package co.com.orange.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PimPage {
        public static final Target BTN_ADD = Target.the("Button add").located(By.xpath("//button[@class= 'oxd-button oxd-button--medium oxd-button--secondary']"));
        public static final Target CHK_LOGIN_DETAILS = Target.the("Check LOGIN DETAILS").located(By.xpath("//span[@class= 'oxd-switch-input oxd-switch-input--active --label-right']"));
        public static final Target INP_FIRSTNAME = Target.the("firstname Field").located(By.name("firstName"));
        public static final Target INP_LASTNAME = Target.the("lastname Field").located(By.name("lastName"));

        public static final Target INP_USERNAME = Target.the("Username Field").located(By.xpath("(//input[contains(@class,'oxd-input oxd-input')])[6]"));
        public static final Target INP_PASSWORD = Target.the("Password Field").located(By.xpath("(//input[contains(@class,'oxd-input oxd-input')])[7]"));
        public static final Target INP_CONFIRM_PASSWORD = Target.the("Confirm  Field").located(By.xpath("(//input[contains(@class,'oxd-input oxd-input')])[8]"));
        public static final Target INP_EMPLOYEE_ID = Target.the("input employee ID").located(By.xpath("(//input[contains(@class,'oxd-input oxd-input')])[5]"));
        public static final Target INP_EMPLOYEE_ID_2 = Target.the("input employee ID").located(By.xpath("(//input[contains(@class,'oxd-input oxd-input')])[2]"));

        public static final Target BTN_SAVE = Target.the("Save Button").located(By.xpath("//button[@class= 'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
        public static final Target BTN_SEARCH = Target.the("Search Button").located(By.xpath("//button[@class= 'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
        public static final Target TXT_EMPLOYEE_ID = Target.the("text employee ID").located(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']/div[2]"));
        public static final Target TXT_EMPLOYEE_FIRSTNAME = Target.the("text employee firstname").located(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']/div[3]"));
        public static final Target TXT_EMPLOYEE_LASTNAME = Target.the("text employee lastname").located(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']/div[4]"));
        public static final Target TXT_EMPLOYEE_DATA = Target.the("text employee name").located(By.xpath("//h6[@class='oxd-text oxd-text--h6 --strong']"));
        public static final Target BTN_EMPLOYEE_EDIT = Target.the("Button employee edit").located(By.xpath("//i[@class='oxd-icon bi-pencil-fill']"));


}
