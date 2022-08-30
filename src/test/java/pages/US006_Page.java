package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US006_Page {

    public US006_Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement resimIkonu;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement SignIn;

    @FindBy(xpath ="//input[@name='username']")
    public WebElement usernameKutusu;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath ="//button[@type='submit']")
    public WebElement SignInButon;

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement kosedekiKullaniciAdi;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement settings;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement settingsFirstNameKutusu;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement settingsLastNameKutusu;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement settingsEmailKutusu;

    @FindBy(xpath = "//span[normalize-space()='Save']")
    public WebElement settingsSaveButonu;

    @FindBy(xpath = "//span[normalize-space()='Settings saved!']")
    public WebElement settingsSaveYazisi;





}