UI tests for Android Wikipedia app
----------------------------------
Example UI tests automated with [appium.io](http://appium.io)


# Requirements

* [Oracle Java SDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Android SDK](https://developer.android.com/studio/index.html)
* [Appium desktop app](http://appium.io/downloads.html) (only windows and mac osx build are available atm)
* Java IDE (preferably [Intellij Idea](https://www.jetbrains.com/idea/#chooseYourEdition))
* a physical Android device or a simulator
* [Wikipedia](https://play.google.com/store/apps/details?id=org.wikipedia) app installed on this ^^^ device


# Running the tests

To run the tests you'll have to:
* start the Appium Node Server
* run the tests from the IDE

## Starting the Appium Node Server
Open up the Appium desktop app that you've installed earlier.
Then press the "▶" (play) button (in the top-right corner of the app) to start server

## Running the tests in the IDE

To run all the tests:  
Simply right click on the `com.example.jk.wikipedia.tests` package and choose `Run 'Tests in ...`

To run a specific test class, i.e. "LoginTest":  
Right click on it and choose `Run 'LoginTest'`

To run a specific test scenario:  
Open a test class, select the scenario, right click on it's name and choose `Run 'scenario_name_goes_here'`

