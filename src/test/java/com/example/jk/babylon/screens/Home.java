package com.example.jk.babylon.screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by jk on 19/08/2016.
 */
public class Home {

    private static String btnMenu = "android.widget.ImageButton";
    private static String txtTitle = "Explore";
    private static String inptSearch = "Search Wikipedia";
    private static String hdrInTheNews = "In the news";
    private static String hdrFeaturedArticle = "Featured article";

    public static void allImportantElementsAreVisible(AppiumDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(btnMenu))));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementByName(txtTitle)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementByName(inptSearch)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementByName(hdrInTheNews)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementByName(hdrFeaturedArticle)));
    }

    public static void openMenu(AppiumDriver driver) {
        driver.findElement(By.className(btnMenu)).click();
    }

    public static void openSearchScreen(AppiumDriver driver, String what) {
        driver.findElementById(inptSearch).click();
    }
}
