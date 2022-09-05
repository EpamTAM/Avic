package com.epam.ta.avic.ui.locators;

import org.openqa.selenium.By;

public enum SubCategoryPageLocators implements BaseLocator {
    SUB_CATEGORY_TITLE(By.xpath("//div[@class='page-title page-title-category']"));

    private final By path;

    SubCategoryPageLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
