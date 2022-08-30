package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US004_027_Pages {

    public US004_027_Pages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//*[@class='svg-inline--fa fa-user fa-w-14 ']")
    public WebElement findPeople;

    @FindBy(xpath="//*[@id=\"login-item\"]/span")
    public WebElement signIn_First;

    @FindBy(xpath="//*[@id=\"username\"]")
    public WebElement userNameUI;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement passwordUI;

    @FindBy(xpath="//*[@id=\"login-page\"]/div/form/div[3]/button[2]/span")
    public WebElement signIn_Second;

    @FindBy(xpath = "//*[@id=\"admin-menu\"]/a/span")
    public WebElement admistaration;

    @FindBy(xpath="//*[@id=\"login-page\"]/div/form/div[2]/div[1]/div[1]/div/span")
    public WebElement failedToSignIn;

    @FindBy(xpath="//*[@id=\"rememberMe\"]")
    public WebElement remember;

    @FindBy(xpath="//*[@id=\"login-page\"]/div/form/div[2]/div[3]/a/span")
    public WebElement fotgetButton;

    @FindBy(xpath="//*[@id=\"login-page\"]/div/form/div[2]/div[4]/span/span")
    public WebElement registerPhrases;

    @FindBy(xpath="//*[@id=\"login-page\"]/div/form/div[3]/button[1]/span")
    public WebElement cancelButton;

    @FindBy(xpath="//*[@id=\"entity-menu\"]/a/span")
    public WebElement temsAndTitles;

    @FindBy (xpath="//*[@id=\"entity-menu\"]/div/a[9]/span")
    public WebElement messagesInDropDown;

    @FindBy(xpath="//*[@id=\"jh-create-entity\"]")
    public WebElement createMessageButton;

    @FindBy(xpath="//*[@id=\"c-message-name\"]")
    public WebElement nameForCreate;

    @FindBy(xpath="//*[@id=\"c-message-email\"]")
    public WebElement emailForCreate;

    @FindBy(xpath="//*[@id=\"c-message-subject\"]")
    public WebElement subjectForCreate;

    @FindBy(xpath="//*[@id=\"c-message-message\"]")
    public WebElement messageForCreate;

    @FindBy(xpath="//*[@id=\"save-entity\"]/span")
    public WebElement saveForCreate;

    @FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div")
    public WebElement verifyForCreating;

    @FindBy(xpath="//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/thead/tr/th[1]/span")
    public WebElement idTop;

    @FindBy(xpath="//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[6]/div/a[2]/span/span")
    public WebElement edit;

    @FindBy(xpath="//*[@id=\"c-message-name\"]")
    public WebElement nameForEdit;

    @FindBy(xpath="//*[@id=\"c-message-email\"]")
    public WebElement emailForEdit;

    @FindBy(xpath="//*[@id=\"c-message-subject\"]")
    public WebElement subjectForEdit;

    @FindBy(xpath="//*[@id=\"c-message-message\"]")
    public WebElement messageForEdit;

    @FindBy(xpath="//*[@id=\"save-entity\"]/span")
    public WebElement saveForEdit;

    @FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div")
    public WebElement successfulEdit;

    @FindBy(xpath="//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[6]/div/a[3]/span/span")
    public WebElement deleteButton;

    @FindBy(xpath="//*[@id=\"jhi-confirm-delete-cMessage\"]/span")
    public WebElement deleteConfirm;

    @FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div")
    public WebElement deleteSuccessful;
















}
