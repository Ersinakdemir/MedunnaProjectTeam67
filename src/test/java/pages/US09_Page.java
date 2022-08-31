package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US09_Page  {
    public US09_Page (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy (id = "login-item")
    public  WebElement singIn;

    @FindBy(xpath = "//input[@name='username']")    //      //*[@id="username"]
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement parolaBox;

    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[2]")
    public WebElement singInButton;

    @FindBy (xpath = "//*[@id=\"entity-menu\"]/a")
    public WebElement myPages;

    @FindBy (xpath = "//*[@id=\"entity-menu\"]/div/a[2]")
    public WebElement inPatient;

    @FindBy (xpath = "//*[@id=\"entity-menu\"]/div/a[1]")
    public WebElement searchPatient;

    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr")
    public List<WebElement> patientDatenList;

    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr/td/div")
    public List<WebElement> patientEditList;

    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[2]/div/table/tbody/tr[2]/td[16]/div/a[2]")
    public WebElement editikinciSira;

    @FindBy(xpath = "//input[@id='patient-firstName']")
    public WebElement firstNameEdit;

    @FindBy (name = "user.id")
    public WebElement userDropdown;

    @FindBy (id = "save-entity")
    public WebElement saveEntity;

    @FindBy (xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]")
    public WebElement updateerfolg;
}
