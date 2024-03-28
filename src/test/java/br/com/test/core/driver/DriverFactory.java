package br.com.test.core.driver;

import br.com.test.core.settings.EnvVarsProvider;
import org.openqa.selenium.WebDriver;

/**
 * Utility class for creating WebDriver instances.
 */
public final class DriverFactory {

    /**
     * Creates a new instance of WebDriver with default configurations.
     *
     * @return a new instance of WebDriver.
     */
    public static WebDriver createWebDriver() {
        final Browser browser = Browser.valueOf(EnvVarsProvider.getBrowser().toUpperCase());
        final boolean headless = Boolean.parseBoolean(EnvVarsProvider.getHeadless().toLowerCase());

        return browser.startDriver(browser.getCapabilities(headless));
    }

}
