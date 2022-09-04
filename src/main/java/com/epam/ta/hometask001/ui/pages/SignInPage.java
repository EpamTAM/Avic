package com.epam.ta.hometask001.ui.pages;

import org.openqa.selenium.WebDriver;

import static com.epam.ta.hometask001.ui.locators.SignInLocators.*;

public class SignInPage extends BasePage{

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public String getPageCaption() {
        return driver.findElement(SIGN_IN_CAPTION.getPath()).getText();
    }
}
