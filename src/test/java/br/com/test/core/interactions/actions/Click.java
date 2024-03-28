package br.com.test.core.interactions.actions;

import br.com.test.core.interactions.finder.ElementFinder;
import org.openqa.selenium.By;

/**
 * Utility class for performing single click actions on web elements using Selenium WebDriver.
 */
public final class Click {

    /**
     * Performs a single click action on the web element found by the given locator.
     *
     * @param by the locator strategy to find the web element.
     */
    public void singleClick(By by) {
        ElementFinder.findElement(by).click();
    }
}
