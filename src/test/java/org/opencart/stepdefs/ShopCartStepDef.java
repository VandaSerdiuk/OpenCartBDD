package org.opencart.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.opencart.pages.ShopCart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ShopCartStepDef {

    private WebDriver driver;

    private ShopCart shopCart;

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

    @Given("I am on the Phones and PDAs page")
    public void i_am_on_the_phones_and_pdas_page() {
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=24");
        shopCart = new ShopCart(driver);
    }

    @Given("I click on Shop Cart option")
    public void i_click_on_shop_cart_option() {
        shopCart.clickShopCart();
    }

    @When("I click on Add to Cart button all product")
    public void i_click_on_add_to_cart_button_all_product() {
        shopCart.clickAdd1();
        shopCart.clickAdd2();
        shopCart.clickAdd3();
    }

    @When("I click on Update button")
    public void i_click_on_update_button() {
        shopCart.clickUpdate();
    }

    @When("I select cart link")
    public void i_select_cart_link() {
        shopCart.clickLink();
    }

    @When("I click Delete button")
    public void i_click_delete_button() {
        shopCart.clickDelete();
    }

    @Then("My Product need be Successful in Shop cart")
    public void my_product_need_be_successful_in_shop_cart() {
        Assert.assertEquals(driver.findElement(By.cssSelector(".alert-dismissible")).isDisplayed(),true);
        //class="alert alert-success alert-dismissible"
    }

    @Then("I should be able to successfully navigate to the shopping cart page")
    public void i_should_be_able_to_successfully_navigate_to_the_shopping_cart_page() {
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=checkout/cart/edit");
    }

    @Then("I should see just 2 product in page")
    public void i_should_see_just_2_product_in_page() {
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=checkout/cart");
    }



}
