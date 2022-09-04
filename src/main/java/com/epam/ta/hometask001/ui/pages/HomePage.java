package com.epam.ta.hometask001.ui.pages;



import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.epam.ta.hometask001.ui.locators.HomePageLocators.*;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver){

        super (driver);
        closePopUpIfVisible();
   }

    private HomePage closePopUpIfVisible() {
        try {
            new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(POP_UP_CLOSE_BUTTON.getPath()));
            driver.findElement(POP_UP_CLOSE_BUTTON.getPath()).click();
        } catch (TimeoutException e) {
        }
        return this;
    }

    public Header getHeader(){
        return new Header(driver);
    }

    public CategoryPage openMenuItem(WebElement webElement) {
        webElement.click();
        return new CategoryPage(driver);
    }

    public SubCategoryPage openSubMenuItem(WebElement parent, WebElement webElement) {
        Actions moveMouse = new Actions(driver);
        moveMouse.moveToElement(parent)
                .build().perform();
        webElement.click();
        return new SubCategoryPage(driver);
    }

}
