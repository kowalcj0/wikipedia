package com.example.jk.wikipedia.steps;

import com.example.jk.wikipedia.screens.*;
import io.appium.java_client.AppiumDriver;

public class When {

    public static void IOpenTheMainMenuOnTheHomeScreen(AppiumDriver driver) {
        Home.openMenu(driver);
    }

    public static void ICloseTheMainMenu(AppiumDriver driver) {
        Menu.close(driver);
    }

    public void IChooseRandomArticleOption(AppiumDriver driver) {
        Menu.openRandomArticle(driver);
    }

    public void IChooseToLogin(AppiumDriver driver) {
        Menu.goToLoginScreen(driver);
    }

    public static void IPressGoBackButtonOnTheLoginScreen(AppiumDriver driver) {
        Login.pressGoBackButton(driver);
    }

    public static void ITapOnTheSearchBox(AppiumDriver driver) {
        Home.openSearchScreen(driver);
    }

    public static void ISearchFor(AppiumDriver driver, String what) {
        Home.openSearchScreen(driver);
        Search.searchFor(driver, what);
    }

    public static void ICloseTheSearchScren(AppiumDriver driver) {
        Search.close(driver);
    }

    public static void IOpenARandomArticle(AppiumDriver driver) {
        /*
        * Will open the menu and click on the "Random" option
        * Before tapping on the menu button, it will detect on which screen are we.
        * */
        if (Home.amIOnThisScreen(driver))
            When.IOpenTheMainMenuOnTheHomeScreen(driver);
        else if (Article.amIOnThisScreen(driver))
            When.IOpenTheMainMenuOnTheArticleScreen(driver);

        And.when.IChooseRandomArticleOption(driver);
    }

    private static void IOpenTheMainMenuOnTheArticleScreen(AppiumDriver driver) {
        Article.openMenu(driver);
    }
}
