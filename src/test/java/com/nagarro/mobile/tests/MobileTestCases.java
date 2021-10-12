package com.nagarro.mobile.tests;

import com.nagarro.controllers.MobileController;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MobileTestCases extends MobileController {

    @Test
    @Parameters({"screenTitleValue"})
    public void firstTestCase(String screenTitleValue) {
        mobileScreensHandler.getHomScreen().clickOnContinueButton();
        assertEquals(mobileScreensHandler.getHomScreen().getScreenTitleValue(), screenTitleValue);
        assertTrue(mobileScreensHandler.getHomScreen().checkIfEnButtonDisplayed());
        assertTrue(mobileScreensHandler.getHomScreen().checkIfChromeButtonDisplayed());
        assertTrue(mobileScreensHandler.getHomScreen().checkIfRegistrationButtonDisplayed());
        assertTrue(mobileScreensHandler.getHomScreen().checkIfTextFieldDisplayed());
        assertTrue(mobileScreensHandler.getHomScreen().checkIfShowProgressBarButtonDisplayed());
        assertTrue(mobileScreensHandler.getHomScreen().checkIfCheckboxDisplayed());
        assertTrue(mobileScreensHandler.getHomScreen().checkIfDisplayTextViewButtonDisplayed());
        assertTrue(mobileScreensHandler.getHomScreen().checkIfDisplayToastButtonDisplayed());
    }

    @Test
    public void secondTestCase() {
        mobileScreensHandler.getHomScreen().clickOnContinueButton();
        mobileScreensHandler.getHomScreen().clickOnEnButton();
        mobileScreensHandler.getHomScreen().clickOnNoButton();
        assertTrue(mobileScreensHandler.getHomScreen().checkIfEnButtonDisplayed());
    }

    @Test
    @Parameters({"webViewTitleValue", "helloText", "searchText", "thisIsMyTextValue", "carValue", "spinnerDefaultValue"})
    public void thirdTestCase(String webViewTitleValue, String helloText, String searchText, String thisIsMyTextValue, String carValue, String spinnerDefaultValue) {
        mobileScreensHandler.getHomScreen().clickOnContinueButton();
        mobileScreensHandler.getHomScreen().clickOnChromeButton();
        assertEquals(mobileScreensHandler.getBrowserScreen().getBrowserScreenTitle(), webViewTitleValue);
        assertEquals(mobileScreensHandler.getBrowserScreen().getHelloTextViewValue(), helloText);
        mobileScreensHandler.getBrowserScreen().fillBrowserTextBox(searchText);
        mobileScreensHandler.getBrowserScreen().openCarsSpinner();
        mobileScreensHandler.getBrowserScreen().selectMercedes();
        mobileScreensHandler.getBrowserScreen().clickOnSendYourNameButton();
        assertEquals(mobileScreensHandler.getBrowserScreen().getThisIsMyTextValue(), thisIsMyTextValue);
        assertEquals(mobileScreensHandler.getBrowserScreen().getNameValue(), '"' + searchText + '"');
        assertEquals(mobileScreensHandler.getBrowserScreen().getCarValue(), '"' + carValue + '"');
        mobileScreensHandler.getBrowserScreen().clickOnHereLink();
        assertEquals(mobileScreensHandler.getBrowserScreen().getSpinnerValue(), spinnerDefaultValue);
    }

    @Test
    public void fifthTestCase() {
        mobileScreensHandler.getHomScreen().clickOnContinueButton();
        mobileScreensHandler.getHomScreen().clickOnShowProgress();
        mobileScreensHandler.getHomScreen().waitProgressBarToDisappear();
        assertTrue(mobileScreensHandler.getRegistrationScreen().checkIfUserNameTextFieldDisplayed());
        assertTrue(mobileScreensHandler.getRegistrationScreen().checkIfEmailTextFieldDisplayed());
        assertTrue(mobileScreensHandler.getRegistrationScreen().checkIfPasswordTextFieldDisplayed());
        assertTrue(mobileScreensHandler.getRegistrationScreen().checkIfNameTextFieldDisplayed());
        assertTrue(mobileScreensHandler.getRegistrationScreen().checkIfProgrammingLanguageSpinnerDisplayed());
        assertTrue(mobileScreensHandler.getRegistrationScreen().checkIfAcceptAddsCheckBoxDisplayed());
        assertTrue(mobileScreensHandler.getRegistrationScreen().checkIfSubmitRegistrationButtonDisplayed());
    }

    @Test
    @Parameters({"toastMessageValue"})
    public void sixthTestCase(String toastMessageValue) {
        mobileScreensHandler.getHomScreen().clickOnContinueButton();
        mobileScreensHandler.getHomScreen().clickOnShowToastMessage();
        assertEquals(mobileScreensHandler.getHomScreen().getToastMessageValue(), toastMessageValue);
    }

    @Test
    public void seventhTestCase() {
        mobileScreensHandler.getHomScreen().clickOnContinueButton();
        mobileScreensHandler.getHomScreen().clickOnDisplayPopupWindow();
        mobileScreensHandler.getHomScreen().clickOnDismissButton();
    }

    @Test
    public void eighthTestCase() {
        mobileScreensHandler.getHomScreen().clickOnContinueButton();
        mobileScreensHandler.getHomScreen().clickOnThrowUnHandledExceptionButton();
        assertTrue(mobileScreensHandler.getHomScreen().checkIfEnButtonDisplayed());
    }

    @Test
    @Parameters({"textValue"})
    public void ninthTestCase(String textValue) {
        mobileScreensHandler.getHomScreen().clickOnContinueButton();
        mobileScreensHandler.getHomScreen().fillThrowUnHandledExceptionTextField(textValue);
        assertTrue(mobileScreensHandler.getHomScreen().checkIfEnButtonDisplayed());
    }
}
