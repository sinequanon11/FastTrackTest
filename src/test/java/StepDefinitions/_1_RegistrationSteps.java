package StepDefinitions;

import Pages._1_RegistrationPage;
import Utilities.GenWebDrv;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class _1_RegistrationSteps {

    _1_RegistrationPage reg = new _1_RegistrationPage();

    @Given("User is on the Home Page")
    public void userIsOnTheHomePage() {
        GenWebDrv.getDriver().get( "https://demo.ft-crm.com/tour" );
        GenWebDrv.getDriver().manage().window().maximize();
    }

    @And("Navigate to Registration Page")
    public void navigateToRegistrationPage(DataTable elements) {
        List<String> listElements = elements.asList( String.class );
        for (String strButtonName : listElements) {
            reg.findAndClick( strButtonName );
        }
    }

    @And("Enter Email and Click Submit Button")
    public void enterEmailAndClickSubmitButton() {

        reg.findAndSend( "enteremail", "hebal901888@fitzola.com");
        reg.findAndClick( "submitbutton" );
    }

    @And("Click the Submit Button")
    public void clickTheSubmitButton(DataTable elements) {
        List<String> listElements = elements.asList( String.class );
        for (String strButtonName : listElements) {
            reg.findAndClick( strButtonName );
        }
    }


    @And("Enter Country Code and Phone Number")
    public void enterCountryCodeAndPhoneNumber(DataTable elements) {
        List<List<String>> listElements = elements.asLists( String.class );
        for (int i = 0; i < listElements.size(); i++)
            reg.findAndSend( listElements.get( i ).get( 0 ), listElements.get( i ).get( 1 ) );
    }

    @And("Enter Full Name")
    public void enterFullName(DataTable elements) {
        List<List<String>> listElements = elements.asLists( String.class );
        for (int i = 0; i < listElements.size(); i++)
            reg.findAndSend( listElements.get( i ).get( 0 ), listElements.get( i ).get( 1 ) );
    }

    @And("Enter Password")
    public void enterPassword(DataTable elements) {
        List<List<String>> listElements = elements.asLists( String.class );
        for (int i = 0; i < listElements.size(); i++)
            reg.findAndSend( listElements.get( i ).get( 0 ), listElements.get( i ).get( 1 ) );
    }

    @And("Click the Login Button")
    public void clickTheLoginButton(DataTable elements) {
        List<String> listElements = elements.asList( String.class );
        for (String strButtonName : listElements) {
            reg.findAndClick( strButtonName );
        }
    }

    @Then("Registration Complete Should be Displayed")
    public void registrationCompleteShouldBeDisplayed() {

        reg.findAndContainsText( "registerComplete", "complete" );

    }
}

