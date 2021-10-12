package com.nagarro.controllers;

import com.nagarro.mobile.screens.screensHandler.MobileScreensHandler;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.*;
import static io.appium.java_client.remote.MobileCapabilityType.*;
import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class MobileController {
    public static AppiumDriver<?> mobileDriver;
    public MobileScreensHandler mobileScreensHandler = new MobileScreensHandler();

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(UDID, "emulator-5554");
        capabilities.setCapability(PLATFORM_VERSION, "11");
        capabilities.setCapability(DEVICE_NAME, "emulator-5554");
        capabilities.setCapability(PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(AUTO_GRANT_PERMISSIONS, true);
        capabilities.setCapability(APP, System.getProperty("user.dir") + "/Builds/selendroidApp.apk");
        capabilities.setCapability(APP_PACKAGE, "io.selendroid.testapp");
        capabilities.setCapability(APP_ACTIVITY, "io.selendroid.testapp.HomeScreenActivity");
        mobileDriver = new AppiumDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        mobileDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void afterMethod() {
        mobileDriver.quit();
    }
}
