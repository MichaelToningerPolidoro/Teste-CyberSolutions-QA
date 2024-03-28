package br.com.test.core.interactions.finder;

import br.com.test.core.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Utility class for finding web elements on web pages using Selenium WebDriver.
 */
public final class ElementFinder {

    private ElementFinder() {}

    /**
     * Finds and returns the web element identified by the given locator.
     *
     * @param by the locator strategy to find the web element.
     * @return the web element found by the given locator.
     */
    public static WebElement findElement(By by) {
        return DriverManager.getWebDriver().findElement(by);
    }
}
