package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US001_PageZ {
    public US001_PageZ() {
        PageFactory.initElements(Driver.getDriver(), this);    }

    @FindBy(xpath = "//*[text()='Your SSN is required.']")
    public WebElement yourSSNisRequiredYazisi;

    @FindBy(xpath = "//*[text()='Your FirstName is required.']")
    public WebElement yourFirstNameisRequiredYazisi;

    @FindBy(xpath = "//*[text()='Your LastName is required.']")
    public WebElement yourLastNameisRequiredYazisi;

    @FindBy(xpath = "//*[@id='register-submit']")
    public WebElement registerButonu;








}
