package stepdefinitions.uiSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US003_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US003_UiSteps {

    US003_Page us003 = new US003_Page();

    @Given("AD User navigates to Medunna home page")
    public void ad_user_navigates_to_medunna_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));
        Driver.wait(3);
    }
    @Given("AD User clicks on human icon")
    public void ad_user_clicks_on_human_icon() {
        us003.humanIcon.click();
        Driver.wait(2);
    }
    @Given("AD User clicks on Register button")
    public void ad_user_clicks_on_register_button() {
        us003.accountMenuRegisterButton.click();
        Driver.wait(2);
    }
    @Given("AD User provides the new password {string}")
    public void ad_user_provides_the_new_password(String password) {
        Driver.waitAndSendText(us003.registerPagePasswordBox,password);
        Driver.wait(2);
    }
    @Then("AD User validates the password strength {string}")
    public void ad_user_validates_the_password_strength(String level) {

        if(1==Integer.parseInt(level)){
            Assert.assertTrue(us003.passwordStrength1.isDisplayed());
        }else if (2==Integer.parseInt(level)){
            Assert.assertTrue(us003.passwordStrength2.isDisplayed());
        }else if (4==Integer.parseInt(level)){
            Assert.assertTrue(us003.passwordStrength4.isDisplayed());
        }else if (5==Integer.parseInt(level)){
            Assert.assertTrue(us003.passwordStrength5.isDisplayed());
        }

        }
    }





