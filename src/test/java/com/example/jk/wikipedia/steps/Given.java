package com.example.jk.wikipedia.steps;

import io.appium.java_client.AppiumDriver;

import com.example.jk.wikipedia.screens.Home;

/**
 * Created by jk on 19/08/2016.
 */
public class Given {

    public static void IAmOnTheHomeScreen(AppiumDriver driver){
        Home.allImportantElementsAreVisible(driver);
    }

}