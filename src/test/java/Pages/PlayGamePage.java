package Pages;

import Utilities.GenWebDrv;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlayGamePage extends Parent {

    public PlayGamePage() {

        PageFactory.initElements( GenWebDrv.getDriver(), this );
    }

    @FindBy(css = "button[class='button money']")
    private WebElement moneybutton;

    @FindBy(xpath = "//button[normalize-space()='Direct Bank']")
    private WebElement directbank;

    @FindBy(xpath = "//div[@class='buttons']//div[1]//button[1]")
    private WebElement selectamount;

    @FindBy(xpath = "//button[normalize-space()='Deposit Approved']")
    private WebElement depositapproved;

    @FindBy(xpath = "//h3[contains(text(),'Your deposit was successful!')]")
    private WebElement depositsuccessful;

    @FindBy(xpath = "//button[normalize-space()='OK']")
    private WebElement okbutton;

    @FindBy(xpath = "//button[@class='button money']")
    private WebElement amount;


    WebElement myElement;

    public void findAndClick(String strElement) {

        switch (strElement) {
            case "moneybutton":
                myElement = moneybutton;
                break;
            case "directbank":
                myElement = directbank;
                break;
            case "selectamount":
                myElement = selectamount;
                break;
            case "depositapproved":
                myElement = depositapproved;
                break;
            case "okbutton":
                myElement = okbutton;
                break;


        }
        clickFunction( myElement );
    }

    public void findAndContainsText(String strlement, String text) {

        switch (strlement) {
            case "depositsuccessful":
                myElement = depositsuccessful;
                break;
            case "amount":
                myElement = amount;
                break;

        }
        verifyContainsTextFunction( myElement, text );
    }

}
