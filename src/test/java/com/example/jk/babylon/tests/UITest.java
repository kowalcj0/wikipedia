package com.example.jk.babylon.tests;

/**
 * Created by kowal on 27/08/2016.
 */

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UITest {

        public AppiumDriver driver;
        private WebDriverWait wait;

        // app to install - details
        final String testAppPackage = "org.wikipedia.beta";
        final String testAppActivity = "org.wikipedia.MainActivity";

        @Before
        public void setUp() throws Exception {
            // launch the app
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), installedAppCaps());
            driver.launchApp();
            wait = new WebDriverWait(driver, 60);

            // wait until app loads and an element that should 100% be there is displayed
            WebElement btnVoiceSearch = wait.until(ExpectedConditions.visibilityOf(driver.findElementById("voice_search_button")));
            assertThat(btnVoiceSearch.getAttribute("name"), is("Search Wikipedia"));
        }

        @After
        public void tearDown() throws Exception {
            driver.resetApp();
            driver.quit();
        }

        private DesiredCapabilities installedAppCaps() throws Exception {
        /*
        * set up capabilities for the test app
        * */
            DesiredCapabilities capabilities = DesiredCapabilities.android();
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Oppo Find7");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 180);
            capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.4.16");
            capabilities.setCapability("deviceOrientation", "portrait");
            capabilities.setCapability("autoLaunch", "false");
            capabilities.setCapability("appPackage", testAppPackage);
            capabilities.setCapability("appActivity", testAppActivity);

            return capabilities;
        }
}
