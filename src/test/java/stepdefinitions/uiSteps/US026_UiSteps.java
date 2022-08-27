package stepdefinitions.uiSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.US026_Pages;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US026_UiSteps {

    US026_Pages us026_pages= new US026_Pages();

    @Then("User Contact a Tıklar")
    public void userContactATıklar() {
        us026_pages.Homepage_Contact_Button.click();

    }

    @And("User Message Box a ilerler")
    public void userMessageBoxAIlerler() {
        WebElement jsSendElement=us026_pages.Contact_Send_Button;
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", jsSendElement);
        
    }

    @And("User Zorunlu alan Name bilgisi girer")
    public void userZorunluAlanNameBilgisiGirer() {
        us026_pages.Contact_Name_Box.sendKeys(ConfigurationReader.getProperty("UserName"));
        
    }

    @And("User Zorunlu alan Mail bilgisi girer")
    public void userZorunluAlanMailBilgisiGirer() {
        us026_pages.Contact_Mail_Box.sendKeys(ConfigurationReader.getProperty("UserMail"));

        
    }

    @And("User Zorunlu alan Subject bilgisi girer")
    public void userZorunluAlanSubjectBilgisiGirer() {
        us026_pages.Contact_Subject_Box.sendKeys(ConfigurationReader.getProperty("UserSubject"));
        
    }

    @And("User Isterse Message bilgisi girebilir")
    public void userIsterseMessageBilgisiGirebilir() {
        us026_pages.Contact_Message_Box.sendKeys(ConfigurationReader.getProperty("UserMessage"));


        
    }

    @And("User Send e Tıklar ve message gonderir")
    public void userSendETıklarVeMessageGonderir() throws InterruptedException {
        WebElement jsSendElement=us026_pages.Contact_Send_Button;
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", jsSendElement);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", jsSendElement);
        Thread.sleep(2000);
        
    }

    @Then("User Your message has been received yazisini dogrulamali")
    public void userYourMessageHasBeenReceivedYazisiniDogrulamali() {
        Assert.assertTrue(us026_pages.Contact_Message_Sended_Visible_Text.isDisplayed());
        
    }

    @And("User Contact Sayfasini dogrular")
    public void userContactSayfasiniDogrular() {
        Assert.assertTrue(us026_pages.Contact_Contact_Visible_Text.isDisplayed());
    }
}
