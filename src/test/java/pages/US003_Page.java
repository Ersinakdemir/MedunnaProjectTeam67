package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US003_Page {

    @FindBy(xpath = "(//*[.='Register'])[1]")
    public WebElement accountMenuRegisterButton;

    @FindBy(id = "firstPassword")
    public WebElement registerPagePasswordBox;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement passwordStrength1;

    @FindBy(xpath = "(//li[@style='background-color: rgb(255, 153, 0);'])[2]")
    public WebElement passwordStrength2;

    @FindBy(xpath = "(//li[@style='background-color: rgb(153, 255, 0);'])[4]")
    public WebElement passwordStrength4;

    @FindBy(xpath = "(//li[@style='background-color: rgb(0, 255, 0);'])[5]")
    public WebElement passwordStrength5;

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement humanIcon;


}
