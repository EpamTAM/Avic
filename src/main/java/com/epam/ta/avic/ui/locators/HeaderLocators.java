package com.epam.ta.avic.ui.locators;

import org.openqa.selenium.By;

public enum HeaderLocators implements BaseLocator {

    SHOP_CART_BUTTON(By.xpath(".//a[contains(@class,'mobile-cart')]")),
    SIGN_IN_BUTTON(By.xpath(".//div[contains(@class, 'header-bottom__login')]//div[contains(@class, 'header-bottom__right-icon')]/../.."));

    private final By path;

    private HeaderLocators(By path) {
        this.path = path;
    }


    @Override
    public By getPath() {
        return path;
    }
}
