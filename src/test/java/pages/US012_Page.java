package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US012_Page {

    public US012_Page(){
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

    @FindBy(className = "btn btn-primary")
    public WebElement signIn_boutton;

    @FindBy(id = "entity-menu")
    public WebElement myPages;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement myAppointments;





}
