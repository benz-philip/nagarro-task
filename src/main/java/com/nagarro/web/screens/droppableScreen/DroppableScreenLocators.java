package com.nagarro.web.screens.droppableScreen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DroppableScreenLocators {
    @FindBy(xpath = "//html/body/div[1]")
    WebElement draggableElement;
    @FindBy(xpath = "//html/body/div[2]")
    WebElement droppableElement;
    @FindBy(className = "demo-frame")
    WebElement frame;


    public WebElement getDraggableElement() {
        return draggableElement;
    }

    public WebElement getDroppableElement() {
        return droppableElement;
    }

    public WebElement getFrame() {
        return frame;
    }
}
