package com.example.jk.wikipedia.tests;

import com.example.jk.wikipedia.steps.And;
import com.example.jk.wikipedia.steps.Given;
import com.example.jk.wikipedia.steps.Then;
import com.example.jk.wikipedia.steps.When;
import org.junit.Test;

public class RandomArticleTest extends UITest {

    @Test
    public void UsersShouldBeAbleToOpenARandomArticle(){
        Given.IAmOnTheHomeScreen(driver);

        When.IOpenTheMainMenu(driver);
        And.when.IChooseRandomArticleOption(driver);

        Then.IShouldBeOnTheArticleScreen(driver);
    }

}