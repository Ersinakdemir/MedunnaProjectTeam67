package stepdefinitions.uiSteps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.US09_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US09_UiSteps {

    US09_Page us09_page =new US09_Page();
    @Given("{string} sayfasina gidilir")
    public void sayfasina_gidilir(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
    }
    @When("Sing in segmesinden Staff olarak baglanilir")
    public void sing_in_segmesinden_staff_olarak_baglanilir() {
        us09_page.accountMenu.click();
        us09_page.singIn.click();
        us09_page.userNameBox.sendKeys("StaffMurat44");
        us09_page.parolaBox.sendKeys("123qscaA...");
        us09_page.singInButton.click();
    }
    @Then("My Pages sekmesine tiklanip")
    public void my_pages_sekmesine_tiklanip() {
        us09_page.myPages.click();
    }

    @Then("In Patient e tiklanir")
    public void in_patient_e_tiklanir() {
        us09_page.inPatient.click();
    }

    @Then("Gidilen sayfada Hasta bilgilerinin Görünür oldugu nu test eder")
    public void gidilen_sayfada_hasta_bilgilerinin_görünür_oldugu_nu_test_eder() {
        Assert.assertTrue(us09_page.patientDatenList.size()>0);
    }
    @Then("Gidilen sayfada bir Patient in edit kismina tiklanir")
    public void gidilen_sayfada_bir_patient_in_edit_kismina_tiklanir() {
        us09_page.patientEditList.get(2).click();
    }
    @Then("id, firstname, lastname, birthdate, email, phone, gender, blood group,address, description, user, country and state\\/city bilgiler güncellenir ve kaydedilir")
    public void id_firstname_lastname_birthdate_email_phone_gender_blood_group_address_description_user_country_and_state_city_bilgiler_güncellenir_ve_kaydedilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Save tiklanarak yapilan degisiklikler kaydedilir")
    public void save_tiklanarak_yapilan_degisiklikler_kaydedilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Kayit dan sonra gelen sayfada degisikliklerin kaydedilip kaydedilmedigi test edilir")
    public void kayit_dan_sonra_gelen_sayfada_degisikliklerin_kaydedilip_kaydedilmedigi_test_edilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
