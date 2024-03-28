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
        return get(by, "value");
    }

    /**
     * TODO: javadocs
     * */
    public String getInnerText(By by) {
        return get(by, "innerText");
    }

    /**
     * TODO: javadocs
     * */
    public String getTitle(By by) {
        return get(by, "title");
    }

    /**
     * TODO: javadocs
     * */
    public String get(By by, String attribute) {
        return ElementFinder.findElement(by).getAttribute(attribute);
    }
}
