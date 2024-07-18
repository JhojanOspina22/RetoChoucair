package co.com.orange.tasks;

import co.com.orange.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class LoginPageWebOrange implements Task {

    private String username;
    private String password;

    public LoginPageWebOrange(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomePage.INP_USERNAME, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Enter.theValue(username).into(HomePage.INP_USERNAME),
                Enter.theValue(password).into(HomePage.INP_PASSWORD),
                WaitUntil.the(HomePage.BTN_LOGIN, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(HomePage.BTN_LOGIN)
        );
    }

    public static LoginPageWebOrange Login(String username, String password){
        return Tasks.instrumented(LoginPageWebOrange.class, username, password);
    }
}
