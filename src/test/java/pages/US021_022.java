package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US021_022 {
    public US021_022 (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a")
    public WebElement myPages;

    @FindBy (xpath = "//*[@id=\"entity-menu\"]/div/a[1]")
    public WebElement searchPatient;

    @FindBy(xpath = "//input[@name=\"ssn\"]")
    public WebElement SSN;

    @FindBy(xpath="(//a[@class='btn btn-warning btn-sm'])[1]")
    public WebElement showAppointments;

    @FindBy(xpath="(//a[@class='btn btn-warning btn-sm'])[1]")
    public WebElement appointmentsEdit;

    @FindBy(xpath="//select[@id='appointment-status']")
    public WebElement statusButonu;

    @FindBy(xpath="//option[@value='UNAPPROVED']")
    public WebElement unapproved;

    @FindBy(xpath="//option[@value='PENDING']")
    public WebElement pending;

    @FindBy(xpath="//option[@value='CANCELLED']")
    public WebElement cancelled;

    @FindBy(xpath="//option[@value='COMPLETED']")
    public WebElement completed;

    @FindBy(xpath="//textarea[@id='appointment-anamnesis']")
    public WebElement anamnesis;

    @FindBy(xpath="//textarea[@id='appointment-treatment']")
    public WebElement treatment;

    @FindBy(xpath="//textarea[@id='appointment-diagnosis']")
    public WebElement diagnosis;

    @FindBy (id = "save-entity")
    public WebElement saveButonuAppointment;

    @FindBy(xpath="//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement updateYazisi;

    @FindBy (xpath="//select[@name='physician.id']")
    public WebElement physician;

    @FindBy (xpath="//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement theAppointmentIsUpdatedYazisi;

    @FindBy (xpath="//button[@type='submit']")
    public WebElement physicianSaveButonu;

    @FindBy (xpath="(//*[text()='Show Tests'])[1]")
    public WebElement showTestsButonu;

    @FindBy (xpath="//*[text()='Test Results']")
    public WebElement testsResultsYazisi;

    @FindBy (xpath="//a[@class='btn btn-info btn-sm']")
    public WebElement viewResultsButonu;

    @FindBy (xpath="//*[text()='Edit']")
    public WebElement editButonu;

    @FindBy (xpath="//td[contains(text(),'899-99-9955')]")
    public WebElement patientSSN;

    @FindBy (xpath="//input[@name='result']")
    public WebElement resultBox;

    @FindBy (xpath="//input[@name='description']")
    public WebElement descriptionBox;

    @FindBy (xpath="//*[text()='Save']")
    public WebElement saveButtonTestResult;







}
