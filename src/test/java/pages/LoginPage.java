package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {


    public static By myPagesButton;

    public LoginPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }
@FindBy(xpath="//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
public WebElement LoginAdam;
    @FindBy(xpath="(//a[@class='d-flex align-items-center dropdown-toggle nav-link'])[1]")
    public WebElement ItemLogin1;

    @FindBy(xpath = "//*[@id='login-item']/span")
    public WebElement signInLocation;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(id="account-menu")
    public WebElement signInAndRegistrationPortal;

    @FindBy(id="login-item")
    public WebElement signIn;


    @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement signedInUserName;

    @FindBy(xpath = "//input[@name='rememberMe']")
    public WebElement rememberMeBox;

    @FindBy(xpath = "//a[@class='dropdown-item'][3]")
    public WebElement signOutButton;

    @FindBy(xpath = "//*[text()='Team83-kubraoz']")
    public WebElement shownUserName;

    @FindBy(xpath = "//div[@class='alert alert-danger fade show']")
    public WebElement failedToSignInAlert;

    @FindBy(xpath = "//*[@id='login-page']/div/form/div[2]/div[3]/a/span")
    public WebElement didYouForgetPasswd;

    @FindBy(xpath = "//*[@id='login-page']/div/form/div[2]/div[4]/a")
    public WebElement registerNewAccount;

    @FindBy(xpath="//button[@class='btn btn-secondary']")
    public WebElement cancelButton;

    @FindBy(xpath = "//h5[@class=\"modal-title\"]//span")
    public WebElement signInText;


}