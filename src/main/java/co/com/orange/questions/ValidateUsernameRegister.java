package co.com.orange.questions;

import co.com.orange.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class ValidateUsernameRegister implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(HomePage.BTN_LOGIN, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds());
       return HomePage.BTN_LOGIN.resolveFor(actor).getText();
    }
    public static ValidateUsernameRegister username(){
        return new ValidateUsernameRegister();
    }
}
