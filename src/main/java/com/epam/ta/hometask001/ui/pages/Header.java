package com.epam.ta.hometask001.ui.pages;

import org.openqa.selenium.WebDriver;

import static com.epam.ta.hometask001.ui.locators.HeaderLocators.*;

public class Header extends BasePage {

    public Header(WebDriver driver) {
        super(driver);
    }

    public SignInPage openSignInPage() {
        driver.findElement(SIGN_IN_BUTTON.getPath()).click();
        return new SignInPage(driver);
    }
}
