package br.com.test.core.interactions.actions;

import br.com.test.core.driver.DriverManager;
import br.com.test.core.interactions.finder.ElementFinder;
import org.openqa.selenium.By;

/**
 * TODO: javadocs
 * */
public final class IFrame {

    /**
     * TODO javadocs
     * */
    public void swithTo(By by) {
        DriverManager.getWebDriver().switchTo().frame(ElementFinder.findElement(by));
    }
}
