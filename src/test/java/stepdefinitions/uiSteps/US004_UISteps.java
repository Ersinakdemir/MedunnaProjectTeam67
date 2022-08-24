package stepdefinitions.uiSteps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US004_Pages;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US004_UISteps {

    US004_Pages ui004 = new US004_Pages();

    @Given("The User goes to Medunna URL")
    public void the_user_goes_to_medunna_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));

    }

    @Then("The user navigates the sign in the page")
    public void the_user_navigates_the_sign_in_the_page() {
        ui004.findPeople.click();

    }

    @Then("The user clicks on the sign-in button")
    public void the_user_clicks_on_the_sign_in_button() {
        ui004.signIn_First.click();

    }

    @Then("The user fills the Username box")
    public void the_user_fills_the_username_box() throws InterruptedException {
        ui004.userNameUI.sendKeys(ConfigurationReader.getProperty("adminUserName"));
        Thread.sleep(2000);
    }

    @Then("The user fills the Password box")
    public void the_user_fills_the_password_box() throws InterruptedException {
        //    ui004.passwordUI.sendKeys("123qscaA...");
        ui004.passwordUI.sendKeys(ConfigurationReader.getProperty("adminPasword"));
        Thread.sleep(2000);
    }

    @Then("The user clicks on the sign-in button below the page")
    public void the_user_clicks_on_the_sign_in_button_below_the_page() throws InterruptedException {
        ui004.signIn_Second.click();
        Thread.sleep(1000);

    }

    @Then("The user verifies sign-in is done successfully")
    public void the_user_verifies_sign_in_is_done_successfully() {
        Assert.assertTrue(ui004.admistaration.isDisplayed());
    }

    @Then("The user fills the Username with a wrong data")
    public void the_user_fills_the_with_a_wrong_data() {
        ui004.userNameUI.sendKeys("Burak");
        ui004.signIn_Second.click();
    }

    @Then("The user verifies sign-in isn't done successfull")
    public void the_user_verifies_sign_in_isn_t_done_successfull() {
        Assert.assertTrue(ui004.failedToSignIn.isDisplayed());
    }

    @Then("The user tests that the remember me button can be clicked")
    public void the_user_tests_that_the_remember_me_button_can_be_clicked() {
        ui004.remember.click();
    }

    @Then("The user verifies that the phrase of the {string}  exists")
    public void the_user_verifies_that_the_phrase_of_the_exists(String forgetButton) {
        String searchedPhrases = forgetButton;
        String actualButton = ui004.fotgetButton.getText();
        Assert.assertTrue(searchedPhrases.contains(actualButton));
    }

    @Then("The user verifies that the phrase of the {string} exists")
    public void the_user_verifies_that_the_phrase_of_the_existss(String registerPhrases) {
        String searchedPhrases2 = registerPhrases;
        String actualPhrases = ui004.registerPhrases.getText();
        Assert.assertTrue(searchedPhrases2.contains(actualPhrases));
    }

    @Then("The user verifies that {string} button exists on the page")
    public void the_user_verifies_that_button_exists_on_the_page(String cancelButton) {
        String expectedCancelButton = cancelButton;
        String actuelCancelButton = ui004.cancelButton.getText();

        Assert.assertTrue(expectedCancelButton.contains(actuelCancelButton));
    }

}
