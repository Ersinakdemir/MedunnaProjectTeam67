package stepdefinitions.uiSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.US011_Pages;
import utilities.Driver;

public class US011_UiSteps {
    US011_Pages us011_pages=new US011_Pages();




    @And("Doctor Edit buttona Tiklar")
    public void doctorEditButtonaTıklar() {

        us011_pages.Myappointments_Edit_Button.click();




    }

    @And("Doctor Create or Edit an Appointment sayfasinda oldugunu dogrular")
    public void doctorCreateOrEditAnAppointmentSayfasindaOldugunuDogrular() throws InterruptedException {

        Assert.assertTrue(us011_pages.Myappointments_Create_or_Edit_an_Appointment_Visible_Text.isDisplayed());

        Thread.sleep(2000);

    }

    @And("Doktor id, start and end date, Status, physician and patient  gorunurlugunu dogrular")
    public void doktorIdStartAndEndDateStatusPhysicianAndPatientGorunurlugunuDogrular() {
        Assert.assertTrue(us011_pages.Myappointments_Visible_ID.isDisplayed());
        Assert.assertTrue(us011_pages.Myappointments_Visible_StartDate.isDisplayed());
        Assert.assertTrue(us011_pages.Myappointments_Visible_EndDate.isDisplayed());
        Assert.assertTrue(us011_pages.Myaapointments_Visible_Status.isDisplayed());
        Assert.assertTrue(us011_pages.Myaapointments_Visible_Physician.isDisplayed());
        Assert.assertTrue(us011_pages.Myaapointments_Visible_Patient.isDisplayed());

    }

    @And("Doktor gerekli Anamnesis, Treatment ve Diagnosis alanlari bos birakilamaz dogrular")
    public void doktorGerekliAnamnesisTreatmentVeDiagnosisAlanlariBosBirakilamazDogrular() throws InterruptedException {

        WebElement jsSaveElement=us011_pages.Myappointments_Save_Button;
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", jsSaveElement);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", jsSaveElement);

        WebElement jsAnamnesisElement=us011_pages.Myappointments_Anamnesis_Box;
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", jsAnamnesisElement);


        Assert.assertTrue(us011_pages.Myappointments_VisibleText_AnamnesisError_message.isDisplayed());
        Assert.assertTrue(us011_pages.Myappointments_VisibleText_TreatmentError_message.isDisplayed());
        Assert.assertTrue(us011_pages.Myappointments_VisibleText_DiagnosisError_message.isDisplayed());

       Thread.sleep(2000);



    }

    @And("Doktor gerekli Anamnesis, Treatment ve Diagnosis alanlarına giris yapar ve dogrular")
    public void doktorGerekliAnamnesisTreatmentVeDiagnosisAlanlarınaGirisYaparVeDogrular() throws InterruptedException {

        WebElement jsDiagnosisElement=us011_pages.Myappointments_Diagnosis_Box;
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", jsDiagnosisElement);

        us011_pages.Myappointments_Anamnesis_Box.sendKeys(Keys.CONTROL+"a"+Keys.CLEAR);
        us011_pages.Myappointments_Anamnesis_Box.sendKeys("Anamnesis");

        us011_pages.Myappointments_Treatment_Box.sendKeys(Keys.CONTROL+"a"+Keys.CLEAR);
        us011_pages.Myappointments_Treatment_Box.sendKeys("Treatments");

        us011_pages.Myappointments_Diagnosis_Box.sendKeys(Keys.CONTROL+"a"+Keys.CLEAR);
        us011_pages.Myappointments_Diagnosis_Box.sendKeys("Diagnosis");

        Thread.sleep(2000);





        WebElement jsSaveElement=us011_pages.Myappointments_Save_Button;
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", jsSaveElement);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", jsSaveElement);


            Thread.sleep(2000);


    }

    @And("Doktor prescription ve description boş bir sekilde birakir ve dogrular")
    public void doktorPrescriptionVeDescriptionBoşBirSekildeBirakirVeDogrular() throws InterruptedException {

        WebElement jsPrescriptionElement=us011_pages.Myapointments_Prescription_Box;
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", jsPrescriptionElement);

        Thread.sleep(2000);

        us011_pages.Myapointments_Prescription_Box.sendKeys(" ");
        us011_pages.Myapointments_Description_Box.sendKeys(" ");

        Thread.sleep(2000);



    }

    @And("Doktor Statusu PENDING secer ve dogrular")
    public void doktorStatusuSirasiylaPENDINGCOMPLETEDVeyaCANCELLEDSecerVeDogrular() throws InterruptedException {



        Select status=new Select(us011_pages.Myappointments_CEAPage_Status_Box);
        status.selectByIndex(1);


        Thread.sleep(5000);



    }



    @Then("Doktor MyAppointments sayfasinda oldugunu dogrular")
    public void doktorMyAppointmentsSayfasindaOldugunuDogrular() {

        Assert.assertTrue(us011_pages.Myappointment_Visible_appointment_Text.isDisplayed());
    }

    @And("Doktor Statusu CANCELLED secer ve dogrular")
    public void doktorStatusuCANCELLEDSecerVeDogrular() {

        Select status=new Select(us011_pages.Myappointments_CEAPage_Status_Box);
        status.selectByIndex(3);



    }

    @And("Doktor Statusu COMPLETED secer ve dogrular")
    public void doktorStatusuCOMPLETEDSecerVeDogrular() {

        Select status=new Select(us011_pages.Myappointments_CEAPage_Status_Box);
        status.selectByIndex(2);


    }

    @And("Doktor sayfayi kapatır.")
    public void doktorSayfayiKapatır() {
        Driver.closeDriver();


    }




}
