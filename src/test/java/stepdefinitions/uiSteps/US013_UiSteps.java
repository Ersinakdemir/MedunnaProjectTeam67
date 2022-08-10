package stepdefinitions.uiSteps;

import io.cucumber.java.en.Then;
import pages.US012_Pages;

public class US013_UiSteps {
    US012_Pages pages = new US012_Pages();



    @Then("Kullanici acilan pencerede Show Test Results butonu tiklar")
    public void kullanici_acilan_pencerede_show_test_results_butonu_tiklar() {
        pages.showTests.click();

    }
    @Then("Cikan pencerede View Results butonu tiklanarak test sonuclari sayfasina giris yapilir")
    public void cikan_pencerede_view_results_butonu_tiklanarak_test_sonuclari_sayfasina_giris_yapilir() {

        pages.viewResults.click();

    }
    @Then("Testlerin \"id\"leri gorulebilirligi test edilir")
    public void testlerin_id_leri_gorulebilirligi_test_edilir() {


    }


}
