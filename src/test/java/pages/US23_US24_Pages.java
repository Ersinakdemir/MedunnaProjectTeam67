package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US23_US24_Pages {

    public US23_US24_Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(xpath = "//*[@id=\"account-menu\"]/a/svg\n")
        public WebElement people_simge;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signInButton;

  //  @FindBy(xpath = "//*[@id="username"]")
    @FindBy(xpath = "//input[@name='username']")
    public WebElement username_box;


    //@FindBy(xpath ="//*[@id="password"]")
    @FindBy(xpath = "//input[@name='password']")
            public WebElement password_box;


    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[2]/span")
            public WebElement sign_in_button_2;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a/span")
            public WebElement My_Pages_button;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement Search_Patient_button;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[1]/div[2]/input")
    public WebElement Patient_SSS_Box;






}




