package com.nagarro.mobile.screens.homeScreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen {
    AppiumDriver<?> driver;
    HomeScreenLocators homeScreenLocators;

    public HomeScreen(AppiumDriver driver, HomeScreenLocators homeScreenLocators) {
        this.driver = driver;
        this.homeScreenLocators = homeScreenLocators;
        PageFactory.initElements(new AppiumFieldDecorator(driver), homeScreenLocators);
    }

    public String getScreenTitleValue() {
        return homeScreenLocators.getHomeScreenTitle().getText();
    }

    public boolean checkIfEnButtonDisplayed() {
        return homeScreenLocators.getEnButton().isDisplayed();
    }

    public boolean checkIfChromeButtonDisplayed() {
        return homeScreenLocators.getChromeButton().isDisplayed();
    }

    public boolean checkIfRegistrationButtonDisplayed() {
        return homeScreenLocators.getRegistrationButton().isDisplayed();
    }

    public boolean checkIfTextFieldDisplayed() {
        return homeScreenLocators.getTextField().isDisplayed();
    }

    public boolean checkIfShowProgressBarButtonDisplayed() {
        return homeScreenLocators.getShowProgressBarButton().isDisplayed();
    }

    public boolean checkIfCheckboxDisplayed() {
        return homeScreenLocators.getAcceptAddsCheckbox().isDisplayed();
    }

    public boolean checkIfDisplayTextViewButtonDisplayed() {
        return homeScreenLocators.getDisplayTextViewButton().isDisplayed();
    }

    public boolean checkIfDisplayToastButtonDisplayed() {
        return homeScreenLocators.getDisplayToastButton().isDisplayed();
    }

    public void clickOnEnButton() {
        homeScreenLocators.getEnButton().click();
    }

    public void clickOnNoButton() {
        homeScreenLocators.getNoButton().click();
    }

    public void clickOnChromeButton() {
        homeScreenLocators.getChromeButton().click();
    }

    public void clickOnShowProgress() {
        homeScreenLocators.getShowProgressBarButton().click();
    }

    public void waitProgressBarToDisappear() {
        try {
            while (homeScreenLocators.getProgressBar().isDisplayed()) {
                // do nothing   
            }
        } catch (Exception e) {

        }
    }

    public void clickOnShowToastMessage() {
        homeScreenLocators.getDisplayToastButton().click();
    }

    public String getToastMessageValue() {
        return homeScreenLocators.getToastMessage().getText();
    }

    public void clickOnDisplayPopupWindow() {
        homeScreenLocators.getShowPopupWindow().click();
    }

    public void clickOnDismissButton() {
        homeScreenLocators.getDismissButton().click();
    }

    public void clickOnContinueButton() {
        homeScreenLocators.getContinueButton().click();
        homeScreenLocators.getOkButton().click();
    }

    public void clickOnThrowUnHandledExceptionButton() {
        homeScreenLocators.getThrowUnHandledExceptionButton().click();
    }

    public void fillThrowUnHandledExceptionTextField(String exceptionText) {
        homeScreenLocators.getThrowUnHandledExceptionTextField().setValue(exceptionText);
    }
}
