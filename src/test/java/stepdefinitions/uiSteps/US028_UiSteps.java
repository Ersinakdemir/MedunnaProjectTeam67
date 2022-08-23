package stepdefinitions.uiSteps;

import io.cucumber.java.en.*;
import org.bouncycastle.util.test.FixedSecureRandom;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.Us028_Pages;
import utilities.DateUtils;

public class US028_UiSteps {
    Us028_Pages page = new Us028_Pages();

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


    @When("Isim textbox una eklenecek eyaletin ismini girer")
    public void isim_textbox_una_eklenecek_eyaletin_ismini_girer() {
        page.nameStatCty.sendKeys("Magoudichaux");//expectade data ajoute  dans jira

    }

    @When("Eyaletin eklenecegi ulkeyi secer")
    public void eyaletin_eklenecegi_ulkeyi_secer() {
        Select selec = new Select(page.statCty);
        selec.selectByVisibleText("SOMALIY");

    }

    @Then("Save tusuna basarak eyaletin eklendigini test eder")
    public void save_tusuna_basarak_eyaletin_eklendigini_test_eder() {
        page.saveStatCty.click();

    }


    @And("Acilan menuden States-Cities secenegini tiklar")
    public void acilanMenudenStatesCitiesSeceneginiTiklar() {
        page.statdeCty.click();
    }

    @And("Acilan pencereden Create or edit a State-City butonuna tiklar")
    public void acilanPenceredenCreateOrEditAStateCityButonunaTiklar() {
        page.creatStatCty.click();
    }

    @Then("Save tusuna basarak eyaletin eklenmedigini test eder")
    public void saveTusunaBasarakEyaletinEklenmediginiTestEder() {
        page.saveStatCty.click();
        Assert.assertFalse(page.actualDataMsjStatCty.isDisplayed());
    }
}
