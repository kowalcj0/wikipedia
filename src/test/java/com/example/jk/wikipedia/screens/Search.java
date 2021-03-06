package com.example.jk.wikipedia.screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Search {

    // define all important UI elements
    private static String btnNameMenu = "Navigate up";

    private static String btnIDClose = "search_close_btn";
    private static String btnNameClose = "Clear query";

    private static String inptIDSearch = "search_src_text";
    private static String inptNameSearch = "Search Wikipedia";
    private static String btnIDLanguage = "search_lang_button";
    private static String lblNameRecentSearches = "Recent searches:";

    private static String lstIDSearchResults = "search_results_list";
    private static String lstIDListItem = "page_list_item_container";
    private static String lstIDListItemTitle = "page_list_item_title";

    public static void allImportantElementsAreVisible(AppiumDriver driver){
        /*
        * Will check whether all important UI elements are visible
        * */
        WebDriverWait wait = new WebDriverWait(driver, 5);

        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(btnIDClose)));
        assertThat(driver.findElementById(btnIDClose).getAttribute("name"), is(btnNameClose));

        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(inptIDSearch)));
        assertThat(driver.findElementById(inptIDSearch).getAttribute("name"), is(inptNameSearch));

        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(btnIDLanguage)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementByName(lblNameRecentSearches)));
    }

    public static void openTheMenu(AppiumDriver driver) {
        /*
        * Will tap on the menu button. (which btw. doesn't work :) )
        * */
        driver.findElementByName(btnNameMenu).click();
    }

    public static void searchFor(AppiumDriver driver, String what) {
        /*
        * Will search for the specified term
        * */
        driver.findElementById(inptIDSearch).sendKeys(what);
        driver.hideKeyboard();
    }

    public static void close(AppiumDriver driver) {
        /*
        * Will tap on the close button.
        * As a result you should end up on the Home Screen.
        * */
        driver.findElementById(btnIDClose).click();
    }

    public static void searchResultsShouldBeVisible(AppiumDriver driver, String what) {
        /*
        * Checks whether:
        * - search result list is visible
        * - the result list is not empty
        * - the article titles on the search result list contain sought term
        * */
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(lstIDSearchResults)));

        assert countResultsItems(driver) > 0;

        ArrayList<String> resultTitles = getSearchResultTitles(driver);
        assert isSoughtTermOnTheResultTitlesList(resultTitles, what);
    }

    private static int countResultsItems(AppiumDriver driver) {
        /*
        * Get the number of visible search results
        * */
        List<WebElement> elements = driver.findElements(By.id(lstIDListItem));
        return elements.size();
    }

    private static ArrayList<String> getSearchResultTitles(AppiumDriver driver) {
        /*
        * Will get the titles of all search results
        * */
        List<WebElement> elements = driver.findElements(By.id(lstIDListItemTitle));
        ArrayList<String> result =  new ArrayList<String>();

        for (int i = 0; i < elements.size(); i++) {
            String title = elements.get(i).getText();
            result.add(title);
        }
        return result;
    }

    private static boolean isSoughtTermOnTheResultTitlesList(ArrayList<String> resultTitles, String term) {
        /*
        * Will check if the sought term appears among the search result titles
        * */
        term = term.toLowerCase();
        for(String str: resultTitles) {
            if(str.trim().toLowerCase().contains(term))
                return true;
        }
        return false;
    }
}
