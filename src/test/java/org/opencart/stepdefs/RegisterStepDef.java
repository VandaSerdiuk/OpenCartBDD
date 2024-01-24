package org.opencart.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.opencart.pages.Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RegisterStepDef {

    private WebDriver driver;
    private Register register;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();

        }
    }


    @Given("I am on the OpenCart Register Account page")
    public void i_am_on_the_opencart_register_account_page() {
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
        register = new Register(driver);
    }

    @Given("I have entered a valid name, last name, email, telephone, password, password confirm")
    public void i_have_entered_a_valid_name_last_name_email_telephone_password_password_confirm() {
        register.sendName("Vanda");
        register.sendLastName("Star");
        register.sendEmail("vandastar@gmail.com");
        register.sendTelephone("8625558067");
        register.sendPassword("12345asd");
        register.sendPasswordConfirm("12345asd");
    }

    @Given("I have entered a valid name, last name, email, telephone, password and incorrect password confirm")
    public void i_have_entered_a_valid_name_last_name_email_telephone_password_and_incorrect_password_confirm() {
        register.sendName("Vanda");
        register.sendLastName("Star");
        register.sendEmail("vandastar@gmail.com");
        register.sendTelephone("8625558067");
        register.sendPassword("12345asd");
        register.sendPasswordConfirm("12345");
    }


    @When("I click MyAccount button")
    public void i_click_my_account_button() {
        register.clickMyAccount();
    }


    @When("I click on the Privacy Policy button and Continue button")
    public void i_click_on_the_privacy_policy_button_and_continue_button() {
        register.clickPrivacyPolicy();
        register.clickContinue();
    }

    @When("I click on the Continue button")
    public void i_click_on_the_continue_button() {
        register.continueClick();
    }


    @And("I click Newsletter button")
    public void i_click_newsletter_button() {
        register.clickNewsletter();
    }


    @Then("I click Register button")
    public void i_click_register_button() {
        register.clickRegister();
    }


    @Then("My profile should be created successfully")
    public void my_profile_should_be_created_successfully() {
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/success");
    }

    @Then("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        Assert.assertEquals(driver.findElement(By.cssSelector(".alert-danger")).isDisplayed(), true);
    }

    @Then("I should see error message {string}")
    public void i_should_see_error_message(String errorMessage2) {
        Assert.assertEquals(driver.findElement(By.cssSelector(".alert-danger")).isDisplayed(), true);
    }

    @Then("I should see error password message {string}")
    public void i_should_see_error_password_message(String errorMessage3) {
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='text-danger']")).isDisplayed(),true);

    }

    

}
