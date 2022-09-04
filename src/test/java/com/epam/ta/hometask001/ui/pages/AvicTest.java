package com.epam.ta.hometask001.ui.pages;

import com.epam.ta.hometask001.ui.runner.TestRunner;
import org.testng.annotations.Test;

public class AvicTest extends TestRunner {

    @Test(description = "verifies that test framework runs")
    public void runFrameworkTest() {

        HomePage homePage = new HomePage(driver).closePopUpIfVisible()
                .waitHomePage();
    }
}
