package com.nagarro.web.screens.controlGroupScreen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ControlGroupScreenLocators {

    @FindBy(id= "transmission-automatic")
    WebElement automaticRadioButton;
    @FindBy(id= "insurance")
    WebElement insuranceCheckBox;
    @FindBy(id= "transmission-standard-v")
    WebElement standardRadioButton;
    @FindBy(id= "insurance-v")
    WebElement secondInsuranceCheckBox;
    

    public WebElement getAutomaticRadioButton() {
        return automaticRadioButton;
    }

    public WebElement getInsuranceCheckBox() {
        return insuranceCheckBox;
    }

    public WebElement getStandardRadioButton() {
        return standardRadioButton;
    }

    public WebElement getSecondInsuranceCheckBox() {
        return secondInsuranceCheckBox;
    }
}
