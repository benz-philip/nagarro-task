package com.nagarro.mobile.screens.screensHandler;

import com.nagarro.mobile.screens.browserScreen.BrowserScreen;
import com.nagarro.mobile.screens.browserScreen.BrowserScreenLocators;
import com.nagarro.mobile.screens.homeScreen.HomeScreen;
import com.nagarro.mobile.screens.homeScreen.HomeScreenLocators;
import com.nagarro.mobile.screens.registrationScreen.RegistrationScreen;
import com.nagarro.mobile.screens.registrationScreen.RegistrationScreenLocators;

import static com.nagarro.controllers.MobileController.mobileDriver;

public class MobileScreensHandler {

    public HomeScreen getHomScreen() {
        return new HomeScreen(mobileDriver, new HomeScreenLocators());
    }

    public BrowserScreen getBrowserScreen() {
        return new BrowserScreen(mobileDriver, new BrowserScreenLocators());
    }

    public RegistrationScreen getRegistrationScreen() {
        return new RegistrationScreen(mobileDriver, new RegistrationScreenLocators());
    }
}
