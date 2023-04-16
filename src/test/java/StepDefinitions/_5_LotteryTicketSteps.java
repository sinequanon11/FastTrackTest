package StepDefinitions;

import Pages._5_LotteryTicketPage;
import Utilities.GenWebDrv;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _5_LotteryTicketSteps {

    _5_LotteryTicketPage ltp = new _5_LotteryTicketPage();

    String balancefirstStr = "";
    String balancesecondStr = "";

    @When("Click Menu and Select Lottery")
    public void clickMenuAndSelectLottery(DataTable elements) {
        List<String> listElements = elements.asList( String.class );
        for (String strButtonName : listElements) {
            ltp.findAndClick( strButtonName );
        }
    }

    @And("Get the Current Amount")
    public void getTheCurrentAmount() throws InterruptedException {
        WebElement balancefirst = GenWebDrv.getDriver().findElement( By.xpath( "//button[@class='button money']" ) );
        System.out.println( "First Balance Is: " + balancefirst.getText() );
        balancefirstStr = balancefirst.getText();
    }

    @And("Buy a Lottery Ticket")
    public void buyALotteryTicket(DataTable elements) throws InterruptedException {
        List<String> listElements = elements.asList( String.class );
        for (String strButtonName : listElements) {
            ltp.findAndClick( strButtonName );
            Thread.sleep( 2000 );
        }
    }

    @Then("Buy a Lottery Ticket and Balance Should be Updated")
    public void buyALotteryTicketAndBalanceShouldBeUpdated() {
        WebElement balancesecond = GenWebDrv.getDriver().findElement( By.xpath( "//button[@class='button money']" ) );
        System.out.println( "Second Balance Is: " + balancesecond.getText() );
        balancesecondStr = balancesecond.getText();
        ltp.balanceUpdated( balancefirstStr, balancesecondStr );
    }

}
