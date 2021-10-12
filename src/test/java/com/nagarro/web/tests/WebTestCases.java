package com.nagarro.web.tests;

import com.nagarro.controllers.WebController;
import org.testng.annotations.Test;

public class WebTestCases extends WebController {

    @Test
    public void checkDroppableCase() {
        webScreensHandler.getHomScreen().clickOnDroppableButton();
        webScreensHandler.getDroppableScreen().switchToIframe();
        webScreensHandler.getDroppableScreen().dragAndDropSquare();
    }

    @Test
    public void checkSelectableCase() {
        webScreensHandler.getHomScreen().clickOnSelectableButton();
        webScreensHandler.getDroppableScreen().switchToIframe();
        webScreensHandler.getSelectableScreen().selectThreeOptions();
    }


    @Test
    public void checkControlGroupCase() {
        webScreensHandler.getHomScreen().clickOnControlGroupButton();
        webScreensHandler.getDroppableScreen().switchToIframe();
        webScreensHandler.getControlGroupScreen().clickOnAutomaticRadioButton();
        webScreensHandler.getControlGroupScreen().clickOnInsuranceCheckBox();
        webScreensHandler.getControlGroupScreen().clickOnStandardRadioButton();
        webScreensHandler.getControlGroupScreen().clickOnSecondInsuranceCheckBox();
    }
}
