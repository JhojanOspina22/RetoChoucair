package co.com.orange.tasks;


import co.com.orange.userinterfaces.DashBoardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class EntersMenuPim implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DashBoardPage.LBL_PIM, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                Click.on(DashBoardPage.LBL_PIM)
        );
    }

    public static EntersMenuPim Click(){
        return Tasks.instrumented(EntersMenuPim.class);
    }
}
