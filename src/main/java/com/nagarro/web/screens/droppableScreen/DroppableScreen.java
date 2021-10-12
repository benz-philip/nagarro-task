package com.nagarro.web.screens.droppableScreen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class DroppableScreen {

    WebDriver webDriver;
    DroppableScreenLocators droppableScreenLocators;

    public DroppableScreen(WebDriver webDriver, DroppableScreenLocators droppableScreenLocators) {
        this.webDriver = webDriver;
        this.droppableScreenLocators = droppableScreenLocators;
        PageFactory.initElements(webDriver, droppableScreenLocators);
    }

    public void switchToIframe(){
        webDriver.switchTo().frame(droppableScreenLocators.getFrame());
    }
    public void dragAndDropSquare() {
        
        Actions action = new Actions(webDriver);
        Action dragAndDrop = action.clickAndHold(droppableScreenLocators.getDraggableElement())
                .moveToElement(droppableScreenLocators.getDroppableElement())
                .release(droppableScreenLocators.getDroppableElement())
                .build();
        dragAndDrop.perform();
    }
}
