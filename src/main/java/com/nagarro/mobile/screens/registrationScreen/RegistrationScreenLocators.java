package com.nagarro.mobile.screens.registrationScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegistrationScreenLocators {

    @AndroidFindBy(id = "inputUsername")
    MobileElement userNameTextField;
    @AndroidFindBy(id = "inputEmail")
    MobileElement emailTextField;
    @AndroidFindBy(id = "inputPassword")
    MobileElement passwordTextField;
    @AndroidFindBy(id = "inputName")
    MobileElement nameTextField;
    @AndroidFindBy(id = "input_preferedProgrammingLanguage")
    MobileElement programmingLanguageSpinner;
    @AndroidFindBy(id = "input_adds")
    MobileElement acceptAddsCheckBox;
    @AndroidFindBy(id = "btnRegisterUser")
    MobileElement submitRegisterButton;

    public MobileElement getUserNameTextField() {
        return userNameTextField;
    }

    public MobileElement getEmailTextField() {
        return emailTextField;
    }

    public MobileElement getPasswordTextField() {
        return passwordTextField;
    }

    public MobileElement getNameTextField() {
        return nameTextField;
    }

    public MobileElement getProgrammingLanguageSpinner() {
        return programmingLanguageSpinner;
    }

    public MobileElement getAcceptAddsCheckBox() {
        return acceptAddsCheckBox;
    }

    public MobileElement getSubmitRegisterButton() {
        return submitRegisterButton;
    }
}
