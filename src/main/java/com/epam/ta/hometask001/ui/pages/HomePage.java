package com.epam.ta.hometask001.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.epam.ta.hometask001.ui.pages.locators.HomePageLocators.*;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super (driver);
   }

    public HomePage closePopUpIfVisible() {

        try {
            new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(POP_UP_CLOSE_BUTTON.getPath()));
            driver.findElement(POP_UP_CLOSE_BUTTON.getPath()).click();
        } catch (TimeoutException e) {
        }
        return this;
    }

    public HomePage waitHomePage() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

}
