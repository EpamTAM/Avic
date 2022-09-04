package com.epam.ta.hometask001.ui.locators;

import org.openqa.selenium.By;

public enum SignInLocators implements BaseLocator {
    SIGN_IN_CAPTION(By.xpath("//div[@class='page-title']"));

    private final By path;

    SignInLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
