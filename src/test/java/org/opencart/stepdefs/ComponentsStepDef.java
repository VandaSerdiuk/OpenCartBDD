package org.opencart.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.opencart.pages.Components;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

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

    @When("Select the line Monitors and push in button")
    public void select_the_line_monitors_and_push_in_button() {
        components.clickMonitorsButton();
    }

}
