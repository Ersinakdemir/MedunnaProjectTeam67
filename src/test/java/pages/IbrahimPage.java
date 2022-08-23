package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class IbrahimPage {

    public IbrahimPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")//    girisSekmesi
    public WebElement GirisSekmesi;

    @FindBy(xpath = "//span[text()='Sign in']")//    SignIn butonu
    public WebElement  SignInButonu;

    @FindBy(xpath = "//input[@name='username']")//    username box
    public WebElement UserNameBox;

    @FindBy(xpath = "//input[@name='password']")//   password box
    public WebElement passwordBox;

    @FindBy(xpath = "(//span[text()='Sign in'])[3]")//    giris SignIn butonu
    public WebElement  GirisSignInButonu;

    @FindBy(xpath = "(//a[@class='d-flex align-items-center dropdown-toggle nav-link'])[2]")//   kullanici ismi butonu
    public WebElement  KullaniciIsmiButonu;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[5]")//   kullanici pasword degistirme butonu
    public WebElement  PassswordDegistirmeButonu;

    @FindBy(xpath = "//input[@name='currentPassword']")
    public WebElement CurrentPasswordBox;

    @FindBy(xpath = "//input[@name='newPassword']")
    public WebElement NewPasswordBox;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement ConfirmPasswordBox;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement  SaveButonu;


    @FindBy(xpath = "(//a[@class='dropdown-item'])[5]")
    public WebElement  SignOutButonu;

    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement  PasswordChangedYazisi;

    @FindBy(xpath = "//li[@class='point']")
    public List<WebElement> PasswordStrengthList;

    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--error toastify-toast']")
    public WebElement  PasswordErrorYazisi;

    @FindBy(xpath = "//span[text()=' Please check your credentials and try again.']")
    public WebElement  PasswordAgainYazisi;

    @FindBy(xpath = "//span[text()='Cancel']")
    public WebElement  CancelYazisi;

}
