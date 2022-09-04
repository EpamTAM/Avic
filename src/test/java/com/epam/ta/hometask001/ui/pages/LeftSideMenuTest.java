package com.epam.ta.hometask001.ui.pages;

import com.epam.ta.hometask001.ui.runner.TestRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.ta.hometask001.ui.locators.HomePageLocators.*;

public class LeftSideMenuTest extends TestRunner {

    @Test(description = "Verify that user able to open left side menu item")
    public void verifyThatLeftSideMenuItemOpens() {
        String actualTitle = new HomePage(driver)
                .openMenuItem(driver.findElement(MENU_ITEM_COMPUTERS_BY_INDEX.getPath()))
                .getCategoryTitle();
        String expectedTitle = "Комп'ютери";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(description = "Verify that user able to open left side submenu item")
    public void verifyThatLeftSideSubMenuItemOpens() {
        System.out.println(driver.getCurrentUrl());
        new HomePage(driver)
                .openSubMenuItem(driver.findElement(MENU_ITEM_COMPUTERS_BY_INDEX.getPath())
                        , driver.findElement(MENU_SUBMENU_ITEM_MONITORS.getPath()));
    }
}
