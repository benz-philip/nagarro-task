package com.nagarro.controllers;

import com.nagarro.web.screens.screensHandler.WebScreensHandler;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public class WebController {
    public static WebDriver webDriver;
    public static JavascriptExecutor executor;
    public WebScreensHandler webScreensHandler = new WebScreensHandler();

    @BeforeMethod
    public void beforeMethod() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://jqueryui.com/");
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        executor = (JavascriptExecutor) webDriver;
    }

    @AfterMethod
    public void afterMethod() {
        webDriver.quit();
    }
}
