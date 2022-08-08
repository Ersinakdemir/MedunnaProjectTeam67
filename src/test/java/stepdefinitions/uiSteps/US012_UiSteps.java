package stepdefinitions.uiSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.US012_Pages;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US012_UiSteps {

    US012_Pages pages = new US012_Pages();


    @Given("Kullanici  Medunna sayfasina gider")
    public void kullanici_medunna_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
    }
    @Then("Kullanici  giris simgesini tiklar")
    public void kullanici_giris_simgesini_tiklar() {

        pages.signeIn.click();
    }
    @Then("Kullanici  acilan menuden sign in i tiklar")
    public void kullanici_acilan_menuden_sign_in_i_tiklar() {
        pages.login.click();

    }
    @Then("Kullanici  Kullanici ismini girer")
    public void kullanici_kullanici_ismini_girer() {
        pages.userName.sendKeys("doktor67");
    }
    @Then("Kullanici  Kullanici sifresini girer")
    public void kullanici_kullanici_sifresini_girer() {
        pages.password.sendKeys("Doktor67");
    }
    @Then("Kullanici  sign in i butonunu tiklayarak kullanici sayfasina baglanir")
    public void kullanici_sign_in_i_butonunu_tiklayarak_kullanici_sayfasina_baglanir() {
        pages.signIn_boutton.click();
    }
    @Then("Cikan sayfadan My Pages basligini tiklar")
    public void cikan_sayfadan_my_pages_basligini_tiklar() {
        pages.myPages.click();
    }
    @Then("Kullanici My Appointments sekmesini tiklayarak rendevu sayfasina gecis yapar")
    public void kullanici_my_appointments_sekmesini_tiklayarak_rendevu_sayfasina_gecis_yapar() {
        pages.myAppointments.click();

    }
    @Then("Kullanici  Edit buttonuna tiklar")
    public void kullanici_edit_buttonuna_tiklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Kullanici Acilan pencerede Request A Test butonu tiklayarak est istenilebliriligi test eder")
    public void kullanici_acilan_pencerede_request_a_test_butonu_tiklayarak_est_istenilebliriligi_test_eder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
