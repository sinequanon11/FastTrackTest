package Pages;

import Utilities.GenWebDrv;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LotteryTicketPage extends Parent {

    public LotteryTicketPage() {

        PageFactory.initElements( GenWebDrv.getDriver(), this );
    }

    @FindBy(xpath = "//div[@id='navigation']")
    private WebElement hambmenu;

    @FindBy(xpath = "//a[contains(text(),'Casino')]")
    private WebElement casino;

    @FindBy(xpath = "(//div[@class='option']//img)[2]")
    private WebElement playgame;

    @FindBy(xpath = "//button[@class='button money']")
    private WebElement playgamebalance;


    WebElement myElement;

    public void findAndClick(String strElement) {

        switch (strElement) {
            case "hambmenu":
                myElement = hambmenu;
                break;
            case "casino":
                myElement = casino;
                break;
            case "playgame":
                myElement = playgame;
                break;

        }
        clickFunction( myElement );
    }


    public void findAndContainsText(String strelement, String text) {
        switch (strelement) {
            case "playgamebalance":
                myElement = playgamebalance;
                break;
        }
        verifyContainsTextFunction( myElement, text );
    }

    public void balanceUpdated(WebElement amount1, WebElement amount2) {

        Assert.assertNotEquals(  amount2.getText(), amount1.getText(), "The balance has not been updated" );
    }


}
