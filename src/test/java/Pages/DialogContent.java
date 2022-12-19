package Pages;

import Utilities.GenWebDrv;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent(){

        PageFactory.initElements(GenWebDrv.getDriver(),this);
    }

    @FindBy(css="input[formcontrolname='username']")
    private WebElement username;

    @FindBy(css="input[formcontrolname='password']")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    private WebElement txtTechnoStudy;

    @FindBy(css = "button[class='consent-give']")
    private WebElement acceptCookies;



    WebElement myElement;

    public void findAndSend(String strElement, String value){
        //element get

        switch (strElement){
            case "username" : myElement=username;break;
            case "password" : myElement=password;break;

        }
        sendKeysFunction(myElement,value);
    }

    public void findAndClick(String strElement){
        //element get
        switch (strElement){
            case "loginButton" : myElement=loginButton;break;
            case "acceptCookies": myElement=acceptCookies;break;
        }
        clickFunction(myElement);
    }

    public void findAndCountainsText(String strElement,String text){

        switch (strElement){
            case "txtTechnoStudy" : myElement=txtTechnoStudy;break;
        }
        verifyContainsTextFunc(myElement,text);
    }
    public void  findAndDelete(String searchTex){
        findAndSend("searchInput",searchTex);
        findAndClick("searchButton");

        waitUntilLoading();
        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");
    }
}
