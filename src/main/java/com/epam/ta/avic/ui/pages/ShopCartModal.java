package com.epam.ta.avic.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static com.epam.ta.avic.ui.locators.ShopCartModalLocators.*;

public class ShopCartModal extends BasePage {

    public ShopCartModal(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayed() {
        return driver.findElement(SHOP_CART_MODAL.getPath()).getAttribute("style")
                .equals("display: inline-block;");
    }

    public String getTitle() {
        return driver.findElement(SHOP_CART_MODAL_CAPTION.getPath()).getText();
    }

    public Header closeShopCart() {
        new WebDriverWait(driver, 20L)
                .until(ExpectedConditions.elementToBeClickable(SHOP_CART_MODAL_CLOSE_BUTTON.getPath()))
                .click();
        return new Header(driver);
    }

    public Header removeFirstProduct() {
        List<WebElement> productsList = driver.findElements(SHOP_CART_MODAL_PRODUCTS_LIST.getPath());
        if (productsList.size() != 0) {
            productsList.get(0).findElement(SHOP_CART_MODAL_REMOVE_PRODUCT_BUTTON.getPath()).click();
        }
        return new Header(driver);
    }
}
