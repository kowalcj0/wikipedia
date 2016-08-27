package com.example.jk.wikipedia.tests;

import com.example.jk.wikipedia.steps.Given;
import com.example.jk.wikipedia.steps.Then;
import com.example.jk.wikipedia.steps.When;
import org.junit.Test;

public class HomeScreenTest extends UITest {

    @Test
    public void UsersShouldBeAbleToOpenAndCloseTheMenu(){
        Given.IAmOnTheHomeScreen(driver);

        When.IOpenTheMainMenu(driver);
        Then.IShouldSeeTheMainMenu(driver);

        When.ICloseTheMainMenu(driver);
        Then.IShouldBeOnTheHomeScreen(driver);
    }

}