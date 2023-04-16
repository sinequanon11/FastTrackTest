package StepDefinitions;

import Pages._4_PlayGamePage;
import Utilities.GenWebDrv;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _4_PlayGameSteps {

    _4_PlayGamePage pgp = new _4_PlayGamePage();

    String balancefirstStr = "";
    String balancesecondStr = "";

    @When("Click Menu and Select Casino")
    public void clickMenuAndSelectCasino(DataTable elements) {
        List<String> listElements = elements.asList( String.class );
        for (String strButtonName : listElements) {
            pgp.findAndClick( strButtonName );
        }
    }

    @And("Get the Amount")
    public void getTheAmount() {
        WebElement balancefirst = GenWebDrv.getDriver().findElement( By.xpath( "//button[@class='button money']" ) );
        System.out.println( "First Balance Is: " + balancefirst.getText() );
        balancefirstStr = balancefirst.getText();
    }

    @And("Play Game")
    public void playGame() throws InterruptedException {
        WebElement ddm = GenWebDrv.getDriver().findElement( By.xpath( "//header[@class='game__header']//select[1]" ) );
        Select dropdownmenu = new Select( ddm );
        dropdownmenu.selectByIndex( 2 );
        pgp.findAndClick( "playgame" );
        Thread.sleep( 2000 );
    }

    @Then("Play Game and Balance Should be Updated")
    public void playGameAndBalanceShouldBeUpdated() {
        WebElement balancesecond = GenWebDrv.getDriver().findElement( By.xpath( "//button[@class='button money']" ) );
        System.out.println( "Second Balance Is: " + balancesecond.getText() );
        balancesecondStr = balancesecond.getText();
        pgp.balanceUpdated( balancefirstStr, balancesecondStr );
    }

}

