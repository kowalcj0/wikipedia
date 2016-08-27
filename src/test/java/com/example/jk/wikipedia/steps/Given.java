package com.example.jk.wikipedia.steps;

import io.appium.java_client.AppiumDriver;

import com.example.jk.wikipedia.screens.Home;

public class Given {

    public static void IAmOnTheHomeScreen(AppiumDriver driver){
        Home.allImportantElementsAreVisible(driver);
    }

}
