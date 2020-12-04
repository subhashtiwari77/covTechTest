package com.covea.techtest.baseClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    public WebDriver driver;

    public Base(WebDriver newDriver) {
        driver = newDriver;
        PageFactory.initElements(driver, this);
    }
    public void loadPageMaximized(final String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void waitForElementToBeVisible(WebElement element) {
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementToBeClickable(WebElement element) {
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForPageToLoad() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            ExpectedCondition<Boolean> jsLoad = webDriver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
            boolean jsReady = jsExecutor.executeScript("return document.readyState").toString().equals("complete");
            if (!jsReady) {
                wait.until(jsLoad);
            }

    }


}
