package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US012_13_Pages {

    public US012_13_Pages() {

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

    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> testList;

    @FindBy(xpath = "//input[@name='129700']")
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

    @FindBy(xpath = "//*[text()='Show Test Results']")
    public WebElement showTests;

    @FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[1]")
    public WebElement viewResults;

    @FindBy(xpath = "(//tr//th)[01]")
    public WebElement id;

    @FindBy(xpath = "(//tr//th)[02]")
    public WebElement name;

    @FindBy(xpath = "(//tr//th)[04]")
    public WebElement default_max_value;

    @FindBy(xpath = "(//tr//th)[05]")
    public WebElement default_min_value;

    @FindBy(xpath = "(//tr//th)[06]")
    public WebElement test;

    @FindBy(xpath = "(//tr//th)[07]")
    public WebElement description ;

    @FindBy(xpath = "(//tr//th)[08]")
    public WebElement date ;

    @FindBy(xpath = "//tbody//tr//td[1]")
    public List<WebElement> testId;

    @FindBy(xpath = "//tbody//tr//td[2]")
    public List<WebElement> testName;

    @FindBy(xpath = "//tbody//tr//td[5]")
    public List<WebElement> testDefault_max_value;

    @FindBy(xpath = "//tbody//tr//td[4]")
    public List<WebElement> testDefault_min_value;

    @FindBy(xpath = "//tbody//tr//td[6]")
    public List<WebElement> testTest;

    @FindBy(xpath = "//tbody//tr//td[7]")
    public List<WebElement> testDescription;

    @FindBy(xpath = "//tbody//tr//td[8]")
    public List<WebElement> testDate;

   @FindBy(xpath = "//*[text()='Request Inpatient']")
    public WebElement requestInpatient;

   @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement inpatienMsj;

}
