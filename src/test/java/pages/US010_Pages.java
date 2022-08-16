package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US010_Pages {

   public US010_Pages(){
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

   @FindBy(xpath = "//span[normalize-space()='MY PAGES']")
    public WebElement MYPAGES_Button;

   @FindBy(xpath = "//span[normalize-space()='My Appointments']")
    public WebElement MyAppointments_Button;

   @FindBy(xpath = "//span[normalize-space()='ID']")
    public WebElement MyAppointmens_ID_visible_text;

    @FindBy(xpath = "//span[normalize-space()='Start DateTime']")
    public WebElement MyAppointmens_StartDateTime_visible_text;

    @FindBy(xpath = "//span[normalize-space()='End DateTime']")
    public WebElement MyAppointmens_EndDateTime_visible_text;

    @FindBy(xpath = "//span[normalize-space()='Status']")
    public WebElement MyAppointmens_Status_visible_text;












}
