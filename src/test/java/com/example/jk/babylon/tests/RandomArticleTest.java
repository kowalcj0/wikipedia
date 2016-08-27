package com.example.jk.babylon.tests;

import com.example.jk.babylon.steps.And;
import com.example.jk.babylon.steps.Given;
import com.example.jk.babylon.steps.Then;
import com.example.jk.babylon.steps.When;
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