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

   @FindBy(xpath = "((//ul[@id='header-tabs']//li//a)[7]")
   public WebElement myPages;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement myAppointments;





}