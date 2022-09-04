package com.epam.ta.hometask001.ui.propertiesproviders;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SystemProperties {

    private FileInputStream fis;
    private Properties properties;

    public SystemProperties() {
        try {
            fis = new FileInputStream("src/test/resources/system.properties");
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getBaseURL(){
        return properties.getProperty("baseURL");
    }

    public String getBrowser(){
        return properties.getProperty("browser");
    }

    public  String getChromeWedDriverPath(){
        return properties.getProperty("chromeWebDriverPath");
    }
}
