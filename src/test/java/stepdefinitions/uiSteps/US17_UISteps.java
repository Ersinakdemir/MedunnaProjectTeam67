package stepdefinitions.uiSteps;

import io.cucumber.java.en.*;
import pages.US09_Page;
import pages.US17_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

import static junit.framework.TestCase.assertTrue;

public class US17_UISteps {

    US17_Page us17_page = new US17_Page();
    US09_Page us09_page =new US09_Page();

    @Given("Sing in segmesinden Admin olarak baglanilir")
    public void sing_in_segmesinden_admin_olarak_baglanilir() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
        us09_page.accountMenu.click();
        us09_page.singIn.click();
        us09_page.userNameBox.sendKeys("team67");
        us09_page.parolaBox.sendKeys("team67..");
        us09_page.singInButton.click();

    }
    @Given("Items &Title  sekmesine tiklanip")
    public void items_title_sekmesine_tiklanip() {
        us17_page.itemsDropdown.click();

    }
    @Given("Test - Items a tiklanir")
    public void test_items_a_tiklanir() {
        us17_page.testItems.click();
    }
    @Then("Gidilen sayfada Testitemslarin görüntülendigi test edilir")
    public void gidilen_sayfada_testitemslarin_görüntülendigi_test_edilir(){
        assertTrue(us17_page.idlkSayfaList.size()>0);
    }

    @Given("Gidilen sayfada Testitemslardan birinin Edit'e tiklanir")
    public void gidilen_sayfada_testitemslardan_birinin_edit_e_tiklanir() {
        us17_page.editilkSayfaList.get(13).click();
    }
    @Given("Item bilgileri degistirilerek")
    public void item_bilgileri_degistirilerek() {

    }
    @Given("Save tiklanarak yeni bir Item olusturulur kaydedilir")
    public void save_tiklanarak_yeni_bir_item_olusturulur_kaydedilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Kayit dan sonra gelen sayfada Basariyla kaydedildi.yazisinin görünür olgugu test edilir")
    public void kayit_dan_sonra_gelen_sayfada_basariyla_kaydedildi_yazisinin_görünür_olgugu_test_edilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
