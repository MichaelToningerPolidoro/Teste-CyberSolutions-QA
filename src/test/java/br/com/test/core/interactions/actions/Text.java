package br.com.test.core.interactions.actions;

import br.com.test.core.interactions.finder.ElementFinder;
import org.openqa.selenium.By;

/**
 * Utility class for interacting with text input fields on web pages using Selenium WebDriver.
 */
public final class Text {

    /**
     * Enters the specified text into the text input field found by the given locator.
     *
     * @param by the locator strategy to find the text input field.
     * @param text the text to be entered into the input field.
     */
    public void write(By by, String text) {
        ElementFinder.findElement(by).sendKeys(text);
    }


}
