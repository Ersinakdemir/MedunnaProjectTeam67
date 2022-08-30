package stepdefinitions.uiSteps;

import com.github.dockerjava.api.model.CpuStatsConfig;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US09_Page;
import utilities.ConfigurationReader;
import utilities.DateUtils;
import utilities.Driver;

public class US09_UiSteps {

    US09_Page us09_page =new US09_Page();
    Faker faker =new Faker();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String birtDate = faker.date().birthday().toString() + "12:34";
    String email =faker.internet().emailAddress();
    String phoneNummer = faker.phoneNumber().phoneNumber();
    String gender = "MALE";
    String bloodGroup = "A+";
    String address = faker.address().toString();
    String description = "ins yasarsin";
    String user = "ahmet";
    String country = faker.country().name();
    String city = faker.address().cityName();
    Actions actions = new Actions(Driver.getDriver());
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
    @Then("search Patient e tiklanir")
    public void search_patiente_tiklanir () throws InterruptedException {
        //us09_page.myPages.click();
       // JavascriptExecutor jsExecutor = (JavascriptExecutor)Driver.getDriver();
       // jsExecutor.executeScript("arguments[0].click();", us09_page.myPages);
        Thread.sleep(3000);
        us09_page.searchPatient.click();
    }
    @Then("Gidilen sayfada bir Patient in edit kismina tiklanir")
    public void gidilen_sayfada_bir_patient_in_edit_kismina_tiklanir() {
        us09_page.patientEditList.get(2).click();
    }

    @Then("firstname, lastname, birthdate, email, phone, gender, blood group,address, description, user, country güncellenir")
    public void firstname_lastname_birthdate_email_phone_gender_blood_group_address_description_user_country_and_state_güncellenir() {
    us09_page.firstNameEdit.clear();
        us09_page.firstNameEdit.sendKeys(firstName);
    actions.sendKeys(Keys.TAB);
    actions.sendKeys(lastName);
    actions.sendKeys(Keys.TAB);
    actions.sendKeys(birtDate);
    actions.perform();
    actions.sendKeys(Keys.TAB);
    actions.sendKeys(email);
    actions.sendKeys(Keys.TAB);
    actions.sendKeys(phoneNummer);
    actions.sendKeys(Keys.TAB);

    actions.sendKeys(gender);
    actions.perform();

    actions.sendKeys(Keys.TAB);
    actions.sendKeys(bloodGroup);
    actions.sendKeys(Keys.TAB);
    actions.sendKeys(address);
    actions.sendKeys(Keys.TAB);
    actions.sendKeys(description);
    actions.sendKeys(Keys.TAB);
    Select select = new Select(us09_page.userDropdown);
    select.selectByVisibleText(user);
    actions.sendKeys(Keys.TAB);
    actions.sendKeys(country);
    actions.sendKeys(Keys.TAB);
    actions.sendKeys(city);
    actions.sendKeys(Keys.TAB);
    actions.sendKeys(Keys.TAB);
    actions.sendKeys(Keys.ENTER);
    actions.perform();




    }
    @Then("Save tiklanarak yapilan degisiklikler kaydedilir")
    public void save_tiklanarak_yapilan_degisiklikler_kaydedilir() {
      //  us09_page.saveEntity.click();
    }
    @Then("Kayit dan sonra gelen sayfada degisikliklerin kaydedilip kaydedilmedigi test edilir")
    public void kayit_dan_sonra_gelen_sayfada_degisikliklerin_kaydedilip_kaydedilmedigi_test_edilir() {
        Assert.assertTrue(us09_page.updateerfolg.isDisplayed());
    }
    @Then("Gidilen sayfada ikinci Patientin edit kismina tiklanir")
    public void gidilen_sayfada_ikinci_patientin_edit_kismina_tiklanir(){
        us09_page.editikinciSira.click();
    }

}
