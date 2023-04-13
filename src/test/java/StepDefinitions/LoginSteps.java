package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class LoginSteps {

    LoginPage lp = new LoginPage();


    @When("Navigate to Returning User Page")
    public void navigateToReturningUserPage(DataTable elements) {
        List<String> listElements = elements.asList( String.class );
        for (String strButtonName : listElements) {
            lp.findAndClick( strButtonName );
        }
    }

    @And("Enter Email")
    public void enterEmail(DataTable elements) {
        List<List<String>> listElements= elements.asLists(String.class);
        for(int i=0 ; i< listElements.size() ; i++ )
            lp.findAndSend(listElements.get(i).get(0), listElements.get(i).get(1) );
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {

       lp.findAndContainsText("loginsuccess", "Fast Track CRM");

    }



}
