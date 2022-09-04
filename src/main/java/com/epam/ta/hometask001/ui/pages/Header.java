package com.epam.ta.hometask001.ui.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;

import static com.epam.ta.hometask001.ui.locators.HeaderLocators.*;

public class Header extends BasePage {

    public Header(WebDriver driver) {
        super(driver);
    }

    //    public ShopCart openShopCart(){
//        Actions move = new Actions(driver);
//        move.moveToElement( driver.findElement(SHOP_CART_BUTTON.getPath())).build().perform();
//
//        try {
//            Thread.sleep(90000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//       //driver.findElement(SHOP_CART_BUTTON.getPath()).click();
//        return new ShopCart(driver);
//    }
    public SignInPage openSignInPage() {
        driver.findElement(SIGN_IN_BUTTON.getPath()).click();
        return new SignInPage(driver);
    }
}
