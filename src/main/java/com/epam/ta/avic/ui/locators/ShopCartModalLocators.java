package com.epam.ta.avic.ui.locators;

import org.openqa.selenium.By;

public enum ShopCartModalLocators implements BaseLocator {
    SHOP_CART_MODAL(By.xpath("//div[@id='js_cart']")),
    SHOP_CART_MODAL_CAPTION(By.xpath("//div[@id='js_cart']//div[@class='ttl']")),
    SHOP_CART_MODAL_CLOSE_BUTTON(By.xpath("//button[@class ='fancybox-button fancybox-close-small']")),
    SHOP_CART_MODAL_PRODUCTS_LIST(By.xpath("//div[@class='item']")),
    SHOP_CART_MODAL_REMOVE_PRODUCT_BUTTON(By.xpath(".//i[@class='icon icon-close js-btn-close']"));

    private final By path;

    ShopCartModalLocators(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
