package br.com.test.core.interactions.actions;

import br.com.test.core.driver.DriverManager;
import br.com.test.core.interactions.finder.ElementFinder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

/**
 * TODO: javadocs
 */
public final class JS {

    /**
     * TODO: javadocs
     * @param by
     * @param value
     */
    public void setAttribute(By by, String attribute, Object value) {
        final String script = "arguments[0]." + attribute + " = " + value.toString();
        ((JavascriptExecutor) DriverManager.getWebDriver()).executeScript(script, ElementFinder.findElement(by));
    }
}
