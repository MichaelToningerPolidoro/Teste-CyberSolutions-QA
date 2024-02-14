package br.com.test.core.driver;

import org.openqa.selenium.WebDriver;

/**
 * TODO: Javadocs
 * */
public final class DriverManager {

    private static final ThreadLocal<WebDriver> webDriverPool = new ThreadLocal<>();

    /**
     * TODO: Javadocs
     * */
    public static void initializeWebDriver() {
        getWebDriver();
    }

    /**
     * TODO: Javadocs
     * */
    public static WebDriver getWebDriver() {
        if (webDriverPool.get() == null) {
            webDriverPool.set(DriverFactory.createWebDriver());
        }

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
