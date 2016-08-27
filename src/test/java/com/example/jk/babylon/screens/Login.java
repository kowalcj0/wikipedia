package com.example.jk.babylon.screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by jk on 19/08/2016.
 */
public class Login {
    private static String btnNameGoBack = "Navigate up";
    private static String lblNameScreenTitle = "Log in to Wikipedia";
    private static String inptIDUsername = "login_username_text";
    private static String inptIDPassw = "password_edit_text_input";
    private static String inptIDPasswShow = "password_edit_text_show";
    private static String inptNamePasswShow = "Display password";
    private static String btnIDLogin = "login_button";
    private static String btnNameLogin = "Log in";
    private static String lnkIdRegister = "login_create_account_link";
    private static String lnkNameRegister = "Don't have an account? Join Wikipedia";
    private static String lnkIDPrivacy = "privacy_policy_link";
    private static String lnkNamePrivacy = "Privacy policy";

    public static void allImportantElementsAreVisible(AppiumDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElementByName(btnNameGoBack)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementByName(lblNameScreenTitle)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(inptIDUsername)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(inptIDPassw)));

        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(inptIDPasswShow)));
        assertThat(driver.findElementById(inptIDPasswShow).getAttribute("name"), is(inptNamePasswShow));

        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(btnIDLogin)));
        assertThat(driver.findElementById(btnIDLogin).getAttribute("name"), is(btnNameLogin));

        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(lnkIdRegister)));
        assertThat(driver.findElementById(lnkIdRegister).getAttribute("name"), is(lnkNameRegister));

        wait.until(ExpectedConditions.visibilityOf(driver.findElementById(lnkIDPrivacy)));
        assertThat(driver.findElementById(lnkIDPrivacy).getAttribute("name"), is(lnkNamePrivacy));
    }

    public static void pressGoBackButton(AppiumDriver driver) {
        driver.findElementByName(btnNameGoBack).click();
    }
}
