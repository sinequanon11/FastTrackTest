package Pages;

import Utilities.GenWebDrv;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepositPage extends Parent {

    public DepositPage() {

        PageFactory.initElements( GenWebDrv.getDriver(), this );
    }

    @FindBy(css = "button[class='button register']")
    private WebElement newuserbutton;

    @FindBy(css = "button[class='button button--intro']")
    private WebElement igetitbutton;

    @FindBy(css = "input[type='email']")
    private WebElement enteremail;

    @FindBy(css = "button[type='submit']")
    private WebElement submitbutton;

    @FindBy(css = "input[type='text']")
    private WebElement enterCountryCode;

    @FindBy(css = "input[placeholder='Phone number']")
    private WebElement enterPhoneNumber;

    @FindBy(css = "input[placeholder='Enter your name']")
    private WebElement enterFullName;

    @FindBy(css = "input[placeholder='Password']")
    private WebElement enterPassword;

    @FindBy(css = "button[class='button button--secondary']")
    private WebElement loginButton;

    @FindBy(tagName = "h3")
    private WebElement registerComplete;


    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            case "enteremail": myElement = enteremail; break;
            case "enterCountryCode": myElement = enterCountryCode; break;
            case "enterPhoneNumber": myElement = enterPhoneNumber; break;
            case "enterFullName": myElement = enterFullName; break;
            case "enterPassword": myElement = enterPassword; break;


        }

        sendKeysFunction( myElement, value );
    }

    public void findAndClick(String strElement) {

        switch (strElement){
            case "newuserbutton": myElement = newuserbutton; break;
            case "igetitbutton": myElement = igetitbutton; break;
            case "submitbutton": myElement = submitbutton; break;
            case "loginButton": myElement = loginButton; break;

                }
                clickFunction( myElement );
            }

    public void findAndContainsText(String strlement, String text){

        switch (strlement)
        {
            case "registerComplete" : myElement=registerComplete;break;

        }

        verifyContainsTextFunction(myElement, text);
    }

        }
