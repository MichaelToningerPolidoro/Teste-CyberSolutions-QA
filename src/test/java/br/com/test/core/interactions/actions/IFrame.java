package br.com.test.core.interactions.actions;

import br.com.test.core.driver.DriverManager;
import br.com.test.core.interactions.finder.ElementFinder;
import org.openqa.selenium.By;

/**
 * Utility class for switching focus to iframes on web pages using Selenium WebDriver.
 */
public final class IFrame {

    /**
     * Switches focus to the iframe found by the given locator.
     *
     * @param by the locator strategy to find the iframe.
     */
    public void swithTo(By by) {
        DriverManager.getWebDriver().switchTo().frame(ElementFinder.findElement(by));
    }
}
