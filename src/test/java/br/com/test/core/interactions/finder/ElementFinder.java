package br.com.test.core.interactions.finder;

import br.com.test.core.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * TODO: javadocs
 * */
public final class ElementFinder {

    /**
     * TODO: javadocs
     * */
    public static WebElement findElement(By by) {
        return DriverManager.getWebDriver().findElement(by);
    }
}
