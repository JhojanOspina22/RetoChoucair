package co.com.orange.questions;

import co.com.orange.userinterfaces.PimPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class ValidateUsernameRegisteredAlready implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(PimPage.TXT_ERROR_USERNAME_REGISTERED, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds());
       return PimPage.TXT_ERROR_USERNAME_REGISTERED.resolveFor(actor).getText();
    }
    public static ValidateUsernameRegisteredAlready message(){
        return new ValidateUsernameRegisteredAlready();
    }
}
