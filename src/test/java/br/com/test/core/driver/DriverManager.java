package br.com.test.core.driver;

import org.openqa.selenium.WebDriver;

/**
 * Utility class for managing WebDriver instances.
 */
public final class DriverManager {

    private DriverManager() {}

    private static final ThreadLocal<WebDriver> webDriverPool = new ThreadLocal<>();

    /**
     * Initializes the WebDriver instance for the current test execution.
     */
    public static void initializeWebDriver() {
        webDriverPool.set(DriverFactory.createWebDriver());
    }

    /**
     * Gets the current WebDriver instance associated with the current thread.
     *
     * @return the current WebDriver instance.
     */
    public static WebDriver getWebDriver() {
        return webDriverPool.get();
    }

    /**
     * Kills the WebDriver instance associated with the current thread.
     */
    public static void killWebDriver() {
        final WebDriver webDriver = getWebDriver();

        if (webDriver != null) {
            webDriver.quit();
        }

        webDriverPool.remove();
    }
}
