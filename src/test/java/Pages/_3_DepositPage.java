package Pages;

import Utilities.GenWebDrv;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class _3_DepositPage extends Parent {

    public _3_DepositPage() {

        PageFactory.initElements( GenWebDrv.getDriver(), this );
    }

    @FindBy(css = "button[class='button money']")
    private WebElement moneybutton;

    @FindBy(xpath = "//button[normalize-space()='Direct Bank']")
    private WebElement directbank;

    @FindBy(xpath = "//button[text()='€100']")
    private WebElement selectamount;

    @FindBy(xpath = "//button[normalize-space()='Deposit Approved']")
    private WebElement depositapproved;

    @FindBy(xpath = "//h3[contains(text(),'Your deposit was successful!')]")
    private WebElement depositsuccessful;

    @FindBy(xpath = "//button[normalize-space()='OK']")
    private WebElement okbutton;

    @FindBy(xpath = "//button[@class='button money']")
    private WebElement currentamount;


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
            case "currentamount":
                myElement = currentamount;
                break;
        }
        verifyContainsTextFunction( myElement, text );
    }

    public void checkAmountsMatch(WebElement amount1, WebElement amount2) {

        Assert.assertTrue( amount1.getText().contains( amount2.getText() ) ,
                "The amount deposited does not match current amount");
    }

}