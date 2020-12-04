package com.covea.techtest.baseClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverIntializer {
    private static WebDriver driver = null;
    public static WebDriver getDriver(String browserType){
        switch (browserType) {
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "Firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException(
                        "Invalid driver. Choose between " + "Chrome, " + "Firefox, ");
        }
        return driver;
    }
//
//    public static void closeWindow() {
//        if (null == driver) {
//            return;
//        }
//        driver.quit();
//        driver = null;
//    }
}
