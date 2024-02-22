package br.com.test.core.interactions.actions;

import br.com.test.core.interactions.finder.ElementFinder;
import org.openqa.selenium.By;

/**
 * TODO: javadocs
 * */
public final class Attribute {

    /**
     * TODO: javadocs
     * */
    public String getText(By by) {
        return ElementFinder.findElement(by).getText();
    }
}
