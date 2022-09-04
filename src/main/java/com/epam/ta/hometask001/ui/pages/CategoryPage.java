package com.epam.ta.hometask001.ui.pages;

import org.openqa.selenium.WebDriver;

import static com.epam.ta.hometask001.ui.locators.CategoryPageLocators.*;

public class CategoryPage extends BasePage{

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public String getCategoryTitle(){
        return driver.findElement(CATEGORY_TITLE.getPath()).getText();
    }
}
