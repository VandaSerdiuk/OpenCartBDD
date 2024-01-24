package org.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Components {

    private WebDriver driver;

    private By buttonCompon = By.xpath("//a[text()='Components']");

    private By buttonMonitors = By.xpath("//a[text()='Monitors (2)']");


    private By buttonList = By.xpath("//button[@class='btn btn-default']");
    //button[@class='btn btn-default']
    //i[@class='fa fa-th-list']

    private By allComponentsButton = By.xpath("//a[text()='Show All Components']");

    private By PhonesButton = By.xpath("//a[text()='Phones & PDAs (3)']");

    private  By sortBy = By.xpath("//select[@id='input-sort']");

    private By LowHigh = By.xpath("//select[@id='input-sort']/option[text()='Price (Low > High)']");

    private By PhonesPDAbutton = By.xpath("//a[text()='Phones & PDAs']");

    private By AddToButton = By.xpath("//span[text()='Add to Cart']");

    private By ShoppingCart = By.xpath("//span[text()='Shopping Cart']");


    public Components(WebDriver driver) {
        this.driver = driver;
    }

    public void clickComponButton() {
        WebElement componButton = driver.findElement(buttonCompon);
        componButton.click();
    }

    public void clickMonitorsButton() {
        WebElement monitButton = driver.findElement(buttonMonitors);
        monitButton.click();
    }

    public void clickListButton() {
        WebElement listButton = driver.findElement(buttonList);
        listButton.click();
    }

    public void clickAllButton() {
        WebElement allButton = driver.findElement(allComponentsButton);
        allButton.click();
    }

    public void clickPhone() {
        WebElement buttonPhone = driver.findElement(PhonesButton);
        buttonPhone.click();
    }

    public void clickSortBy() {
        WebElement SortByClick = driver.findElement(sortBy);
        SortByClick.click();
    }

    public void selectLowHigh() {
        WebElement LowHighSelect = driver.findElement(LowHigh);
        LowHighSelect.click();
    }

    public void selectPhonesPDA() {
        WebElement PhonesPDA = driver.findElement(PhonesPDAbutton);
        PhonesPDA.click();
    }

    public void clickAddTo() {
        WebElement AddToClick = driver.findElement(AddToButton);
        AddToClick.click();
    }

    public void selectShopCart() {
        WebElement ShopCart = driver.findElement(ShoppingCart);
        ShopCart.click();
    }


}
