package co.com.orange.questions;

import co.com.orange.userinterfaces.DashBoardPage;
import co.com.orange.userinterfaces.PimPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidateEmployeeId implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        String employeeID = actor.recall("employeeID");
        actor.attemptsTo(
                WaitUntil.the(PimPage.TXT_EMPLOYEE_DATA, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                WaitUntil.the(DashBoardPage.LBL_PIM, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                Click.on(DashBoardPage.LBL_PIM),
                Enter.theValue(employeeID).into(PimPage.INP_EMPLOYEE_ID_2),
                Click.on(PimPage.BTN_SEARCH),
                WaitUntil.the(PimPage.BTN_EMPLOYEE_EDIT, WebElementStateMatchers.isCurrentlyVisible()).forNoMoreThan(30).seconds()
                );
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return PimPage.TXT_EMPLOYEE_FIRSTNAME.resolveFor(actor).getText().concat(" "+PimPage.TXT_EMPLOYEE_LASTNAME.resolveFor(actor).getText());
    }
    public static ValidateEmployeeId text(){
        return new ValidateEmployeeId();
    }
}
