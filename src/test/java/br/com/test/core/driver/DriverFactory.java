package br.com.test.core.driver;

import br.com.test.core.settings.EnvVarsProvider;
import org.openqa.selenium.WebDriver;

/**
 * TODO: Javadocs
 * */
public final class DriverFactory {

    /**
     * TODO: Javadocs
     * */
    public static WebDriver createWebDriver() {
        final Browser browser = Browser.valueOf(EnvVarsProvider.getBrowser().toUpperCase());
        final boolean headless = Boolean.parseBoolean(EnvVarsProvider.getHeadless().toLowerCase());

        return browser.startDriver(browser.getCapabilities(headless));
    }

}
