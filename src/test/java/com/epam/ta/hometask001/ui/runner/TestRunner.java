package com.epam.ta.hometask001.ui.runner;

import com.epam.ta.hometask001.ui.propertiesproviders.SystemProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestRunner {
    protected static WebDriver driver;
    private SystemProperties systemProperties = new SystemProperties();

    @BeforeMethod
    public void getDriver() {
        switch (systemProperties.getBrowser()) {
            case "chrome": {
                System.setProperty("webdriver.chrome.driver", systemProperties.getChromeWedDriverPath());
                driver = new ChromeDriver();
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid browser");
            }
        }
        driver.manage().window().maximize();
        driver.get(systemProperties.getBaseURL());
        driver.manage().timeouts().pageLoadTimeout(120l, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void quiteDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
