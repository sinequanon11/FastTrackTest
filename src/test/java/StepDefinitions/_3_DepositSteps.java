package StepDefinitions;

import Pages._3_DepositPage;
import Utilities.GenWebDrv;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _3_DepositSteps {

    _3_DepositPage dp = new _3_DepositPage();

    @When("Click Money Button")
    public void clickMoneyButton(DataTable elements) {

        List<String> listElements = elements.asList( String.class );
        for (String strButtonName : listElements) {
            dp.findAndClick( strButtonName );
        }
    }

    @And("Select Direct Bank Method")
    public void selectDirectBankMethod(DataTable elements) {
        List<String> listElements = elements.asList( String.class );
        for (String strButtonName : listElements) {
            dp.findAndClick( strButtonName );
        }
    }

    @And("Select an Amount")
    public void selectAnAmount(DataTable elements) {
        List<String> listElements = elements.asList( String.class );
        for (String strButtonName : listElements) {
            dp.findAndClick( strButtonName );
        }
    }

    @And("Deposit Approved")
    public void depositApproved(DataTable elements) {
        List<String> listElements = elements.asList( String.class );
        for (String strButtonName : listElements) {
            dp.findAndClick( strButtonName );
        }
    }

    @Then("Deposit Successful and Check Balance Matches")
    public void depositSuccessfulAndCheckBalanceMatches() {

        dp.findAndContainsText( "depositsuccessful", "successful!" );
        dp.findAndClick( "okbutton" );

        WebElement selectdeposit = GenWebDrv.getDriver().findElement( By.xpath( "(//button[@class='button button--deposit'])[1]" ) );
        WebElement currentamount = GenWebDrv.getDriver().findElement( By.xpath( "//button[@class='button money']" ) );
        dp.checkAmountsMatch( currentamount, selectdeposit );
    }

}
