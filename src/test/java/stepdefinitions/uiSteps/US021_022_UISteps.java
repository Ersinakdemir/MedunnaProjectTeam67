package stepdefinitions.uiSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US006_Page;
import pages.US021_022;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US021_022_UISteps {

    US021_022 pages = new US021_022();
    US006_Page pages06 = new US006_Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici staff olarak username girer")
    public void kullanici_staff_olarak_username_girer() {
        pages06.usernameKutusu.sendKeys("StaffMurat44");

    }

    @Given("MyPages dropdrowna tiklar")
    public void my_pages_dropdrowna_tiklar() {
        pages.myPages.click();
    }

    @Given("Search Patient tiklar")
    public void search_patient_tiklar() {
        pages.searchPatient.click();
    }

    @Given("Patient SSN kismina patient SSN girer")
    public void patient_ssn_kismina_patient_ssn_girer() {
        pages.SSN.sendKeys("899-99-9955");

    }

    @Given("Patient bilgilerinin gorulebildigini test eder")
    public void patient_bilgilerinin_gorulebildigini_test_eder() {
        Driver.wait(2);
        Assert.assertTrue(pages.patientSSN.isDisplayed());


    }

    @Given("Show appointments butonuna tiklar")
    public void show_appointments_butonuna_tiklar() {
        pages.showAppointments.click();
    }

    @Then("Appointmenti duzenlemek icin edit butonuna basar")
    public void appointmenti_duzenlemek_icin_edit_butonuna_basar() {
        pages.appointmentsEdit.click();
    }

    @Then("Appointment duzenleme sayfasinda oldugunu test eder")
    public void appointment_duzenleme_sayfasinda_oldugunu_test_eder() {
        pages.appointmentsEdit.isDisplayed();
    }

    @Then("Status acilir penceresine tiklanir")
    public void status_acilir_penceresine_tiklanir() {
        pages.statusButonu.click();
    }

    @Then("menude UNAPPROVED, PENDING veya CANCELLED opsiyonlarinin aktif oldugunu test eder")
    public void menude_unapproved_pendıng_veya_cancelled_opsiyonlarinin_aktif_oldugunu_test_eder() {
        Assert.assertTrue(pages.unapproved.isEnabled());
        Assert.assertTrue(pages.pending.isEnabled());
        Assert.assertTrue(pages.cancelled.isEnabled());
    }

    @Then("menude COMPLETED opsiyonunun aktif olmadigini test eder")
    public void menude_completed_opsiyonunun_aktif_olmadigini_test_eder() {
        Assert.assertFalse(pages.completed.isEnabled());
    }

    @Then("Anamnesis, Treatment veya Diagnosis bolumlerine girilemedigini test eder")
    public void anamnesis_treatment_veya_diagnosis_bolumlerinin_bos_birakildigini_test_eder() {
        pages.anamnesis.clear();
        pages.anamnesis.sendKeys("hasta cook");
        pages.treatment.clear();
        pages.treatment.sendKeys("yatarak tedavi olmasi gerek");
        pages.diagnosis.clear();
        pages.diagnosis.sendKeys("VEREM");
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(Keys.ENTER);
        actions.perform();

        Assert.assertFalse(pages.updateYazisi.isDisplayed());
    }

    @Then("Hasta icin bir doktor secer")
    public void hasta_icin_bir_doktor_secebilecgini_test_eder() {

        Select select = new Select((pages.physician));
        select.selectByValue("164034");
        pages.physician.sendKeys(Keys.TAB);
        pages.physician.sendKeys(Keys.TAB);

        Driver.wait(5);
    }

    @Then("save butonu basar ve doktor secilebildigini test eder")
    public void save_butonu_basar() {

        pages.physicianSaveButonu.click();
        Assert.assertTrue(pages.theAppointmentIsUpdatedYazisi.isDisplayed());
    }

    @Then("Show tests butonuna tiklar")
    public void show_tests_butonuna_tiklar() {
        pages.showTestsButonu.click();

    }

    @Then("View Results butonuna tiklar")
    public void view_results_butonuna_tiklar() {
        pages.viewResultsButonu.click();

    }

    @Then("secilen test icin edit butonuna tiklar")
    public void secilen_test_icin_edit_butonuna_tiklar() {
        pages.editButonu.click();

    }

    @Then("Test sonuclari sayfasinda oldugunu test eder")
    public void test_sonuclarinin_gorundugunu_test_eder() {
        Assert.assertTrue(pages.testsResultsYazisi.isDisplayed());

    }

    @Then("Test sonucunun duzenlenebilecgini test eder")
    public void test_sonucunun_duzenlenebilecgini_test_eder() {
        pages.resultBox.sendKeys("pozitive");
        pages.descriptionBox.sendKeys("dikkatli olmalisin");
        pages.saveButtonTestResult.click();

        Assert.assertTrue(pages.updateYazisi.isDisplayed());


    }


}
