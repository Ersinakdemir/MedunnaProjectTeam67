package stepdefinitions.uiSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.US025_Pages;
import utilities.ConfigurationReader;
import utilities.DateUtils;
import utilities.Driver;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;



public class US025_UiSteps<DateTime> {


    US025_Pages us025_pages=new US025_Pages();


        @Given("Hasta Medunna url Anasayfasina gider")
        public void hasta_medunna_url_anasayfasina_gider() {
            Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
           
        }


    @Then("Hasta Dopdown menüyü Tıklar")
    public void hastaDopdownMenüyüTıklar() {


        us025_pages.Homepage_Dropdownmenu_Button.click();
    }

    @And("Hasta Signs in Butonuna Tıklar")
    public void hastaSignsInButonunaTıklar() {
            us025_pages.Homepage_Singin_Button.click();
        
    }

    @And("Hasta Username ve Password girer ve Sİng in Butona Tıklar")
    public void hastaUsernameVePasswordGirerVeSİngInButonaTıklar() {
            us025_pages.Singin_Username_Box.sendKeys(ConfigurationReader.getProperty("PatientUsername"));
            us025_pages.Singin_Password_Box.sendKeys(ConfigurationReader.getProperty("PatientPassword"));
            us025_pages.Singin_Singin_Button.click();


        
    }

    @And("Hasta başarılı giriş yaptığını dogrular")
    public void hastaBaşarılıGirişYaptığınıDogrular() {

            Driver.wait(3);

        Assert.assertTrue(us025_pages.MYPAGES_Button.isDisplayed());
        
    }

    @And("Hasta MYPAGES ve devaminda Make Appointment ButtonaTıklar")
    public void hastaMYPAGESVeDevamindaMakeAppointmentButtonaTıklar() {
            us025_pages.MYPAGES_Button.click();
            us025_pages.Make_an_Appointment_Button.click();
            Driver.wait(3);
        
    }

    @And("Hasta Make an Appointment Sayfasinda oldugunu ve  gorunurlugunu dogrular")
    public void hastaMakeAnAppointmentSayfasindaOldugunuVeGorunurlugunuDogrular() {
            Assert.assertTrue(us025_pages.Make_an_Appointment_Visible_Text.isDisplayed());

    }

    @Given("Hasta First Name girer")
    public void hastaFirstNameGirer() {
            us025_pages.Make_an_Appointment_Firstname_Box.sendKeys(Keys.CONTROL+"a"+Keys.CLEAR);
            us025_pages.Make_an_Appointment_Firstname_Box.sendKeys(ConfigurationReader.getProperty("PatientFirstName"));
        
    }

    @Then("Hasta Last Name girer")
    public void hastaLastNameGirer() {
        us025_pages.Make_an_Appointment_Lastname_Box.sendKeys(Keys.CONTROL+"a"+Keys.CLEAR);
        us025_pages.Make_an_Appointment_Lastname_Box.sendKeys(ConfigurationReader.getProperty("PatientLastName"));

        
    }

    @And("Hasta SSN Bilgisini girer")
    public void hastaSSNBilgisiniGirer() {
        us025_pages.Make_an_Appointment_SSN_Box.sendKeys(Keys.CONTROL+"a"+Keys.CLEAR);
        us025_pages.Make_an_Appointment_SSN_Box.sendKeys(ConfigurationReader.getProperty("PatientSSNumber"));
        
    }

    @And("Hasta E mail bilgisini girer")
    public void hastaEMailBilgisiniGirer() {
        us025_pages.Make_an_Appointment_email_Box.sendKeys(Keys.CONTROL+"a"+Keys.CLEAR);
        us025_pages.Make_an_Appointment_email_Box.sendKeys(ConfigurationReader.getProperty("Patientemail"));
    }

    @And("Hasta Phone bilgisini girer")
    public void hastaPhoneBilgisiniGirer() throws InterruptedException {
        us025_pages.Make_an_Appointment_Phone_Box.sendKeys(Keys.CONTROL+"a"+Keys.CLEAR);
        us025_pages.Make_an_Appointment_Phone_Box.sendKeys(ConfigurationReader.getProperty("PatientPhoneNumber"));

        Thread.sleep(5000);
        
    }

    @And("Hasta Appointment DateTime 5 gun sonras icin girer")
    public void hastaAppointmentDateTimeGirer() throws InterruptedException {




    }

    @And("Hasta Send an Appointment Request Butonunu Tiklar")
    public void hastaSendAnAppointmentRequestButonunuTiklar() {
        
    }

    @And("Hasta Randevusunun basarili bir sekilde olustunu dogrular")
    public void hastaRandevusununBasariliBirSekildeOlustunuDogrular() {
    }

    @And("Hasta Appointment DateTime {int} gun sonrası icin girer")
    public void hastaAppointmentDateTimeGunSonrasıIcinGirer(int arg0) throws InterruptedException, ParseException {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDateTime dateTimeNow = LocalDateTime.now();
        LocalDateTime dateTimePlus = LocalDateTime.now().plusDays(1);
        LocalDateTime dateTimeSubstruct = LocalDateTime.now().plusDays(-1);

        String dateTimeNow_FormattedString = dateTimeNow.format(dateFormat);
        String dateTimePlus_FormattedString = dateTimePlus.format(dateFormat);
        String dateTimeSubstruct_FormattedString = dateTimeSubstruct.format(dateFormat);

        System.out.println("dateTimeNow : " + dateTimeNow_FormattedString);
        System.out.println("dateTimePlus : " + dateTimePlus_FormattedString);
        System.out.println("dateTimeSubstruct : " + dateTimeSubstruct_FormattedString);
        us025_pages.Make_an_Appointment_DateTime_Box.sendKeys(dateTimeSubstruct_FormattedString);

        Thread.sleep(5000);
    }
}

