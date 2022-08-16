package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US011_Pages {


    public US011_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

@FindBy(xpath = "//span[contains(text(),'Edit')]")
    public WebElement Myappointments_Edit_Button;

    @FindBy(xpath = "//span[normalize-space()='Create or Edit an Appointment']")
    public WebElement Myappointments_Create_or_Edit_an_Appointment_Visible_Text;


    @FindBy(xpath = "//h2[@id='appointment-heading']")
    public WebElement Myappointment_Visible_appointment_Text;

    @FindBy(xpath = "(//td)[1]")
    public WebElement Myappointments_Visible_ID;

    @FindBy(xpath = "(//td)[2]")
    public WebElement Myappointments_Visible_StartDate;

    @FindBy(xpath = "(//td)[3]")
    public WebElement Myappointments_Visible_EndDate;


    @FindBy(xpath = "(//td)[4]")
    public WebElement Myaapointments_Visible_Status;

    @FindBy(xpath = "(//td)[11]")
    public WebElement Myaapointments_Visible_Physician;

    @FindBy(xpath = "(//td)[12]")
    public WebElement Myaapointments_Visible_Patient;

    @FindBy(xpath = "//select[@id='appointment-status']")
    public WebElement Myappointments_CEAPage_Status_Box;


    @FindBy(xpath = "//textarea[@id='appointment-anamnesis']")
    public WebElement Myappointments_Anamnesis_Box;

    @FindBy(xpath = "//textarea[@id='appointment-treatment']")
    public WebElement Myappointments_Treatment_Box;

    @FindBy(xpath = "//textarea[@id='appointment-diagnosis']")
    public WebElement Myappointments_Diagnosis_Box;

    @FindBy(xpath = "(//div[contains(text(),'This field is required.')])[1]")
    public WebElement Myappointments_VisibleText_AnamnesisError_message;

    @FindBy(xpath = "(//div[contains(text(),'This field is required.')])[2]")
    public WebElement Myappointments_VisibleText_TreatmentError_message;

    @FindBy(xpath = "(//div[contains(text(),'This field is required.')])[3]")
    public WebElement Myappointments_VisibleText_DiagnosisError_message;

    @FindBy(xpath = "//span[normalize-space()='Save']")
    public WebElement Myappointments_Save_Button;

    @FindBy(xpath = "//textarea[@id='appointment-prescription']")
    public WebElement Myapointments_Prescription_Box;

    @FindBy(xpath = "//textarea[@id='appointment-description']")
    public WebElement Myapointments_Description_Box;

    @FindBy(xpath = "//input[@id='appointment-id']")
    public WebElement Myappointments_CEAPage_ID_Box;






}
