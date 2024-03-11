package br.com.test.core.driver;

import org.openqa.selenium.WebDriver;

/**
 * TODO: Javadocs
 * */
public final class DriverManager {

    private DriverManager() {}

    private static final ThreadLocal<WebDriver> webDriverPool = new ThreadLocal<>();

    /**
     * TODO: Javadocs
     * */
    public static void initializeWebDriver() {
        webDriverPool.set(DriverFactory.createWebDriver());
    }

    /**
     * TODO: Javadocs
     * */
    public static WebDriver getWebDriver() {
        return webDriverPool.get();
    }

    /**
     * TODO: Javadocs
     * */
    public static void killWebDriver() {
        final WebDriver webDriver = getWebDriver();

        if (webDriver != null) {
            webDriver.quit();
        }

        webDriverPool.remove();
    }
}
