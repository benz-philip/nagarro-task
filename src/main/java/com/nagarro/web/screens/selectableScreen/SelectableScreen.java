package com.nagarro.web.screens.selectableScreen;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class SelectableScreen {

    WebDriver webDriver;
    SelectableScreenLocators selectableScreenLocators;

    public SelectableScreen(WebDriver webDriver, SelectableScreenLocators selectableScreenLocators) {
        this.webDriver = webDriver;
        this.selectableScreenLocators = selectableScreenLocators;
        PageFactory.initElements(webDriver, selectableScreenLocators);
    }

    public void selectThreeOptions() {
        Actions action = new Actions(webDriver);
        action.moveToElement(selectableScreenLocators.getAllOptions().get(0)).click();
        action.keyDown(Keys.CONTROL);
        action.moveToElement(selectableScreenLocators.getAllOptions().get(2)).click();
        action.moveToElement(selectableScreenLocators.getAllOptions().get(6)).click();
        action.keyUp(Keys.CONTROL).build().perform();
    }
}
