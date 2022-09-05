package com.epam.ta.avic.ui.pages;

import com.epam.ta.avic.ui.locators.SubCategoryPageLocators;
import org.openqa.selenium.WebDriver;

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
        System.out.println("Text - " + driver.findElement(SubCategoryPageLocators.SUB_CATEGORY_TITLE.getPath()).getText() );
        return driver.findElement(SubCategoryPageLocators.SUB_CATEGORY_TITLE.getPath()).getText();
    }
}
