package stepdefinitions.uiSteps;

import io.cucumber.java.en.*;
import org.bouncycastle.util.test.FixedSecureRandom;
import org.junit.Assert;
import pages.Us028_Pages;
import utilities.DateUtils;

public class US028_UiSteps {
    Us028_Pages page=new Us028_Pages();

    @When("Items&Titles botonunu tiklar")
    public void items_titles_botonunu_tiklar() {

        page.itemTitles.click();
    }
    @When("Acilan menuden Countries secenegini tiklar")
    public void acilan_menuden_countries_secenegini_tiklar() {
        page.country.click();

    }
    @When("Acilan pencereden Create or edit a Country butonuna tiklar")
    public void acilan_pencereden_create_or_edit_a_country_butonuna_tiklar() {
        page.creatCountry.click();

    }
    @When("isim textbox una eklenecek ulkenin ismini girer")
    public void isim_textbox_una_eklenecek_ulkenin_ismini_girer() {

        page.nameCountr.sendKeys("SOMALIY");
    }
    @When("Gecerli bir tarih girer")
    public void gecerli_bir_tarih_girer() {
        DateUtils.getDate();
        page.dateCountry.sendKeys(DateUtils.getDate());

    }
    @Then("Save tusuna basarak ulkenin eklendigini test eder")
    public void save_tusuna_basarak_ulkenin_eklendigini_test_eder() {
        page.saveCountry.click();
        Assert.assertTrue(page.actualDataMsjCountry.isDisplayed());

    }

    @And("Gecersiz bir tarih girer")
    public void gecersizBirTarihGirer() {
        page.dateCountry.sendKeys("01/01/1900");

    }

    @Then("Save tusuna basarak ulkenin eklenmedigini test eder")
    public void saveTusunaBasarakUlkeninEklenmediginiTestEder() {
        page.saveCountry.click();
        Assert.assertFalse(page.actualDataMsjCountry.isDisplayed());
    }
}
