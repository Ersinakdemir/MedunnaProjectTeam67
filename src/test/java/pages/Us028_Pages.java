package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Us028_Pages {

    public Us028_Pages() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//*[text()='Items&Titles'])[1]")
    public WebElement itemTitles;

    @FindBy(xpath = "(//*[text()='Country'])[1]")
    public WebElement country;

    @FindBy(xpath = "(//*[text()='Create a new Country'])[1]")
    public WebElement creatCountry;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameCountr;

    @FindBy(xpath = "//input[@name='createdDate']")
    public WebElement dateCountry;

    @FindBy(xpath = "(//*[text()='Save'])[1]")
    public WebElement saveCountry;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement actualDataMsjCountry;

    @FindBy(xpath = "(//*[text()='State/City'])[1]")
    public WebElement statdeCty;

    @FindBy(xpath = "(//*[text()='Create a new State/City'])[1]")
    public WebElement creatStatCty;


    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameStatCty;

    @FindBy(xpath = "//input[@name='createdDate']")
    public WebElement dateStatctry;

    @FindBy(xpath = "//select[@name='state.id']")
    public WebElement statCty;

    @FindBy(xpath = "(//*[text()='Save'])[1]")
    public WebElement saveStatCty;

    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--error toastify-toast']")
    public WebElement actualDataMsjStatCty;



}
