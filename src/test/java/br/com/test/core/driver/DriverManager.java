package br.com.test.core.driver;

import org.openqa.selenium.WebDriver;

/**
 * TODO: Javadocs
 * */
public final class DriverManager {

    /**
     * TODO: Javadocs
     * */
    public static void initializeWebDriver() {
        DriverProvider.getWebDriver();
    }

    /**
     * TODO: Javadocs
     * */
    public static void killWebDriver() {
        final WebDriver webDriver = DriverProvider.getWebDriver();

        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
