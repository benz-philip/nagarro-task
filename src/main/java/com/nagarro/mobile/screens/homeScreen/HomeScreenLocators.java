package com.nagarro.mobile.screens.homeScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeScreenLocators {
    @AndroidFindBy(id = "com.android.permissioncontroller:id/continue_button")
    MobileElement continueButton;
    @AndroidFindBy(id = "android:id/button1")
    MobileElement okButton;
    @AndroidFindBy(id = "android:id/title")
    MobileElement homeScreenTitle;
    @AndroidFindBy(id = "buttonTest")
    MobileElement enButton;
    @AndroidFindBy(id = "buttonStartWebview")
    MobileElement chromeButton;
    @AndroidFindBy(id = "startUserRegistration")
    MobileElement registrationButton;
    @AndroidFindBy(id = "my_text_field")
    MobileElement textField;
    @AndroidFindBy(id = "waitingButtonTest")
    MobileElement showProgressBarButton;
    @AndroidFindBy(id = "input_adds_check_box")
    MobileElement acceptAddsCheckbox;
    @AndroidFindBy(id = "visibleButtonTest")
    MobileElement displayTextViewButton;
    @AndroidFindBy(id = "showToastButton")
    MobileElement displayToastButton;
    @AndroidFindBy(id = "android:id/button2")
    MobileElement noButton;
    @AndroidFindBy(id = "android:id/progress")
    MobileElement progressBar;
    @AndroidFindBy(xpath = "//hierarchy/android.widget.Toast")
    MobileElement toastMessage;
    @AndroidFindBy(id = "showPopupWindowButton")
    MobileElement showPopupWindow;
    @AndroidFindBy(id = "visibleTestArea")
    MobileElement dismissButton;
    @AndroidFindBy(id = "exceptionTestButton")
    MobileElement throwUnHandledExceptionButton;
    @AndroidFindBy(id = "exceptionTestField")
    MobileElement throwUnHandledExceptionTextField;

    public MobileElement getHomeScreenTitle() {
        return homeScreenTitle;
    }

    public MobileElement getEnButton() {
        return enButton;
    }

    public MobileElement getChromeButton() {
        return chromeButton;
    }

    public MobileElement getRegistrationButton() {
        return registrationButton;
    }

    public MobileElement getTextField() {
        return textField;
    }

    public MobileElement getShowProgressBarButton() {
        return showProgressBarButton;
    }

    public MobileElement getAcceptAddsCheckbox() {
        return acceptAddsCheckbox;
    }

    public MobileElement getDisplayTextViewButton() {
        return displayTextViewButton;
    }

    public MobileElement getDisplayToastButton() {
        return displayToastButton;
    }

    public MobileElement getNoButton() {
        return noButton;
    }

    public MobileElement getProgressBar() {
        return progressBar;
    }

    public MobileElement getToastMessage() {
        return toastMessage;
    }

    public MobileElement getShowPopupWindow() {
        return showPopupWindow;
    }

    public MobileElement getDismissButton() {
        return dismissButton;
    }

    public MobileElement getContinueButton() {
        return continueButton;
    }

    public MobileElement getOkButton() {
        return okButton;
    }

    public MobileElement getThrowUnHandledExceptionButton() {
        return throwUnHandledExceptionButton;
    }

    public MobileElement getThrowUnHandledExceptionTextField() {
        return throwUnHandledExceptionTextField;
    }
}
