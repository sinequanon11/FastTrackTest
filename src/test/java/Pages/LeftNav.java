package Pages;

import Utilities.GenWebDrv;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(GenWebDrv.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResource_1;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setup_1;

    @FindBy(xpath = "(//span[text()='Position Categories'])[1]")
    private WebElement positionCategory_1;

    @FindBy(xpath = "(//span[text()='Attestations'])[1]")
    private WebElement attestations_1;

    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c252-7 ng-star-inserted']")
    private WebElement setup;

    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c252-8 ng-star-inserted']")
    private WebElement parameters;

    @FindBy(xpath="//span[normalize-space()='Document Types']")
    private WebElement documentTypes;

    @FindBy(xpath = "//span[@class='nav-link-title ng-star-inserted'][normalize-space()='Fields']")
    private WebElement fields;

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parametersG;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    private WebElement bankAccounts;
    @FindBy(xpath = "//span[text()='Grade Levels']")
    private WebElement gradeLevels;

    @FindBy(css = "span[class='nav-link-title ng-tns-c252-23 ng-star-inserted']")
    private WebElement Education_6;

    @FindBy(css = "span[class='nav-link-title ng-tns-c252-24 ng-star-inserted']")
    private WebElement EducationSetup_6;

    @FindBy(xpath = "(//fuse-nav-vertical-item[@class='ng-tns-c252-24 nav-item ng-star-inserted'])[1]")
    private WebElement SubjectCategories_6;

    @FindBy(css = "div[class='children ng-tns-c252-18 ng-trigger ng-trigger-slideInOut ng-star-inserted'] > :nth-child(1) > a")
    private WebElement positions_5;

    @FindBy (xpath = "//span[text()='School Setup']")
    private WebElement school_setup_f;

    @FindBy (xpath = "//span[text()='Departments']")
    private WebElement departments_f;

    @FindBy (xpath = "//span[text()='Locations']")
    private WebElement locations_f;



    WebElement myElement;

    public void findAndClick(String strElement) {

        switch (strElement) {
            case "humanResource_1":
                myElement = humanResource_1;
                break;
            case "setup_1":
                myElement = setup_1;
                break;
            case "positionCategory_1":
                myElement = positionCategory_1;
                break;
            case "attestations_1":
                myElement = attestations_1;
                break;
            case "setup" :
                myElement=setup;
                break;
            case "parameters" :
                myElement=parameters;
                break;
            case "documentTypes" : myElement=documentTypes;break;
            case "fields" : myElement =fields; break;
            case "parametersG" : myElement =parametersG; break;
            case "setupOne" : myElement =setupOne; break;
            case "bankAccounts" : myElement =bankAccounts; break;
            case "gradeLevels" : myElement =gradeLevels; break;
            case "Education_6":
                myElement = Education_6;
                break;
            case "EducationSetup_6":
                myElement = EducationSetup_6;
                break;
            case "SubjectCategories_6":
                myElement = SubjectCategories_6;
                break;
            case "positions_5":
                myElement = positions_5;
                break;
            case "departments_f": myElement=departments_f; break;
            case "school_setup_f": myElement=school_setup_f; break;
            case "locations_f": myElement=locations_f; break;

        }
        clickFunction(myElement);
    }
}
