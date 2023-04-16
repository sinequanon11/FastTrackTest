package Pages;

import Utilities.GenWebDrv;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class _4_PlayGamePage extends Parent {

    public _4_PlayGamePage() {

        PageFactory.initElements( GenWebDrv.getDriver(), this );
    }

    @FindBy(xpath = "//div[@id='navigation']")
    private WebElement hambmenu;

    @FindBy(xpath = "//a[contains(text(),'Casino')]")
    private WebElement casino;

    @FindBy(xpath = "(//div[@class='option']//img)[2]")
    private WebElement playgame;


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

    public void balanceUpdated(String amount1, String amount2) {
        Assert.assertNotEquals( amount1, amount2, "The balance has not been updated" );
    }
}


