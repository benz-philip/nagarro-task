package com.nagarro.web.screens.controlGroupScreen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static com.nagarro.controllers.WebController.executor;

public class ControlGroupScreen {

    WebDriver webDriver;
    ControlGroupScreenLocators controlGroupScreenLocators;

    public ControlGroupScreen(WebDriver webDriver, ControlGroupScreenLocators controlGroupScreenLocators) {
        this.webDriver = webDriver;
        this.controlGroupScreenLocators = controlGroupScreenLocators;
        PageFactory.initElements(webDriver, controlGroupScreenLocators);
    }

    public void clickOnAutomaticRadioButton() {
        executor.executeScript("arguments[0].click();", controlGroupScreenLocators.getAutomaticRadioButton());
    }

    public void clickOnInsuranceCheckBox() {
        executor.executeScript("arguments[0].click();", controlGroupScreenLocators.getInsuranceCheckBox());
    }

    public void clickOnStandardRadioButton() {
        executor.executeScript("arguments[0].click();", controlGroupScreenLocators.getStandardRadioButton());
    }

    public void clickOnSecondInsuranceCheckBox() {
        executor.executeScript("arguments[0].click();", controlGroupScreenLocators.getSecondInsuranceCheckBox());
    }
}
