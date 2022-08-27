package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US026_Pages {

    public US026_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//span[normalize-space()='CONTACT']")
    public WebElement Homepage_Contact_Button;

    @FindBy(xpath = "//h2[normalize-space()='Contact']")
    public WebElement Contact_Contact_Visible_Text;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement Contact_Name_Box;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement Contact_Mail_Box;

    @FindBy(xpath = "//input[@id='subject']")
    public WebElement Contact_Subject_Box;

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement Contact_Message_Box;

    @FindBy(xpath = "//span[normalize-space()='Send']")
    public WebElement Contact_Send_Button;

    @FindBy(xpath = "//strong[normalize-space()='Your message has been received']")
    public WebElement Contact_Message_Sended_Visible_Text;


}
