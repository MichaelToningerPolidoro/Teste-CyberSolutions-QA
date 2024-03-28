package br.com.test.core.interactions.actions;

import br.com.test.core.interactions.finder.ElementFinder;
import org.openqa.selenium.By;

/**
 * Utility class for retrieving attributes and text from web elements using Selenium WebDriver.
 */
public final class Attribute {

    /**
     * Gets the visible text of the web element found by the given locator.
     *
     * @param by the locator strategy to find the web element.
     * @return the visible text of the web element.
     */
    public String getText(By by) {
        return get(by, "value");
    }

    /**
     * Gets the inner text of the web element found by the given locator.
     *
     * @param by the locator strategy to find the web element.
     * @return the inner text of the web element.
     */
    public String getInnerText(By by) {
        return get(by, "innerText");
    }

    /**
     * Gets the title of the web page.
     *
     * @param by the locator strategy to find the web element.
     * @return the title of the web page.
     */
    public String getTitle(By by) {
        return get(by, "title");
    }

    /**
     * Gets the value of the specified attribute of the web element found by the given locator.
     *
     * @param by the locator strategy to find the web element.
     * @param attribute the name of the attribute to retrieve.
     * @return the value of the specified attribute of the web element.
     */
    public String get(By by, String attribute) {
        return ElementFinder.findElement(by).getAttribute(attribute);
    }
}
