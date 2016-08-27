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

        When.IOpenTheMainMenu(driver);
        And.when.IChooseToLogin(driver);
        Then.IShouldBeOnTheLoginScreen(driver);

        When.IPressGoBackButtnonOnTheLoginScreen(driver);
        Then.IShouldBeOnTheHomeScreen(driver);
    }
}