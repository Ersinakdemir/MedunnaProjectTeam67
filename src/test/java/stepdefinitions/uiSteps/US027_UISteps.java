package stepdefinitions.uiSteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US004_027_Pages;
import utilities.Driver;

public class US027_UISteps {


    US004_027_Pages pages = new US004_027_Pages();
    Faker faker = new Faker();

    @Then("The user clicks on the temsAndTitles that consist of the dropdown")
    public void the_user_clicks_on_the_tems_titles_that_consist_of_the_dropdown() throws InterruptedException {
        pages.temsAndTitles.click();
        // select = new Select(pages.temsAndTitles);
        Thread.sleep(3000);
        //select.selectByIndex(9);
    }

    @Then("The user clicks on the messages in the dropdown")
    public void the_user_clicks_on_the_messages_in_the_dropdown() throws InterruptedException {
        pages.messagesInDropDown.click();
        Thread.sleep(3000);
    }

    @Then("The user verifies that the messages portal consist of all messages, their authors and emails")
    public void the_user_verifies_that_the_messages_portal_consist_of_all_messages_their_authors_and_emails() {
        Assert.assertTrue(pages.messagesInDropDown.isEnabled());
    }

    @Then("The user clicks on the create a new message")
    public void the_user_clicks_on_the_create_a_new_message() {
        pages.createMessageButton.click();
    }

    @Then("The user fills the Name box")
    public void the_user_fills_the_name_box() {
        pages.nameForCreate.sendKeys(faker.name().firstName());

    }

    @Then("The user fills the Email box")
    public void the_user_fills_the_email_box() {
        pages.emailForCreate.sendKeys(faker.internet().emailAddress());

    }

    @Then("The user fills the Subject box")
    public void the_user_fills_the_subject_box() {
        pages.subjectForCreate.sendKeys(faker.name().title());
    }

    @Then("The user fills the Message box")
    public void the_user_fills_the_message_box() {
        pages.messageForCreate.sendKeys(faker.book().title());
    }

    @Then("The user clicks on the save button")
    public void the_user_clicks_on_the_save_button() {
        pages.saveForCreate.click();
    }

    @Then("The user verifies that the message has been created")
    public void the_user_verifies_that_the_message_has_been_created() {
        Assert.assertTrue(pages.verifyForCreating.isDisplayed());
    }

    @Then("The user clicks on the ID")
    public void the_user_clicks_on_the_id() {
        pages.idTop.click();
    }

    @Then("The user clicks on the Edit box")
    public void the_user_clicks_on_the_edit_box() {
        pages.edit.click();
    }

    @Then("The user clicks on the Name box")
    public void the_user_clicks_on_the_name_box() {
        pages.nameForEdit.sendKeys(faker.name().firstName());
    }

    @Then("The user fills the Email box for update")
    public void the_user_fills_the_email_box_for_update() {
        //pages.emailForEdit.sendKeys(faker.internet().emailAddress());
        pages.emailForEdit.click();
    }

    @Then("The user fills the Subject box for update")
    public void the_user_fills_the_subject_box_for_update() {
        pages.subjectForEdit.sendKeys(faker.name().title());
    }

    @Then("The user fills the Message box for update")
    public void the_user_fills_the_message_box_for_update() {
        pages.messageForEdit.sendKeys(faker.book().title());
    }

    @Then("The user clicks on the save button for update")
    public void the_user_clicks_on_the_save_button_for_update() throws InterruptedException {
       Actions action = new Actions(Driver.getDriver());
       action.sendKeys(Keys.PAGE_DOWN);
       Thread.sleep(3000);
        pages.saveForEdit.click();
    }

    @Then("The user verifies that the message has been updated")
    public void the_user_verifies_that_the_message_has_been_updated() {
Assert.assertTrue(pages.successfulEdit.isDisplayed());
    }
    @Then("The user clicks on the Delete button")
    public void the_user_clicks_on_the_delete_button() {
        pages.deleteButton.click();
    }
    @Then("The user clicks on the second Delete button")
    public void the_user_clicks_on_the_second_delete_button() {
        pages.deleteConfirm.click();
    }
    @Then("The user verifies that the message has been deleted")
    public void the_user_verifies_that_the_message_has_been_deleted() {
Assert.assertTrue(pages.deleteSuccessful.isDisplayed());
    }



}
