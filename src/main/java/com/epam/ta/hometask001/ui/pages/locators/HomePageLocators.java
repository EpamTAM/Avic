package com.epam.ta.hometask001.ui.pages.locators;

import org.openqa.selenium.By;

public enum HomePageLocators implements BaseLocator {

    POP_UP_CLOSE_BUTTON (By.xpath(".//div[@id ='js_popUp']//button[@title='Close']"));

    private  final By path;

    private HomePageLocators(By path){
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
