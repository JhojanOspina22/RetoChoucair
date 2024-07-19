package co.com.orange.tasks;

import co.com.orange.userinterfaces.PimPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;

public class EnterDataCreateEmployee implements Task {

    private String firstname;

    private String lastname;
    private String username;
    private String password;
    private String confirmPassword;


    public EnterDataCreateEmployee(String firstname, String lastname,String username, String password, String confirmPassword) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(WaitUntil.the(PimPage.BTN_ADD, WebElementStateMatchers.isEnabled()).forNoMoreThan(30).seconds(),
                Click.on(PimPage.BTN_ADD),
                WaitUntil.the(PimPage.CHK_LOGIN_DETAILS, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                Click.on(PimPage.CHK_LOGIN_DETAILS),
                WaitUntil.the(PimPage.INP_FIRSTNAME, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Enter.theValue(firstname).into(PimPage.INP_FIRSTNAME),
                Enter.theValue(lastname).into(PimPage.INP_LASTNAME),
                Enter.theValue(username).into(PimPage.INP_USERNAME),
                Enter.theValue(password).into(PimPage.INP_PASSWORD),
                Enter.theValue(confirmPassword).into(PimPage.INP_CONFIRM_PASSWORD)
        );


        String employed;
        WebElement element = PimPage.INP_EMPLOYEE_ID.resolveFor(actor).getElement();
        employed=element.getAttribute("value");
        actor.remember("employeeID",employed);

        actor.attemptsTo(WaitUntil.the(PimPage.BTN_SAVE, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                Click.on(PimPage.BTN_SAVE));
    }

    public static EnterDataCreateEmployee data(String firstname, String lastname, String username, String password, String confirmPassword){
        return Tasks.instrumented(EnterDataCreateEmployee.class, firstname, lastname,username,password,confirmPassword);

    }


}
