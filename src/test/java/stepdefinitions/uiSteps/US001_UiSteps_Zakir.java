package stepdefinitions.uiSteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.RegistrationPage;
import pages.US001_PageZ;
import pojos.Registrant;
import utilities.ConfigurationReader;
import utilities.Driver;

import static utilities.WriteToTxt.saveRegistrantData;

public class US001_UiSteps_Zakir {
    Actions actions=new Actions(Driver.getDriver());
    RegistrationPage regisstrationPage=new RegistrationPage();
    US001_PageZ us001PageZ=new US001_PageZ();
    public org.openqa.selenium.JavascriptExecutor JavascriptExecutor;
    JavascriptExecutor js=JavascriptExecutor;
    Faker faker = new Faker();
    Registrant registrant=new Registrant();


    @Given("Kullanici Medunna Register sayfasina gider")
    public void kullanici_medunna_register_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_registration_url"));
    }

    @Given("Kullanici gecerli bir SSN girisi yapar {string}")
    public void kullaniciGecerliBirSSNGirisiYapar(String validSSN) {
        validSSN=faker.idNumber().ssnValid();
        Driver.waitAndSendText(regisstrationPage.ssnTextBox, validSSN);
        registrant.setSsn(validSSN);
    }


    @And("Kullanici gecerli bir First Name girisi yapar {string}")
    public void kullaniciGecerliBirFirstNameGirisiYapar(String validFirstName) {
        validFirstName="T67"+faker.name().firstName();
        Driver.waitAndSendText(regisstrationPage.firstnameTextBox,validFirstName);
        registrant.setFirstName(validFirstName);
    }


    @And("Kullanici gecerli bir Last Name girisi yapar {string}")
    public void kullaniciGecerliBirLastNameGirisiYapar(String validLastName) {
        validLastName="T67"+faker.name().lastName();
        Driver.waitAndSendText(regisstrationPage.lastnameTextBox,validLastName);
        registrant.setLastName(validLastName);
    }

    @And("Kullanici gecerli bir username girisi yapar {string}")
    public void kullaniciGecerliBirUsernameGirisiYapar(String username) {
        username="T67"+faker.name().username();
        Driver.waitAndSendText(regisstrationPage.usernameTextBox,username);
        registrant.setLogin(username);
    }

    @And("Kullanici gecerli bir E-Mail girisi yapar {string}")
    public void kullaniciGecerliBirEMailGirisiYapar(String email) {
        email="T67"+faker.internet().emailAddress();
        Driver.waitAndSendText(regisstrationPage.emailTextbox,email);
        registrant.setEmail(email);
    }

    @And("Kullanici gecerli bir sifre girisi {string} ve sifre tekrari girisi yapar {string}")
    public void kullaniciGecerliBirSifreGirisiVeSifreTekrariGirisiYapar(String password, String confirmpassword) {
        password="T67"+faker.internet().password();
        confirmpassword=password;
        Driver.waitAndSendText(regisstrationPage.firstPasswordTextBox,password);
        Driver.waitAndSendText(regisstrationPage.newPasswordTextBox,confirmpassword);
        registrant.setPassword(password);
    }

    @And("Kullanici register butonuna tiklar")
    public void kullaniciRegisterButonunaTiklar() {
        regisstrationPage.registerButton.submit();
    }

    @Then("Kullanici kayit basarili yazisinin gorundugunu test dorgular")
    public void kullaniciKayitBasariliYazisininGorundugunuTestDorgular() throws InterruptedException {
        Thread.sleep(1500);
        Assert.assertTrue(regisstrationPage.successMessageToastContainer.isDisplayed());
    }

    @And("Kullanici Kayit yapar")
    public void kullaniciKayitYapar() {
        saveRegistrantData(registrant);
        System.out.println(registrant);
    }

    @Then("Kullanici tarayiciyi kapatir")
    public void kullaniciTarayiciyiKapatir() {
        Driver.closeDriver();
    }

    @Then("Kullanici ssn numarasini bos giris yapar")
    public void kullaniciSsnNumarasiniBosGirisYapar() {
        regisstrationPage.ssnTextBox.sendKeys("");
    }

    @Then("Kullanici kayit basarisiz yazisinin gorundugunu dogrular")
    public void kullaniciKayitBasarisizYazisininGorundugunuDogrular() {
        Assert.assertTrue(us001PageZ.yourSSNisRequiredYazisi.isDisplayed());

    }

    @And("Kullanici First Name kutusuna bos giris yapar")
    public void kullaniciFirstNameKutusunaBosGirisYapar() {
        regisstrationPage.firstnameTextBox.sendKeys("");
    }

    @Then("Kullanici FirstName required yazisinin gorundugunu test eder")
    public void kullaniciFirstNameRequiredYazisininGorundugunuTestEder() {
        Assert.assertTrue(us001PageZ.yourFirstNameisRequiredYazisi.isDisplayed());
    }

    @And("Kullanici Last Name kutusuna bos giris yapar")
    public void kullaniciLastNameKutusunaBosGirisYapar() {
        regisstrationPage.lastnameTextBox.sendKeys("");
    }

    @Then("Kullanici LastName required yazisinin gorundugunu test eder")
    public void kullaniciLastNameRequiredYazisininGorundugunuTestEder() {
        Assert.assertTrue(us001PageZ.yourLastNameisRequiredYazisi.isDisplayed());
    }
}


















































