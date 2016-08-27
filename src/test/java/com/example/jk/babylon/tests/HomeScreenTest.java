package com.example.jk.babylon.tests;

import com.example.jk.babylon.steps.And;
import com.example.jk.babylon.steps.Given;
import com.example.jk.babylon.steps.Then;
import com.example.jk.babylon.steps.When;
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