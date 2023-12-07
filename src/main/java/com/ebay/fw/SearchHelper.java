package com.ebay.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchHelper extends BaseHelper{
    public SearchHelper(WebDriver driver) {
        super(driver);
    }

    public void selectDepartment(String department) {
        click(By.cssSelector(".vl-flyout-nav__js-tab:nth-child(" + department + ")"));
    }

    public void selectSection(String type) {
        click(By.cssSelector(".b-visualnav__tile:nth-child(" + type + ")"));
    }

}
