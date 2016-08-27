package com.example.jk.wikipedia.steps;

import com.example.jk.wikipedia.screens.*;
import io.appium.java_client.AppiumDriver;

/**
 * Created by jk on 19/08/2016.
 */
public class Then {

    public static void IShouldBeOnTheLoginScreen(AppiumDriver driver){
        Login.allImportantElementsAreVisible(driver);
    }

    public static void IShouldSeeTheMainMenu(AppiumDriver driver) {
        Menu.allImportantElementsAreVisible(driver);
    }

    public static void IShouldBeOnTheHomeScreen(AppiumDriver driver) {
        Home.allImportantElementsAreVisible(driver);
    }

    public static void IShouldBeOnTheArticleScreen(AppiumDriver driver) {
        Article.allImportantElementsAreVisible(driver);
    }

    public static void IShouldBeOnTheSearchScreen(AppiumDriver driver) {
        Search.allImportantElementsAreVisible(driver);
    }

    public static void TheSearchResultsShouldBeVisible(AppiumDriver driver, String what) {
        Search.searchResultsShouldBeVisible(driver, what);
    }
}
