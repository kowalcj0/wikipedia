package com.example.jk.wikipedia.screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Article {

    private static String btnMenu = "android.widget.ImageButton";
    private static String inptIDSearch = "main_search_bar_text";
    private static String inptNameSearch = "Search Wikipedia";
    private static String btnIDShowTabs = "menu_page_show_tabs";
    private static String btnNameShowTabs = "Show tabs";
    private static String btnNameMoreOptions = "More options";
    private static String btnIDAddToReadingList = "view_article_menu_bar_bookmark";
    private static String btnNameAddToReadingList = "Add this article to a reading list";
    private static String btnIDShareArticle = "view_article_menu_bar_share";
    private static String btnNameShareArticle = "Share the article link";
    private static String btnIDTOC = "floating_toc_button";
    private static String btnNameTOC = "Table of Contents";


    public static void allImportantElementsAreVisible(AppiumDriver driver){
        /*
        * Will check whether all important UI elements are visible
        * */
        WebDriverWait wait = new WebDriverWait(driver, 5);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(btnMenu))));

        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(inptIDSearch)));
        assertThat(driver.findElementById(inptIDSearch).getAttribute("name"), is(inptNameSearch));

        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(btnIDShowTabs)));
        assertThat(driver.findElementById(btnIDShowTabs).getAttribute("name"), is(btnNameShowTabs));

        wait.until(ExpectedConditions.visibilityOf(driver.findElementByName(btnNameMoreOptions)));

        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(btnIDAddToReadingList)));
        assertThat(driver.findElementById(btnIDAddToReadingList).getAttribute("name"), is(btnNameAddToReadingList));

        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(btnIDShareArticle)));
        assertThat(driver.findElementById(btnIDShareArticle).getAttribute("name"), is(btnNameShareArticle));

        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(btnIDTOC)));
        assertThat(driver.findElementById(btnIDTOC).getAttribute("name"), is(btnNameTOC));
    }

    public static void openMenu(AppiumDriver driver) {
        driver.findElement(By.className(btnMenu)).click();
    }

    public static void openSearchScreen(AppiumDriver driver, String what) {
        driver.findElementById(inptIDSearch).click();
    }

    public static boolean amIOnThisScreen(AppiumDriver driver) {
        if(!driver.findElements(By.id(btnIDTOC)).isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}
