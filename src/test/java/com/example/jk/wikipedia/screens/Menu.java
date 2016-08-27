package com.example.jk.wikipedia.screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Menu {

    private static String btnLogIn = "Log in to Wikipedia";
    private static String btnLogInId = "nav_account_text";

    private static String btnExplore = "Explore";
    private static String btnHistory = "History";
    private static String btnReadingList = "Reading lists";
    private static String btnNearby = "Nearby";
    private static String btnRandom = "Random";
    private static String btnSettings = "Settings";
    private static String btnSupportWiki = "Support Wikipedia";

    public static void allImportantElementsAreVisible(AppiumDriver driver){
        /*
        * Will check whether all important UI elements are visible
        * */
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElementByName(btnLogIn)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementByName(btnExplore)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementByName(btnHistory)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementByName(btnReadingList)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementByName(btnNearby)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementByName(btnRandom)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementByName(btnSettings)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementByName(btnSupportWiki)));
    }

    public static void goToLoginScreen(AppiumDriver driver) {
        driver.findElementById(btnLogInId).click();
    }

    public static void openRandomArticle(AppiumDriver driver) {
        driver.findElementByName(btnRandom).click();
    }

    public static void close(AppiumDriver driver) {
        driver.navigate().back();
    }
}
