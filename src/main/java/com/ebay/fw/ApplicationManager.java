package com.ebay.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ApplicationManager {
    WebDriver driver;

    SearchHelper search;
    ItemHelper item;

    public void init() {

        driver = new FirefoxDriver();
        driver.get("https://www.ebay.de");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        search = new SearchHelper(driver);
        item = new ItemHelper(driver);
    }

    public void stop() {
        driver.quit();
    }

    public SearchHelper getSearch() {
        return search;
    }

    public ItemHelper getItem() {
        return item;
    }
}
