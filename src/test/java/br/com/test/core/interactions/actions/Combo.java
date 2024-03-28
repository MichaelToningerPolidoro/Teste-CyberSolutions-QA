package br.com.test.core.interactions.actions;

import org.openqa.selenium.By;

/**
 * Utility class for interacting with combo boxes (dropdowns) on web pages using Selenium WebDriver.
 */
public final class Combo {

    /**
     * Selects an option from the combo box (dropdown) found by the given locator.
     */
    public void select(By selectBy, By optionBy) {
        final Click click = new Click();
        click.singleClick(selectBy);
        click.singleClick(optionBy);
    }
}
