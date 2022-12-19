package Pages;

import Utilities.GenWebDrv;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent{

    public FormContent(){
        PageFactory.initElements(GenWebDrv.getDriver(),this);
    }

    @FindBy(xpath = "")
    private WebElement write;


    WebElement myElement;

    public void findAndClick(String strlement) {
        //element get :burda string isimden weblemente ulaşıcam
        switch (strlement){
          //  case "academicPeriod" : myElement = academicPeriod;break;

        }
        clickFunction(myElement);
    }
}
