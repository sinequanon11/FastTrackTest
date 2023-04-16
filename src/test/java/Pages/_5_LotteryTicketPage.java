package Pages;

import Utilities.GenWebDrv;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class _5_LotteryTicketPage extends Parent {

    public _5_LotteryTicketPage() {

        PageFactory.initElements( GenWebDrv.getDriver(), this );
    }

    @FindBy(xpath = "//div[@id='navigation']")
    private WebElement hambmenu;

    @FindBy(xpath = "//a[normalize-space()='Lottery']")
    private WebElement lottery;

    @FindBy(xpath = "//button[normalize-space()='Buy tickets']")
    private WebElement buytickets;


    WebElement myElement;

    public void findAndClick(String strElement) {

        switch (strElement) {
            case "hambmenu":
                myElement = hambmenu;
                break;
            case "lottery":
                myElement = lottery;
                break;
            case "buytickets":
                myElement = buytickets;
                break;
        }
        clickFunction( myElement );
    }

    public void balanceUpdated(String amount1, String amount2) {

        Assert.assertNotEquals( amount1, amount2, "The balance has not been updated" );
    }

}
