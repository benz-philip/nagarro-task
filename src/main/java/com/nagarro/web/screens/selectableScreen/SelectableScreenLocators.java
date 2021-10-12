package com.nagarro.web.screens.selectableScreen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SelectableScreenLocators {

    @FindBy(xpath = "//html/body/ol/li")
    List<WebElement> allOptions;


    public List <WebElement> getAllOptions() {
        return allOptions;
    }
}
