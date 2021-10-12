package com.nagarro.mobile.screens.browserScreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BrowserScreen {
    AppiumDriver<?> driver;
    BrowserScreenLocators browserScreenLocators;

    public BrowserScreen(AppiumDriver driver, BrowserScreenLocators browserScreenLocators) {
        this.driver = driver;
        this.browserScreenLocators = browserScreenLocators;
        PageFactory.initElements(new AppiumFieldDecorator(driver), browserScreenLocators);
    }

    public String getBrowserScreenTitle() {
        return browserScreenLocators.getWebViewTitle().getText();
    }

    public String getHelloTextViewValue() {
        return browserScreenLocators.getHelloTextView().getText();
    }

    public void fillBrowserTextBox(String value) {
        browserScreenLocators.getBrowserTextBox().clear();
        browserScreenLocators.getBrowserTextBox().setValue(value);
    }

    public void openCarsSpinner() {
        browserScreenLocators.getCarSpinner().click();
    }

    public void selectMercedes() {
        browserScreenLocators.getMercedesOption().click();
    }

    public void clickOnSendYourNameButton() {
        browserScreenLocators.getSendYourNameButton().click();
    }

    public String getThisIsMyTextValue() {
        return browserScreenLocators.getThisIsMyText().getText();
    }

    public String getNameValue() {
        return browserScreenLocators.getNameValue().getText();
    }

    public String getCarValue() {
        return browserScreenLocators.getCarValue().getText();
    }

    public void clickOnHereLink() {
        browserScreenLocators.getHereLink().click();
    }

    public String getSpinnerValue() {
        return browserScreenLocators.getCarSpinner().getText();
    }
    
}
