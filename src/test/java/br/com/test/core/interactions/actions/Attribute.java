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
        return getAttribute(by, "value");
    }

    /**
     * TODO: javadocs
     * */
    public String getInnerText(By by) {
        return getAttribute(by, "innerText");
    }

    /**
     * TODO: javadocs
     * */
    public String getTitle(By by) {
        return getAttribute(by, "title");
    }

    /**
     * TODO: javadocs
     * */
    private String getAttribute(By by, String attribute) {
        return ElementFinder.findElement(by).getAttribute(attribute);
    }
}
