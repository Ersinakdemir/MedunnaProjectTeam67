package stepdefinitions.uiSteps;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US010_Pages;
import utilities.ConfigurationReader;
import utilities.DateUtils;
import utilities.Driver;

public class US010_UiSteps {

    US010_Pages us010_pages = new US010_Pages();

    @Given("Doktor Medunna url Anasayfasina gider")
    public void doktorMedunnaUrlAnasayfasinaGider() {


        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));


    }

    @Then("Doktor Dopdown menüyü Tıklar")
    public void doktorDopdownMenüyüTıklar() {
        us010_pages.Homepage_Dropdownmenu_Button.click();


    }

    @And("Doktor Signs in Butonuna Tıklar")
    public void doktorSignsInButonunaTıklar() {
        us010_pages.Homepage_Singin_Button.click();

    }

    @And("Doktor Username ve Password girer ve Sİng in Butona Tıklar")
    public void doktorUsernameVePasswordGirerVeSİngInButonaTıklar() throws InterruptedException {
        us010_pages.Singin_Username_Box.sendKeys(ConfigurationReader.getProperty("usernamedoktor"));
        us010_pages.Singin_Password_Box.sendKeys(ConfigurationReader.getProperty("passworddoktor"));
        us010_pages.Singin_Singin_Button.click();
        Thread.sleep(2000);

    }

    @And("Doctor başarılı giriş yaptığını dogrular")
    public void doctorBaşarılıGirişYaptığınıDogrular() {


        Assert.assertTrue(us010_pages.MYPAGES_Button.isDisplayed());

    }

    @And("Doktor MYPAGES ve Appointments ButtonaTıklar")
    public void doktorMYPAGESVeAppointmentsButtonaTıklar() throws InterruptedException {
        us010_pages.MYPAGES_Button.click();
        us010_pages.MyAppointments_Button.click();
        Thread.sleep(1000);

    }

    @And("Doctor Appointments  listesini ve tarih listesini gorunurlugunu dogrular")
    public void doctorAppointmentsListesiniVeTarihListesiniGorunurlugunuDogrular() {


        Assert.assertTrue(us010_pages.MyAppointmens_ID_visible_text.isDisplayed());
        Assert.assertTrue(us010_pages.MyAppointmens_StartDateTime_visible_text.isDisplayed());
        Assert.assertTrue(us010_pages.MyAppointmens_EndDateTime_visible_text.isDisplayed());
        Assert.assertTrue(us010_pages.MyAppointmens_Status_visible_text.isDisplayed());


    }

}