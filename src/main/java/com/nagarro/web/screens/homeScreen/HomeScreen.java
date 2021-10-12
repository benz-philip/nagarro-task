package com.nagarro.web.screens.homeScreen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen {

    WebDriver webDriver;
    HomeScreenLocators homeScreenLocators;

    public HomeScreen(WebDriver webDriver, HomeScreenLocators homeScreenLocators) {
        this.webDriver = webDriver;
        this.homeScreenLocators = homeScreenLocators;
        PageFactory.initElements(webDriver, homeScreenLocators);
    }

    public void clickOnDroppableButton() {
        homeScreenLocators.getDroppableButton().click();
    }

    public void clickOnSelectableButton() {
        homeScreenLocators.getSelectableButton().click();
    }

    public void clickOnControlGroupButton() {
        homeScreenLocators.getControlGroupButton().click();
    }
}
