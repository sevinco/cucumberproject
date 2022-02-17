package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TC6_ContactUsForm;
import utilities.Driver;

public class ContactusStepDefs {
            TC6_ContactUsForm contactUsForm=new TC6_ContactUsForm();
    @When("user clicks contact us button")
    public void user_clicks_contact_us_button() {
        contactUsForm.contactUsButton.click();
    }
    @When("user verifies get in touch text is visible")
    public void user_verifies_get_in_touch_text_is_visible() {
        Assert.assertTrue(contactUsForm.getInTouchText.isDisplayed());
    }
    @When("user enters name, email and subject")
    public void user_enters_name_email_and_subject() {

        Driver.waitAndSendText(contactUsForm.nameText,"emir");
        Driver.waitAndSendText(contactUsForm.emailBox,"emirkayap@gmail.com");
        Driver.waitAndSendText(contactUsForm.subjectBox,"return");
        Driver.waitAndSendText(contactUsForm.messageBox,"Hello world");

    }
    @When("user uploads file")
    public void user_uploads_file() {

    }
    @When("user clicks submit button")
    public void user_clicks_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks on OK button")
    public void user_clicks_on_ok_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("verify success message")
    public void verify_success_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user clicks Home button and verifies that landed to home page successfully")
    public void user_clicks_home_button_and_verifies_that_landed_to_home_page_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}

