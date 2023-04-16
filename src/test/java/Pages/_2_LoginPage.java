package Pages;

import Utilities.GenWebDrv;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _2_LoginPage extends Parent {

    public _2_LoginPage() {

        PageFactory.initElements( GenWebDrv.getDriver(), this );
    }

    @FindBy(xpath = "//button[normalize-space()='Returning user']")
    private WebElement returninguser;

    @FindBy(className = "big-text")
    private WebElement loginsuccess;

    WebElement myElement;

    public void findAndClick(String strElement) {

        switch (strElement) {
            case "returninguser":
                myElement = returninguser;
                break;
        }
        clickFunction( myElement );
    }


    public void findAndContainsText(String strelement, String text) {

        switch (strelement) {
            case "loginsuccess":
                myElement = loginsuccess;
                break;
        }
        verifyContainsTextFunction( myElement, text );
    }

}