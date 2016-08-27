package com.example.jk.wikipedia.tests;

import com.example.jk.wikipedia.steps.And;
import com.example.jk.wikipedia.steps.Given;
import com.example.jk.wikipedia.steps.Then;
import com.example.jk.wikipedia.steps.When;
import org.junit.Test;

public class LoginTest extends UITest {

    @Test
    public void UsersShouldBeAbleToGoBackToTheHomeScreenFromTheLoginScreen(){
        Given.IAmOnTheHomeScreen(driver);

        When.IOpenTheMainMenuOnTheHomeScreen(driver);
        And.when.IChooseToLogin(driver);
        Then.IShouldBeOnTheLoginScreen(driver);

        When.IPressGoBackButtonOnTheLoginScreen(driver);
        Then.IShouldBeOnTheHomeScreen(driver);
    }
}