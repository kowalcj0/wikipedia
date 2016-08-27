package com.example.jk.wikipedia.tests;

import com.example.jk.wikipedia.steps.Given;
import com.example.jk.wikipedia.steps.Then;
import com.example.jk.wikipedia.steps.When;
import org.junit.Test;

public class SearchTest extends UITest {

    @Test
    public void UsersShouldBeAbleToSearchForArticles(){
        Given.IAmOnTheHomeScreen(driver);

        When.ISearchFor(driver, "wikipedia");

        Then.TheSearchResultsShouldBeVisible(driver, "wikipedia");
    }

}