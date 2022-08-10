package stepdefinitions.uiSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.US012_Pages;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        Driver.clickWithJS(pages.signIn_boutton);
    }

    @Then("Cikan sayfadan My Pages basligini tiklar")
    public void cikan_sayfadan_my_pages_basligini_tiklar() {


        pages.myPage.click();
    }

    @Then("Kullanici My Appointments sekmesini tiklayarak rendevu sayfasina gecis yapar")
    public void kullanici_my_appointments_sekmesini_tiklayarak_rendevu_sayfasina_gecis_yapar() {

        Driver.wait(3);
        pages.myAppointments.click();

    }

    @Then("Kullanici  Edit buttonuna tiklar")
    public void kullanici_edit_buttonuna_tiklar() {
        Driver.wait(3);
        pages.Edit.click();


    }

    @Then("Kullanici Acilan pencerede Request A Test butonu tiklayarak test istenilebliriligi test eder")
    public void kullanici_acilan_pencerede_request_a_test_butonu_tiklayarak_est_istenilebliriligi_test_eder() {
        Driver.wait(3);
        pages.requestATest.click();
        String expectedmsj = "Test Items";
        String actualmsj = pages.testItemsTextVisible.getText();
        assertEquals(expectedmsj, actualmsj);

    }

    @Then("Kullanici Acilan pencerede Request A Test butonu tiklar")
    public void kullanici_acilan_pencerede_request_a_test_butonu_tiklar() {
        Driver.wait(3);
        pages.requestATest.click();
    }

    @Then("Acilan listede  Glucose testinin bulundugunu kontrol eder")
    public void acilan_listede_glucose_testinin_bulundugunu_kontrol_eder() {
        Driver.wait(3);
        Assert.assertTrue(pages.testList.stream().anyMatch(t->t.getText().contains("Glucose")));



    }

    @Then("Listede Glucose testinin secilebilirligini test eder")
    public void listede_glucose_testinin_secilebilirligini_test_eder() {
        Driver.wait(3);
        Driver.clickWithJS(pages.glucoseTest);
        Assert.assertTrue(pages.glucoseTest.isSelected());
        Driver.clickWithJS(pages.saveButton);

    }

    @Then("Acilan listede  Urea testinin bulundugunu kontrol eder")
    public void acilan_listede_urea_testinin_bulundugunu_kontrol_eder() {
        Driver.wait(3);
        Assert.assertTrue(pages.testList.stream().anyMatch(t->t.getText().contains("Urea")));


    }
    @Then("Listede Urea testinin secilebilirligini test eder")
    public void listede_urea_testinin_secilebilirligini_test_eder() {
        Driver.wait(3);
        Driver.clickWithJS(pages.ureaTest);
        Assert.assertTrue(pages.ureaTest.isSelected());
        Driver.clickWithJS(pages.saveButton);

    }
    @Then("Acilan listede  Creatinine testinin bulundugunu kontrol eder")
    public void acilan_listede_creatinine_testinin_bulundugunu_kontrol_eder() {
        Assert.assertTrue(pages.testList.stream().anyMatch(t->t.getText().contains("Creatinine")));

    }
    @Then("Listede Creatinine testinin secilebilirligini test eder")
    public void listede_creatinine_testinin_secilebilirligini_test_eder() {
        Driver.clickWithJS(pages.creatinineTes);
        Assert.assertTrue(pages.creatinineTes.isSelected());
        Driver.clickWithJS(pages.saveButton);
    }

    @Then("Acilan listede   Sodium testinin bulundugunu kontrol eder")
    public void acilan_listede_sodium_potassium_testinin_bulundugunu_kontrol_eder() {
        Assert.assertTrue(pages.testList.stream().anyMatch(t->t.getText().contains("Sodium")));
    }
    @Then("Listede Sodium testinin secilebilirligini test eder")
    public void listede_sodium_potassium_testinin_secilebilirligini_test_eder() {
        Driver.clickWithJS(pages.sodiumTest);
        Assert.assertTrue(pages.sodiumTest.isSelected());
        Driver.clickWithJS(pages.saveButton);
    }
    @Then("Acilan listede  Total protein testinin bulundugunu kontrol eder")
    public void acilan_listede_total_protein_testinin_bulundugunu_kontrol_eder() {
        Assert.assertTrue(pages.testList.stream().anyMatch(t->t.getText().contains("Total protein")));
    }
    @Then("Listede Total protein testinin secilebilirligini test eder")
    public void listede_total_protein_testinin_secilebilirligini_test_eder() {
        Driver.clickWithJS(pages.totalproteinTest);
        Assert.assertTrue(pages.totalproteinTest.isSelected());
        Driver.clickWithJS(pages.saveButton);
    }
    @Then("Acilan listede  Albumin testinin bulundugunu kontrol eder")
    public void acilan_listede_albumin_testinin_bulundugunu_kontrol_eder() {
        Assert.assertTrue(pages.testList.stream().anyMatch(t->t.getText().contains("Albumin")));
    }
    @Then("Listede Albumin testinin secilebilirligini test eder")
    public void listede_albumin_testinin_secilebilirligini_test_eder() {
        Driver.clickWithJS(pages.albuminTest);
        Assert.assertTrue(pages.albuminTest.isSelected());
        Driver.clickWithJS(pages.saveButton);
    }
    @Then("Acilan listede  Hemoglobin testinin bulundugunu kontrol eder")
    public void acilan_listede_hemoglobin_testinin_bulundugunu_kontrol_eder() {
        Assert.assertTrue(pages.testList.stream().anyMatch(t->t.getText().contains("Hemoglobin")));
    }
    @Then("Listede Hemoglobin testinin secilebilirligini test eder")
    public void listede_hemoglobin_testinin_secilebilirligini_test_eder() {
        Driver.clickWithJS(pages.hemoglobinTest);
        Assert.assertTrue(pages.hemoglobinTest.isSelected());
        Driver.clickWithJS(pages.saveButton);
    }

    @Then("Acilan listede  Potassium testinin bulundugunu kontrol eder")
    public void acilan_listede_potassium_testinin_bulundugunu_kontrol_eder() {
        Assert.assertTrue(pages.testList.stream().anyMatch(t->t.getText().contains("Potassium")));
    }
    @Then("Listede Potassium testinin secilebilirligini test eder")
    public void listede_potassium_testinin_secilebilirligini_test_eder() {
        Driver.clickWithJS(pages.sodiumTest);
        Assert.assertTrue(pages.sodiumTest.isSelected());
        Driver.clickWithJS(pages.saveButton);
    }



}
