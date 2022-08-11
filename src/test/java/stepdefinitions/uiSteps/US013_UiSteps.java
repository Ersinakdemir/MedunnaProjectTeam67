package stepdefinitions.uiSteps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US012_13_Pages;
import utilities.Driver;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class US013_UiSteps {
    US012_13_Pages pages = new US012_13_Pages();
    Actions action = new Actions(Driver.getDriver());
   
    

    @Then("Kullanici acilan pencerede Show Test Results butonu tiklar")
    public void kullanici_acilan_pencerede_show_test_results_butonu_tiklar() {
        Driver.wait(3);
        pages.showTests.click();

    }
    @Then("Cikan pencerede View Results butonu tiklanarak test sonuclari sayfasina giris yapilir")
    public void cikan_pencerede_view_results_butonu_tiklanarak_test_sonuclari_sayfasina_giris_yapilir() {
        //Driver.wait(3);
        Driver.clickWithJS(pages.viewResults);



    }
    @Then("Testlerin \"id\"leri gorulebilirligi test edilir")
    public void testlerin_id_leri_gorulebilirligi_test_edilir() {

        List<WebElement> idList=pages.testId;

        for (int i = 0; i <idList.size() ; i++) {
            assertTrue(idList.get(i).isDisplayed());
            System.out.println(idList.get(i).getText());
        }


    }
    @Then("Testlerin Name leri gorulebilirligi test edilir")
    public void testlerin_name_leri_gorulebilirligi_test_edilir() {
        List<WebElement> idList=pages.testName;

        for (int i = 0; i <idList.size() ; i++) {
            assertTrue(idList.get(i).isDisplayed());
            System.out.println(idList.get(i).getText());
        }

    }

    @Then("Testlerin Default_min_value leri gorulebilirligi test edilir")
    public void testlerin_default_min_value_leri_gorulebilirligi_test_edilir() {

        List<WebElement> idList=pages.testDefault_min_value;

        for (int i = 0; i <idList.size() ; i++) {
            assertTrue(idList.get(i).isDisplayed());
            System.out.println(idList.get(i).getText());
        }
    }


    @Then("Testlerin Default_max_value leri gorulebilirligi test edilir")
    public void testlerin_default_max_value_leri_gorulebilirligi_test_edilir() {
        List<WebElement> idList=pages.testDefault_max_value;

        for (int i = 0; i <idList.size() ; i++) {
            assertTrue(idList.get(i).isDisplayed());
            System.out.println(idList.get(i).getText());
        }
    }

    @Then("Testlerin Test leri gorulebilirligi test edilir")
    public void testlerin_test_leri_gorulebilirligi_test_edilir() {
        List<WebElement> idList=pages.testTest;

        for (int i = 0; i <idList.size() ; i++) {
            assertTrue(idList.get(i).isDisplayed());
            System.out.println(idList.get(i).getText());
        }



    }

    @Then("Testlerin Description leri gorulebilirligi test edilir")
    public void testlerin_description_leri_gorulebilirligi_test_edilir() {

        List<WebElement> idList=pages.testDescription;

        for (int i = 0; i <idList.size() ; i++) {
            assertTrue(idList.get(i).isDisplayed());
            System.out.println(idList.get(i).getText());
        }

    }

    @Then("Testlerin Date leri gorulebilirligi test edilir")
    public void testlerin_date_leri_gorulebilirligi_test_edilir() {

        List<WebElement> idList=pages.testDate;

        for (int i = 0; i <idList.size() ; i++) {
            assertTrue(idList.get(i).isDisplayed());
            System.out.println(idList.get(i).getText());
        }
    }

    @Then("Kullanici acilan pencerede Request Inpatient butonunu tiklar")
    public void kullanici_acilan_pencerede_request_inpatient_butonunu_tiklar() {


    }
    @Then("InPatient request already done for this appointment yazisinin gorundugu test edilir")
    public void yazisinin_gorundugu_test_edilir(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
