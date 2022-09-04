package com.epam.ta.hometask001.ui.pages;

import org.openqa.selenium.WebDriver;

import static com.epam.ta.hometask001.ui.locators.SubCategoryPageLocators.*;

public class SubCategoryPage extends BasePage{

    public SubCategoryPage(WebDriver driver) {
        super(driver);
    }

    public String getSubCategoryTitle() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Text - " + driver.findElement(SUB_CATEGORY_TITLE.getPath()).getText() );
        return driver.findElement(SUB_CATEGORY_TITLE.getPath()).getText();
    }
}
