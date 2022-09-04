package com.epam.ta.hometask001.ui.pages;

import com.epam.ta.hometask001.ui.runner.TestRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends TestRunner {

    @Test (description = "Verify that user able to open Sign In page")
    public void verifiesThatSignInOpens(){
        String actualCaption = new HomePage(driver)
                .getHeader()
                .openSignInPage()
                .getPageCaption();
        String expectedCaption = "Вхід та реєстрація";
        Assert.assertEquals(actualCaption, expectedCaption);
    }
}
