package com.nagarro.mobile.screens.browserScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BrowserScreenLocators {
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Web View Interaction']")
    MobileElement webViewTitle;
    @AndroidFindBy(xpath = "//android.view.View[@text='Hello, can you please tell me your name?']")
    MobileElement helloTextView;
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='name_input']")
    MobileElement browserTextBox;
    @AndroidFindBy(xpath = "//android.widget.Spinner[@text='Volvo']")
    MobileElement carSpinner;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Mercedes']")
    MobileElement mercedesOption;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Send me your name!']")
    MobileElement sendYourNameButton;
    @AndroidFindBy(xpath = "//android.view.View[@text='This is my way of saying hello']")
    MobileElement thisIsMyText;
    @AndroidFindBy(xpath = "//android.view.View[4]")
    MobileElement nameValue;
    @AndroidFindBy(xpath = "//android.view.View[6]")
    MobileElement carValue;
    @AndroidFindBy(xpath = "//android.view.View[@text='here']")
    MobileElement hereLink;


    public MobileElement getWebViewTitle() {
        return webViewTitle;
    }

    public MobileElement getHelloTextView() {
        return helloTextView;
    }

    public MobileElement getBrowserTextBox() {
        return browserTextBox;
    }

    public MobileElement getCarSpinner() {
        return carSpinner;
    }

    public MobileElement getMercedesOption() {
        return mercedesOption;
    }

    public MobileElement getSendYourNameButton() {
        return sendYourNameButton;
    }

    public MobileElement getThisIsMyText() {
        return thisIsMyText;
    }

    public MobileElement getNameValue() {
        return nameValue;
    }

    public MobileElement getCarValue() {
        return carValue;
    }

    public MobileElement getHereLink() {
        return hereLink;
    }
}
