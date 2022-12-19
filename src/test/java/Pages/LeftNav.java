package Pages;

import Utilities.GenWebDrv;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav(){
        PageFactory.initElements(GenWebDrv.getDriver(),this);
    }

    @FindBy(xpath="")
    private WebElement setup;

    WebElement myElement;

    public void findAndClick(String strElement){

        switch (strElement){
           // case "setup" : myElement=setup;break;
        }
        clickFunction(myElement);
    }


}
