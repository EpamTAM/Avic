package com.epam.ta.avic.ui.pages;

import com.epam.ta.avic.ui.locators.HeaderLocators;
import org.openqa.selenium.WebDriver;

public class Header extends BasePage {

    public Header(WebDriver driver) {
        super(driver);
    }

    public SignInPage openSignInPage() {
        driver.findElement(HeaderLocators.SIGN_IN_BUTTON.getPath()).click();
        return new SignInPage(driver);
    }
}
