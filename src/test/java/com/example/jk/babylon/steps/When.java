package com.example.jk.babylon.steps;

import com.example.jk.babylon.screens.Home;
import com.example.jk.babylon.screens.Login;
import com.example.jk.babylon.screens.Menu;
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
}
