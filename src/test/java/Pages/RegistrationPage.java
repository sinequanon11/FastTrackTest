package Pages;

import Utilities.GenWebDrv;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RegistrationPage extends Parent {
    public RegistrationPage() {

        PageFactory.initElements( GenWebDrv.getDriver(), this );
    }

    @FindBy(css = "button[class='button register']")
    private WebElement newuserbutton;

    @FindBy(css = "button[class='button button--intro']")
    private WebElement igetitbutton;

    @FindBy(css = "input[placeholder='Enter Email']")
    private WebElement enteremail;

    @FindBy(css = "button[type='submit']")
    private WebElement submitbutton;


    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            case "enteremail": myElement = enteremail; break;
        }

        sendKeysFunction( myElement, value );
    }

    public void findAndClick(String strElement) {

        switch (strElement){
            case "newuserbutton": myElement = newuserbutton; break;
            case "igetitbutton": myElement = igetitbutton; break;
            case "submitbutton": myElement = submitbutton; break;

                }
                clickFunction( myElement );
            }

            public void findAndCountainsText (String strElement, String text){

                switch (strElement) {
                    case "txtTechnoStudy":
                        myElement = txtTechnoStudy;
                        break;

                }
                verifyContainsTextFunc( myElement, text );
            }

            public void findAndDelete (String searchTex){
                findAndSend( "searchInput", searchTex );
                findAndClick( "searchButton" );

                waitUntilLoading();
                findAndClick( "deleteButton" );
                findAndClick( "deleteDialogBtn" );
            }

            public void closeWindow () {
                Robot robot = null;
                try {
                    robot = new Robot();
                } catch (AWTException e) {
                    throw new RuntimeException( e );
                }
                robot.keyPress( KeyEvent.VK_TAB );
                robot.keyRelease( KeyEvent.VK_TAB );

            }

            public void findAndSearch (String strElement, String searchText){
                findAndSend( "searchInput", searchText );
                findAndClick( "searchButton" );
                waitUntilLoading();
            }

            public void findAndEdit (String strElement, String text){
                findAndClick( "editButton" );
                findAndSend( "nameInput", text );
                findAndClick( "saveButton" );
            }
        }
