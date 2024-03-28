package br.com.test.core.interactions.actions;

import br.com.test.core.driver.DriverManager;
import br.com.test.core.interactions.finder.ElementFinder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

/**
 * Utility class for executing JavaScript code on web elements using Selenium WebDriver.
 */
public final class JS {

    /**
     * Sets the specified attribute to the given value for the web element found by the given locator.
     *
     * @param by the locator strategy to find the web element.
     * @param attribute the name of the attribute to be set.
     * @param value the value to be set for the attribute.
     */
    public void setAttribute(By by, String attribute, Object value) {
        final String script = "arguments[0]." + attribute + " = " + value.toString();
        ((JavascriptExecutor) DriverManager.getWebDriver()).executeScript(script, ElementFinder.findElement(by));
    }
}
