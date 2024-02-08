package br.com.test.core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * TODO: Javadocs
 * */
public final class DriverFactory {

    /**
     * TODO: Javadocs
     * */
    public static WebDriver createWebDriver() {
        // FIXME: Improve here, to change between browsers
        // TODO: Implement browser change here by env so get and enum that contain configs
        final WebDriver webDriver = new ChromeDriver();
        return webDriver;
    }

}
