package stepdefinitions.uiSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US006_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US006_UISteps {

    US006_Page pages = new US006_Page();

    @Given("Kullanici medunna ana sayfasina gider")
    public void kullanici_medunna_ana_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));

    }
    @Given("Kullanici insan resmine tiklar")
    public void kullanici_insan_resmine_tiklar() {
        pages.resimIkonu.click();

    }
    @Then("Kullanici sign in e tiklar")
    public void kullanici_sign_in_e_tiklar() {
        pages.SignIn.click();

    }

    @Given("Kullanici username kutusuna username girer")
    public void kullanici_username_kutusuna_firstname_girer() {
        pages.usernameKutusu.sendKeys("UserMurat44");

    }
    @Then("Kullanici password kutusuna password girer")
    public void kullanici_password_kutusuna_password_girer() {
        pages.passwordKutusu.sendKeys("123qscaA...");

    }
    @Then("Kullanici sign in butonuna tiklar")
    public void kullanici_sign_in_butonuna_tiklar() {
        pages.SignInButon.click();

    }
    @Then("Kullanici sag ust kosedeki kullanici ismine tiklar")
    public void kullanici_sag_ust_kosedeki_kullanici_ismine_tiklar() {
        pages.kosedekiKullaniciAdi.click();

    }
    @Then("Kullanici settings butonuna tiklar")
    public void kullanici_settings_butonuna_tiklar() {
        pages.settings.click();

    }
    @Then("firstname kutusunda kayit olurken girdigi firstname olmali")
    public void firstname_kutusunda_kayit_olurken_girdigi_firstname_olmali() {
        String actualFirstName = pages.settingsFirstNameKutusu.getAttribute("value");
        String expectedFirstName = "UserMurat44";
        Assert.assertEquals(expectedFirstName,actualFirstName);



    }
    @Then("lastname kutusunda kayit olurken girdigi lastname olmali")
    public void lastname_kutusunda_kayit_olurken_girdigi_lastname_olmali() {
        String actualLastName=pages.settingsLastNameKutusu.getAttribute("value");
        String expectedLastname = "Murat";
        Assert.assertEquals(expectedLastname,actualLastName);

    }
    @Then("email kutusunda kayit olurken girdigi email olmali")
    public void email_kutusunda_kayit_olurken_girdigi_email_olmali() {
        String actualEmail=pages.settingsEmailKutusu.getAttribute("value");
        String expectedEmail="usermurat@gmail.com";
        Assert.assertEquals(expectedEmail,actualEmail);

    }
    @Then("Kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();

    }

    @Then("firstname kutusuna yeni firstname girer")
    public void firstname_kutusuna_yeni_firstname_girer() {
        pages.settingsFirstNameKutusu.click();
        pages.settingsFirstNameKutusu.clear();
        pages.settingsFirstNameKutusu.sendKeys("newFirstname");

    }
    @Then("lastname kutusuna yeni lastname girer")
    public void lastname_kutusuna_yeni_lastname_girer() {
        pages.settingsLastNameKutusu.click();
        pages.settingsLastNameKutusu.clear();
        pages.settingsLastNameKutusu.sendKeys("newLastName");

    }
    @Then("email kutusuna yeni email girer")
    public void email_kutusuna_yeni_email_girer() {
        pages.settingsEmailKutusu.click();
        pages.settingsEmailKutusu.clear();
        pages.settingsEmailKutusu.sendKeys("dsahjdgs@gmail.com");


    }
    @Then("kullanici save butanuna basarak degisiklikleri kaydeder")
    public void kullanici_save_butanuna_basarak_degisiklikleri_kaydeder() {
        pages.settingsSaveButonu.click();
        Assert.assertTrue(pages.settingsSaveYazisi.isEnabled());


    }
}
