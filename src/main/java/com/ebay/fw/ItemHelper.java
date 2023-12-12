package com.ebay.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemHelper extends BaseHelper{

    public ItemHelper(WebDriver driver) {
        super(driver);
    }

    public String getSecondItemName(String second) {
        return driver.findElement(By.cssSelector(".s-item:nth-child(" + second + ")  h3")).getText();
    }

    public void enterSecondItemNameToSearch(String secondItem) {
        type(By.id("gh-ac"),secondItem);
    }

    public void clickOnFindenButton() {
        click(By.id("gh-btn"));
    }

    public String getFirstItemName(String firstItem) {
        return  driver.findElement
                (By.xpath("//ul/li/div/div["+ firstItem +"]/a/div/span")).getText();
    }
}
