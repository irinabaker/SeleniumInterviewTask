package com.ebay.fw;

import com.ebay.utils.MyListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class ApplicationManager {
    WebDriver driver;

    Logger logger = LoggerFactory.getLogger(ApplicationManager.class);

    SearchHelper search;
    ItemHelper item;

    public void init() {

        driver = new FirefoxDriver();
        logger.info("Test starts in Mozilla browser");

        WebDriverListener listener = new MyListener();
        driver = new EventFiringDecorator<>(listener).decorate(driver);

        driver.get("https://www.ebay.de");
        logger.info("Current URL -> " + driver.getCurrentUrl());

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
