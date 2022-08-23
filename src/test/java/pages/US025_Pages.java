package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US025_Pages {

    public US025_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement Homepage_Dropdownmenu_Button;

    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    public WebElement Homepage_Singin_Button;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement Singin_Username_Box;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement Singin_Password_Box;

    @FindBy(xpath = "(//span[contains(text(),'Sign in')])[3]")
    public WebElement Singin_Singin_Button;

    @FindBy(xpath = "//span[normalize-space()='MY PAGES(PATIENT)']")
    public WebElement MYPAGES_Button;

    @FindBy(xpath = "//span[normalize-space()='Make an Appointment']")
    public WebElement Make_an_Appointment_Button;

    @FindBy(xpath = "//h2[normalize-space()='Make an Appointment']")
    public WebElement Make_an_Appointment_Visible_Text;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement Make_an_Appointment_Firstname_Box;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement Make_an_Appointment_Lastname_Box;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement Make_an_Appointment_SSN_Box;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement Make_an_Appointment_email_Box;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement Make_an_Appointment_Phone_Box;

    @FindBy(xpath = "//input[@id='appoDate']")
    public WebElement Make_an_Appointment_DateTime_Box;

    @FindBy(xpath = "//span[normalize-space()='Send an Appointment Request']")
    public WebElement SendAppointmentRequest_Button;

    @FindBy(xpath = "//strong[normalize-space()='Appointment registration saved!']")
    public WebElement Appointment_Registration_Saved_Visible_Text;








}
