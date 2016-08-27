package com.example.jk.wikipedia.steps;

import com.example.jk.wikipedia.screens.Home;
import com.example.jk.wikipedia.screens.Login;
import com.example.jk.wikipedia.screens.Menu;
import com.example.jk.wikipedia.screens.Search;
import io.appium.java_client.AppiumDriver;

/**
 * Created by jk on 19/08/2016.
 */
public class When {

    public static void IOpenTheMainMenu(AppiumDriver driver) {
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

    public static void IPressGoBackButtnonOnTheLoginScreen(AppiumDriver driver) {
        Login.pressGoBackButton(driver);
    }

    public static void ITapOnTheSeachBox(AppiumDriver driver) {
        Home.openSearchScreen(driver);
    }

    public static void ISearchFor(AppiumDriver driver, String what) {
        Home.openSearchScreen(driver);
        Search.searchFor(driver, what);
    }

    public static void ICloseTheSearchScren(AppiumDriver driver) {
        Search.close(driver);
    }
}
