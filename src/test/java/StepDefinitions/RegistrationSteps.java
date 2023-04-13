package StepDefinitions;

import Pages.RegistrationPage;
import Utilities.GenWebDrv;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.util.List;

public class RegistrationSteps {

    RegistrationPage reg = new RegistrationPage();

    @Given("User is on the Home Page")
    public void userIsOnTheHomePage() {
        GenWebDrv.getDriver().get("https://demo.ft-crm.com/tour");
        GenWebDrv.getDriver().manage().window().maximize();
    }

    @And("Navigate to Registration Page")
    public void navigateToRegistrationPage(DataTable elements) {
        List<String> listElements= elements.asList(String.class);
        for(String strButtonName : listElements) {
            reg.findAndClick( "newuserbutton" );
            reg.findAndClick( "igetitbutton" );
        }
    }

    @And("Enter Valid Email")
    public void enterValidEmail()  {

        reg.findAndSend( "enteremail", "cecite1856@fitzola.com");
    }

    @And("Click the Submit Button")
    public void clickTheSubmitButton() {
        reg.findAndClick( "submitbutton" );
    }

    @And("Enter Country Code and Phone Number")
    public void enterCountryCodeAndPhoneNumber(DataTable elements) {
        List<String> listElements= elements.asList(String.class);
        for(String strName : listElements) {

            reg.findAndSend( "enterCountryCode", "+90" );
            reg.findAndSend( "enterPhoneNumber", "5554443322" );
        }
    }

    @And("Enter Full Name")
    public void enterFullName() {

        reg.findAndSend( "enterFullName", "Michael Page" );

    }

    @And("Enter Password")
    public void enterPassword() {

        reg.findAndSend( "enterPassword", "AaBb1234" );
    }

    @And("Click the Login Button")
    public void clickTheLoginButton() {

        reg.findAndClick( "loginButton" );

    }
}
