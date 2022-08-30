package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US018_Page {
    {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[1]")
    public WebElement viewButton;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement editButton;

    @FindBy(xpath = "//select[@name='speciality']")
    public WebElement selectSpeciality;

    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[contains(text(),'User found with search SSN')]")
    public WebElement userFoundWithSearchSSN;

    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement itemsTitelsDropdown;

    @FindBy(xpath = "//a[@class='dropdown-item']//span[text()='Physician']")
    public WebElement physicianDropdown;

    @FindBy(xpath = "//h2[@id='physician-heading']")
    public WebElement phyisiciansHeader;

    @FindBy(xpath = "//a[@class='btn btn-primary float-right jh-create-entity']")
    public WebElement createNewPhysician;

    @FindBy(xpath = "//span[text()='Create or edit a Physician']")
    public WebElement createOrEditPhysician;

    @FindBy(xpath = "//input[@placeholder='000-00-0000']")
    public WebElement inputSNNTextbox;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchUserButton;


    @FindBy(id = "useSSNSearch")
    public WebElement useSSNSearchceckbox;

    @FindBy(id = "physician-heading")
    public WebElement PhysiciansPageHeader;

    @FindBy(id = "physician-examFee")
    public WebElement examFeeInput;

    @FindBy(xpath = "//select[@name='bloodGroup']")
    public WebElement bloodGroup;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement description;


    @FindBy(xpath = "//input[@id='file_image']")
    public WebElement chooseFile;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(id = "jhi-confirm-delete-physician")
    public WebElement deletePhyisician;

    @FindBy(id = "app-view-container")
    public WebElement physicianUpdatedMessage;

    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement dropDownmenu;

    @FindBy(xpath = "//img[@alt='Logo']")
    public WebElement mainPageLogo;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement signIn;

    @FindBy(xpath = "//div[@id='login-title']")
    public WebElement signInHeader;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userNameInputBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//span[text()='Sign out']")
    public WebElement signOut;

    @FindBy(id = "rememberMe")
    public WebElement rememberMeCheckbox;

    @FindBy(xpath = " //span[text()='Did you forget your password?']")
    public WebElement didYouForgetYourPassword;

    @FindBy(xpath = "//span[text()='Cemile Turkmen']")
    public WebElement accountName;

    @FindBy(xpath = "//span[text()='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement resetYourPasswordButton;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInputBox;

    @FindBy(xpath = "//*[contains(text(),'Check your email for details on how to reset your password.')]")
    public WebElement container;
    @FindBy(xpath = "//div[text()='Check your emails for details on how to reset your password.']")
    public WebElement toaster;

    @FindBy(xpath = "//strong[text()='Failed to sign in!']")
    public WebElement failedToSignIn;

    @FindBy(xpath = "//span[text()='Register a new account']")
    public WebElement registerNewAccount;

    @FindBy(xpath = "//span[text()='Reset your password']")
    public WebElement resetYourPasswordHeader;

    @FindBy(xpath = "//span[text()='Registration']")
    public WebElement registrationPage;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement containerDidYouForget;
}
