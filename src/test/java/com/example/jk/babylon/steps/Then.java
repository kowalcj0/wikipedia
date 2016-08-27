package com.example.jk.babylon.steps;

import com.example.jk.babylon.screens.*;
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
}
