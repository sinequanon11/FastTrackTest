package StepDefinitions;

import Pages.RegistrationPage;
import Utilities.GenWebDrv;
import io.cucumber.java.en.Given;

public class RegistrationSteps {
    public RegistrationSteps() {

        RegistrationPage reg = new RegistrationPage();


        @Given("User is on the Home Page")
        public void userIsOnTheHomePage () {

            GenWebDrv.getDriver().get( "https://demo.ft-crm.com/tour" );
            GenWebDrv.getDriver().manage().window().maximize();




    /*


    @And("Navigate to Position Categories")
    public void navigateToPositionCategories(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (String strButton : listElement){
            reg.findAndClick(strButton);
        }
    }

    @And("Click on the element in the Position Categories")
    public void clickOnTheElementInThePositionCategories(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (String strButton : listElement) {
            reg.findAndClick(strButton);
        }
    }

    @And("User sending the key in Position Categories")
    public void userSendingTheKeyInPositionCategories(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
            reg.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        reg.findAndCountainsText("successMessage", "success");
    }

*/

        }
    }
}
