package com.nagarro.mobile.screens.registrationScreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class RegistrationScreen {

    AppiumDriver<?> driver;
    RegistrationScreenLocators registrationScreenLocators;

    public RegistrationScreen(AppiumDriver driver, RegistrationScreenLocators registrationScreenLocators) {
        this.driver = driver;
        this.registrationScreenLocators = registrationScreenLocators;
        PageFactory.initElements(new AppiumFieldDecorator(driver), registrationScreenLocators);
    }

    public boolean checkIfUserNameTextFieldDisplayed() {
        return registrationScreenLocators.getUserNameTextField().isDisplayed();
    }

    public boolean checkIfEmailTextFieldDisplayed() {
        return registrationScreenLocators.getEmailTextField().isDisplayed();
    }

    public boolean checkIfPasswordTextFieldDisplayed() {
        return registrationScreenLocators.getPasswordTextField().isDisplayed();
    }

    public boolean checkIfNameTextFieldDisplayed() {
        return registrationScreenLocators.getNameTextField().isDisplayed();
    }

    public boolean checkIfProgrammingLanguageSpinnerDisplayed() {
        return registrationScreenLocators.getProgrammingLanguageSpinner().isDisplayed();
    }

    public boolean checkIfAcceptAddsCheckBoxDisplayed() {
        return registrationScreenLocators.getAcceptAddsCheckBox().isDisplayed();
    }

    public boolean checkIfSubmitRegistrationButtonDisplayed() {
        return registrationScreenLocators.getSubmitRegisterButton().isDisplayed();
    }
}
