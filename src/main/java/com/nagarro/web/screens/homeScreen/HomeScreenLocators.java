package com.nagarro.web.screens.homeScreen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeScreenLocators {

    @FindBy(linkText = "Droppable")
    WebElement droppableButton;
    @FindBy(linkText = "Selectable")
    WebElement selectableButton;
    @FindBy(linkText = "Controlgroup")
    WebElement controlGroupButton;


    public WebElement getDroppableButton() {
        return droppableButton;
    }

    public WebElement getSelectableButton() {
        return selectableButton;
    }

    public WebElement getControlGroupButton() {
        return controlGroupButton;
    }
}
