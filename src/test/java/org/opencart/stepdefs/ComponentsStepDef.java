package org.opencart.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.opencart.pages.Components;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComponentsStepDef {

    private WebDriver driver;

    private Components components;


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

    @Given("I am on the OpenCart home page")
    public void i_am_on_the_open_cart_home_page() {
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
        components = new Components(driver);
    }

    @Given("I click on the Components button and a window pops up")
    public void i_click_on_the_components_button_and_a_window_pops_up() {
        components.clickComponButton();
    }

    @Given("I select line Phones and PDAs")
    public void i_select_line_phones_and_pdas() {
        components.selectPhonesPDA();
    }

    @When("Select the line Monitors and push in button")
    public void select_the_line_monitors_and_push_in_button() {
        components.clickMonitorsButton();
    }

    @When("Select the line Show All Components and push in button")
    public void select_the_line_show_all_components_and_push_in_button() {
        components.clickAllButton();
    }

    @When("I click on Add to Cart button")
    public void i_click_on_add_to_cart_button() {
        components.clickAddTo();
    }

    @Then("Successful transition to the page Monitors")
    public void successful_transition_to_the_page_monitors() {
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25_28");
    }

    @Then("Select the List button and push")
    public void select_the_list_button_and_push() {
        components.clickListButton();
    }

    @Then("I select Phones & PDAs")
    public void i_select_phones_pdas() {
        components.clickPhone();
    }

    @Then("My product should be successfully added to the Shopping Cart")
    public void my_product_should_be_successfully_added_to_the_shopping_cart() {
        components.selectShopCart();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=checkout/cart/edit");
    }

    @And("Successful transition to the page Phones & PDAs")
    public void successful_transition_to_the_page_phones_pdas() {
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25");
    }

    @And("Testing options Sort By when select Prise Low High")
    public void testing_options_sort_by_when_select_prise_low_high() {
        components.clickSortBy();
        components.selectLowHigh();
    }


}
