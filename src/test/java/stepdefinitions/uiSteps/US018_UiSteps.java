package stepdefinitions.uiSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import pages.PhysicianPage;
import pages.US018_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class US018_UiSteps {
    US018_Page pg = new US018_Page();
    PhysicianPage physicianPage = new PhysicianPage();
    JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
    @Given("C navigate to Medduna Home Page")
    public void c_navigate_to_medduna_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
    }

    @When("C Verify that home page is visible successfully")
    public void c_verify_that_home_page_is_visible_successfully() {
        Driver.waitForVisibility(pg.mainPageLogo, 5);
    }

    @When("C Click on Account DropDownMenu button")
    public void c_click_on_account_drop_down_menu_button() {
        Driver.wait(3);
        Driver.waitAndClick(pg.dropDownmenu);
    }

    @When("C Click on Sign in")
    public void c_click_on_sign_in() {
        Driver.wait(1);
        Driver.waitAndClick(pg.signIn);
        Driver.wait(1);
    }

    @When("C Click on Username input box.")
    public void c_click_on_username_input_box() {
        Driver.wait(1);
        Driver.waitAndClick(pg.userNameInputBox);
        Driver.wait(1);
    }

    @Then("C Enter Valid {string} Username")
    public void cEnterValidUsername(String username) {
        pg.userNameInputBox.sendKeys(username);
    }

    @Then("C Click on Password input box.")
    public void c_click_on_password_input_box() {
        Driver.wait(1);
        pg.userNameInputBox.sendKeys(Keys.TAB);
        Driver.wait(1);
    }

    @Then("C Enter Valid {string} Password")
    public void cEnterValidPassword(String pasw) {
        pg.passwordInputBox.sendKeys(pasw);
        Driver.wait(1);
    }
    @Then("click on Item&Titles DropDownMenu and select Physician")
    public void click_on_item_titles_drop_down_menu_and_select_physician() {
        Driver.waitAndClick(physicianPage.itemsTitelsDropdown);
        Driver.wait(2);
        Driver.waitAndClick(physicianPage.physicianDropdown);
        Driver.wait(10);
    }

    @Then("Verify that Physicians Page Header is visible")
    public void verify_that_physicians_page_header_is_visible() {
        Driver.wait(2);
        Assert.assertTrue(physicianPage.phyisiciansHeader.isDisplayed());
    }

    @Then("click on new physician button")
    public void click_on_new_physician_button() {
        Driver.waitAndClick(physicianPage.createNewPhysician);
    }

    @Then("Verify that Create or edit a Physician Page is displayed")
    public void verify_that_create_or_edit_a_physician_page_is_displayed() {
        Assert.assertTrue(physicianPage.createOrEditPhysician.isDisplayed());
    }

    @Then("click on Use Search checkbox.")
    public void click_on_use_search_checkbox() {
        Driver.waitAndClick(physicianPage.useSSNSearchceckbox);
    }

    @Then("Click on SSN text box")
    public void click_on_ssn_text_box() {
        Driver.waitAndClick(physicianPage.inputSNNTextbox);
    }

    @Then("Enter the {string} number and click search user button")
    public void enter_the_number_and_click_search_user_button(String ssn) {
        physicianPage.inputSNNTextbox.sendKeys(ssn);
        Driver.waitAndClick(physicianPage.searchUserButton);
        Driver.wait(3);
    }

    @Then("Verify that User found with search SSN message is displayed")
    public void verify_that_user_found_with_search_ssn_message_is_displayed() {
        Assert.assertTrue(physicianPage.userFoundWithSearchSSN.isDisplayed());
    }


    @And("Verify that Physicians' info  is visible")
    public void verifyThatPhysiciansInfoIsVisible() {
        Driver.wait(3);
        Assert.assertTrue(physicianPage.PhysiciansPageHeader.isDisplayed());

    }

    @And("click Edit Button")
    public void clickEditButton() throws InterruptedException {

        Driver.wait(10);
        Driver.waitAndClick(physicianPage.editButton);


    }

    @And("click on Delete Button")
    public void clickOnDeleteButton() throws InterruptedException {
        Driver.wait(5);
        Driver.waitAndClick(physicianPage.deleteButton);


    }


    @And("should provide speciality as Nuclear Medicine")
    public void shouldProvideSpecialityAsNuclearMedicine() throws InterruptedException {
        Driver.wait(3);
        Select select = new Select(physicianPage.selectSpeciality);
        select.selectByValue("NUCLEAR_MEDICINE");
        physicianPage.selectSpeciality.sendKeys(Keys.TAB);
        physicianPage.bloodGroup.sendKeys(Keys.TAB);
        Driver.wait(10);

    }

    @And("Admin can provide a profile picture of the doctor")
    public void adminCanProvideAProfilePictureOfTheDoctor() {
        Driver.wait(10);
        js.executeScript("scroll(0, 900);");
        Driver.clickWithJS(physicianPage.chooseFile);

        Driver.wait(5);
        String path = System.getProperty("user.home") + "\\Desktop\\doctor.jpg";
        physicianPage.chooseFile.sendKeys(path);

    }

    @And("Admin should provide the {string} of the doctor")
    public void adminShouldProvideTheOfTheDoctor(String examFee) throws InterruptedException {

        js.executeScript("arguments[0].scrollIntoView(true);", physicianPage.examFeeInput);
        Driver.clickWithJS(physicianPage.examFeeInput);
        physicianPage.examFeeInput.clear();
        physicianPage.examFeeInput.sendKeys(examFee);
    }

    @And("Verify Confirm delete operation message is displayed")
    public void verifyConfirmDeleteOperationMessageIsDisplayed() {
        Assert.assertTrue(physicianPage.deletePhyisician.isEnabled());
    }

    @And("click on Save Button")
    public void clickOnSaveButton() {

        Driver.clickWithJS(physicianPage.saveButton);

    }

    @And("Verify that A phyisician is updated message is displayed")
    public void verifyThatAPhyisicianIsUpdatedMessageIsDisplayed() {
        Assert.assertTrue(physicianPage.physicianUpdatedMessage.getText().contains("Updated"));
    }
    @Then("C Click on Sign in button")
    public void cClickOnSignInButton() {
        Driver.waitAndClick(pg.signInButton);
        Driver.wait(3);
    }

    @And("click on View Button")
    public void clickOnViewButton() throws IOException {
        Driver.wait(25);
        Driver.waitAndClick(physicianPage.viewButton);
        Driver.wait(5);
        String phyisicianViewPage = null;
        getScreenshot(phyisicianViewPage);
    }

    public static String getScreenshot(String phyisicianViewPage) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + phyisicianViewPage + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }
}