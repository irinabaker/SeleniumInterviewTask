package com.ebay.tests;

import com.ebay.utils.SearchData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchItemTest extends TestBase{

    @BeforeMethod
    public void precondition() {
        app.getSearch().selectDepartment(SearchData.DEP);
        app.getSearch().selectSection(SearchData.TYPE);
        app.getSearch().selectSection(SearchData.BRAND);
    }

    @Test
    public void searchItemPositiveTest() {
        String secondItem = app.getItem().getSecondItemName(SearchData.SECOND_ITEM);
       // System.out.println(secondItem);
        app.getItem().enterSecondItemNameToSearch(secondItem);
        app.getItem().clickOnFindenButton();

        String firstItem = app.getItem().getFirstItemName(SearchData.FIRST_ITEM);
        System.out.println(firstItem);

        Assert.assertEquals(firstItem,secondItem);
    }
}



