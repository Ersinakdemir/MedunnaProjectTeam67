package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US012_Pages {

    public US012_Pages(){

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement signeIn;

   @FindBy(id = "login-item")
   public WebElement login;

   @FindBy(name = "username")
   public WebElement userName;

   @FindBy(name = "password")
   public WebElement password;

   @FindBy(xpath = "//button[@type='submit']")
   public WebElement signIn_boutton;

    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myPage;

    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement myAppointments;

    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement Edit;

    @FindBy(xpath = "//a[@class='btn btn-success btn-sm']")
    public WebElement requestATest;

    @FindBy(xpath = "//h2[text()='Test Items']")
    public WebElement testItemsTextVisible;

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountMenu;

    @FindBy(xpath = "//span[text()='Sign out']")
    public WebElement signOut;

    @FindBy(xpath = "//thead//tr//th[2]")
    public WebElement tests;

    @FindBy(xpath = "//input[@name='1402']")
    public WebElement ureaTest;

    @FindBy(xpath = "//input[@name='1403']")
    public WebElement creatinineTes;

    @FindBy(xpath = "//input[@name='1404']")
    public WebElement sodiumTest;

    @FindBy(xpath = "//input[@name='1405']")
    public WebElement potassiumTest;

    @FindBy(xpath = "//input[@name='1406']")
    public WebElement totalproteinTest;

    @FindBy(xpath = "//input[@name='1408']")
    public WebElement hemoglobinTest;

    @FindBy(xpath = "//input[@name='1407']")
    public WebElement albuminTest;

    @FindBy(xpath = "//input[@name='1401']")
    public WebElement glucoseTest;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(id = "app-view-container")
    public WebElement verifyTextAlert;

    @FindBy(xpath = "//span[text()='Search Patient']")
    public WebElement searchPatient;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnBox;

    @FindBy(xpath = "//span[text()='Show Appointments']")
    public WebElement showAppointments;

    @FindBy(xpath = "(//span[text()='Show Tests'])[2]")
    public WebElement showTests;

    @FindBy(xpath = "(//span[text()='View Results'])[4]")
    public WebElement viewResults;






}
