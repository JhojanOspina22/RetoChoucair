package co.com.orange.stepdefinitions;

import co.com.orange.questions.ValidateEmployeeId;
import co.com.orange.tasks.EntersMenuPim;
import co.com.orange.tasks.LoginPageWebOrange;
import co.com.orange.tasks.EnterDataCreateEmployee;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.equalTo;

public class CreateAccountStepsDefinitions {

    @Managed
     public WebDriver Browser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(Browser)));
        OnStage.theActorCalled("Jhojan");
    }

    @Given("User login in page web with user {string} and password {string}")
    public void userLoginInPageWebWithUserAndPassword(String userName, String password) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
        OnStage.theActorInTheSpotlight().wasAbleTo(LoginPageWebOrange.Login(userName,password));
    }
    @When("the user enters the PIM menu")
    public void theUserEntersThePIMMenu() {
        OnStage.theActorInTheSpotlight().wasAbleTo(EntersMenuPim.Click());

    }
    @And("the user enters {string},{string},{string}, {string} and {string}")
    public void theUserEntersAnd(String firstName, String lastName, String username, String password, String confirmPassword) {
        OnStage.theActorInTheSpotlight().wasAbleTo(EnterDataCreateEmployee.data(firstName,lastName,username,password,confirmPassword));

    }

    @Then("the user will see your {string} and {string} in the list employees create")
    public void theUserWillSeeYourAndInTheListEmployeesCreate(String username, String lastname) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateEmployeeId.text(), equalTo(username.concat(" "+ lastname))));

    }

    @Then("the user will see your employee created")
    public void theUserWillSeeYourEmployeeCreated() {

    }

}
