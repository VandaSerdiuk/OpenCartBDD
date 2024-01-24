package org.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register {

    private WebDriver driver;

    private By MyAccountButton = By.xpath("//span[text()='My Account']");

    private By RegisterButton = By.xpath("//a[text()='Register']");

    private By nameLocator = By.xpath("//input[@name='firstname']");

    private By lastnameLocator = By.xpath("//input[@name='lastname']");

    private By emailLocator = By.xpath("//input[@name='email']");

    private By telephoneLocator = By.xpath("//input[@name='telephone']");

    private By passwordLocator = By.xpath("//input[@name='password']");

    private By passwordConfirmLocator = By.xpath("//input[@name='confirm']");

    private By privacyPolicySelect = By.xpath("//input[@name='agree']");

    private By continueButton = By.xpath("//input[@value='Continue']");

    private By buttonContinue = By.xpath("//input[@class='btn btn-primary']");

    private By NewsletterButton = By.xpath("(//label[@class='radio-inline']//input[@name='newsletter'])[1]");


    public Register(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMyAccount() {
        WebElement ButMyAccount = driver.findElement(MyAccountButton);
        ButMyAccount.click();
    }

    public void clickRegister() {
        WebElement ButRegister = driver.findElement(RegisterButton);
        ButRegister.click();
    }

    public void sendName(String name) {
        WebElement nameInput = driver.findElement(nameLocator);
        nameInput.sendKeys(name);
    }

    public void sendLastName(String lastname) {
        WebElement lastnameInput = driver.findElement(lastnameLocator);
        lastnameInput.sendKeys(lastname);
    }

    public void sendEmail(String email) {
        WebElement emailInput = driver.findElement(emailLocator);
        emailInput.sendKeys(email);
    }

    public void sendTelephone(String telephone) {
        WebElement telephoneInput = driver.findElement(telephoneLocator);
        telephoneInput.sendKeys(telephone);
    }

    public void sendPassword(String password) {
        WebElement passwordInput = driver.findElement(passwordLocator);
        passwordInput.sendKeys(password);
    }

    public void sendPasswordConfirm(String confirm) {
        WebElement confirmInput = driver.findElement(passwordConfirmLocator);
        confirmInput.sendKeys(confirm);
    }

    public void clickPrivacyPolicy() {
        WebElement ButPrivacyPolicy = driver.findElement(privacyPolicySelect);
        ButPrivacyPolicy.click();
    }

    public void clickContinue() {
        WebElement ButContinue = driver.findElement(continueButton);
        ButContinue.click();
    }

    public void continueClick() {
        WebElement continueBut = driver.findElement(buttonContinue);
        continueBut.click();
    }

    public void clickNewsletter() {
        WebElement ButNewsletter = driver.findElement(NewsletterButton);
        ButNewsletter.click();
    }
}
