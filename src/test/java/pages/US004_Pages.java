package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US004_Pages {

    public US004_Pages (){
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













}
