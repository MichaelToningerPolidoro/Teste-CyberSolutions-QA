package br.com.test.core.driver;

import org.openqa.selenium.WebDriver;

/**
 * TODO: Javadocs
 * */
public final class DriverProvider {

    // TODO: Maybe ThreadLocal here too
    private static final ThreadLocal<WebDriver> webDriverPool = new ThreadLocal<>();

    /**
     * TODO: Javadocs
     * */
    public static WebDriver getWebDriver() {
        if (webDriverPool.get() == null) {
            webDriverPool.set(DriverFactory.createWebDriver());
        }

        return webDriverPool.get();
    }
}
