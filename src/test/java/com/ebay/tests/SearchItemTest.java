package com.ebay.tests;

import com.ebay.utils.SearchData;
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
        String secondItem = app.getItem().getSecondItemName(SearchData.ITEM);
        System.out.println(secondItem);
    }
}


    /*   Remember second element in search results
        Enter the memorized value in the search bar
        Find and check that the product name matches the stored value*/


