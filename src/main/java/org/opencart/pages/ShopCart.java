package org.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopCart {

    private WebDriver driver;


    private By PhonesPDAbutton = By.xpath("//a[text()='Phones & PDAs']");

    private By ShopCart = By.xpath("//span[text()='Shopping Cart']");

    private By AddToCart1 = By.xpath("//span[text()='Add to Cart']");

    private By AddToCart2 = By.xpath("(//span[text()='Add to Cart'])[2]");

    private By AddToCart3 = By.xpath("(//span[text()='Add to Cart'])[3]");

    private By Update = By.xpath("//i[@class='fa fa-refresh']");

    private By QuantityLine = By.xpath("(//div[@class='input-group btn-block'])[2]");

    private By QuantityLocator = By.xpath("//input[@name='quantity[44635]']");

    private By DeleteButton = By.xpath("(//button[@class='btn btn-danger'])[3]");

    private By ShopLink = By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=checkout/cart'])[3]");

//By.xpath("//a[text()='shopping cart']");
    public ShopCart(WebDriver driver) {
        this.driver = driver;
    }

    public void clickShopCart() {
        WebElement ShopCartClick = driver.findElement(ShopCart);
        ShopCartClick.click();
    }

    public void clickAdd1() {
        WebElement Add1click = driver.findElement(AddToCart1);
        Add1click.click();
    }

    public void clickAdd2() {
        WebElement Add2click = driver.findElement(AddToCart2);
        Add2click.click();
    }

    public void clickAdd3() {
        WebElement Add3click = driver.findElement(AddToCart3);
        Add3click.click();
    }

    public void clickUpdate() {
        WebElement UpdateClick = driver.findElement(Update);
        UpdateClick.click();
    }

    public void QuantityClear(){
        WebElement quantityClear = driver.findElement(QuantityLine);
        quantityClear.clear();
    }

    public void QuantityChange(String quantity){
        WebElement quantityChange = driver.findElement(QuantityLocator);
        quantityChange.sendKeys();
    }

    public void clickDelete() {
        WebElement DeleteClick = driver.findElement(DeleteButton);
        DeleteClick.click();
    }

    public void clickLink() {
        WebElement LinkClick = driver.findElement(ShopLink);
        LinkClick.click();
    }

}
