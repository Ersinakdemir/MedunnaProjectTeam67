package stepdefinitions.uiSteps;

import io.cucumber.java.en.Given;
import pages.US003_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US003_UiSteps {

    US003_Page us003 = new US003_Page();

    @Given("FY User navigates to Medunna home page")
    public void fy_user_navigates_to_medunna_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));
        Driver.wait(3);
    }
    @Given("FY User clicks on human icon")
    public void fy_user_clicks_on_human_icon() {
        us003.humanIcon.click();
        Driver.wait(2);
    }
    @Given("FY User clicks on Register button")
    public void fy_user_clicks_on_register_button() {
        us003.accountMenuRegisterButton.click();
        Driver.wait(2);
    }

}
