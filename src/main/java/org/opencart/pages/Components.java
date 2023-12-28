package org.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Components {

    private WebDriver driver;

    private By buttonCompon = By.xpath("//a[text()='Components']");

    private By buttonMonitors = By.xpath("//a[text()='Monitors (2)']");

    private By lokatorMonitors = By.xpath("//h2[text()='Monitors']");


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

    public boolean checkLokatorMonitors() {
        return driver.findElement(lokatorMonitors).isDisplayed();
    }
}
