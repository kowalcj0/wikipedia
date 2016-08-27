package com.example.jk.babylon.tests;

import com.example.jk.babylon.steps.And;
import com.example.jk.babylon.steps.Given;
import com.example.jk.babylon.steps.Then;
import com.example.jk.babylon.steps.When;
import org.junit.Test;

public class LoginTest extends UITest {

    @Test
    public void UsersShouldBeAbleToGoBackToTheHomeScreenFromTheLoginScreen(){
        Given.IAmOnTheHomeScreen(driver);

        When.IOpenTheMainMenu(driver);
        And.when.IChooseToLogin(driver);
        Then.IShouldBeOnTheLoginScreen(driver);

        When.IPressGoBackButtnonOnTheLoginScreen(driver);
        Then.IShouldBeOnTheHomeScreen(driver);
    }
}