package com.nagarro.web.screens.screensHandler;

import com.nagarro.web.screens.controlGroupScreen.ControlGroupScreen;
import com.nagarro.web.screens.controlGroupScreen.ControlGroupScreenLocators;
import com.nagarro.web.screens.droppableScreen.DroppableScreen;
import com.nagarro.web.screens.droppableScreen.DroppableScreenLocators;
import com.nagarro.web.screens.homeScreen.HomeScreen;
import com.nagarro.web.screens.homeScreen.HomeScreenLocators;
import com.nagarro.web.screens.selectableScreen.SelectableScreen;
import com.nagarro.web.screens.selectableScreen.SelectableScreenLocators;

import static com.nagarro.controllers.WebController.webDriver;


public class WebScreensHandler {
    public HomeScreen getHomScreen() {
        return new HomeScreen(webDriver, new HomeScreenLocators());
    }

    public DroppableScreen getDroppableScreen() {
        return new DroppableScreen(webDriver, new DroppableScreenLocators());
    }

    public SelectableScreen getSelectableScreen() {
        return new SelectableScreen(webDriver, new SelectableScreenLocators());
    }

    public ControlGroupScreen getControlGroupScreen() {
        return new ControlGroupScreen(webDriver, new ControlGroupScreenLocators());
    }
}
