package StepDefinitions;

import Pages._2_LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _2_LoginSteps {

    _2_LoginPage lp = new _2_LoginPage();

    @When("Navigate to Returning User Page")
    public void navigateToReturningUserPage() {
    lp.findAndClick("returninguser" );

    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        lp.findAndContainsText( "loginsuccess", "Fast Track CRM" );
    }
}
