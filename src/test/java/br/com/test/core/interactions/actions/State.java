package br.com.test.core.interactions.actions;

import br.com.test.core.interactions.finder.ElementFinder;
import org.openqa.selenium.By;

/**
 * Utility class for checking the state of web elements using Selenium WebDriver.
 */
public final class State {

    /**
     * Checks whether the web element found by the given locator is selected.
     *
     * @param by the locator strategy to find the web element.
     * @return true if the web element is selected, false otherwise.
     */
    public boolean isSelected(By by) {
        return ElementFinder.findElement(by).isSelected();
    }
}
